package org.eclipse.emf.mwe.di.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.MweFactory;
import org.eclipse.emf.mwe.Property;
import org.eclipse.emf.mwe.Value;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.xml.conversion.impl.PropertyConverter;
import org.eclipse.emf.mwe.di.xml.conversion.impl.ValueConverter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Xml2MweConverter {

	private static final String ORG_ECLIPSE_MWE_WORKFLOW =
			"org.eclipse.mwe.Workflow";

	public static final String NAME = "name";

	public static final String VALUE = "value";

	public static final String ID_REF = "idRef";

	public static final String FILE = "file";

	public static final String CLASS = "class";

	public static final String ID = "id";

	public static final String PROPERTY = "property";

	private static final MweFactory FACTORY = MweFactory.eINSTANCE;

	@SuppressWarnings("unchecked")
	public static String toString(final EObject o) {
		if (o == null)
			return "<NULL/>";
		final StringBuffer buff = new StringBuffer();
		buff.append("<" + o.eClass().getName());
		for (final EAttribute f : o.eClass().getEAllAttributes()) {
			final Collection<Object> all = new ArrayList<Object>();
			if (f.isMany()) {
				all.addAll((Collection) o.eGet(f));
			} else {
				all.add(o.eGet(f));
			}
			for (final Object object : all) {
				buff.append(" ").append(f.getName()).append("=").append("'")
						.append(object).append("'");
			}
		}
		buff.append(">");
		for (final EReference r : o.eClass().getEAllReferences()) {
			final Collection<Object> all = new ArrayList<Object>();
			if (r.isMany()) {
				all.addAll((Collection) o.eGet(r));
			} else {
				all.add(o.eGet(r));
			}
			for (final Object object : all) {
				buff.append(toString((EObject) object));
			}
		}
		buff.append("</" + o.eClass().getName() + ">");
		return buff.toString();
	}

	public File fromXML(final InputStream in) {
		Document document;
		try {
			document =
					DocumentBuilderFactory.newInstance().newDocumentBuilder()
							.parse(in);
		} catch (final Exception e) {
			throw new WrappedException(e);
		}
		return createFile(document);
	}

	private void addProperties(final File file,
			final EList<EObject> propertyCollection) {
		final EList<Property> properties = file.getProperties();
		for (final EObject obj : propertyCollection) {
			final Property property = (Property) obj;
			properties.add(property);
		}
	}

	private File createFile(final Document document) {
		final File file = FACTORY.createFile();
		final ComplexValue val =
				(ComplexValue) createValue(file, document.getDocumentElement());
		if (val.getClassName() == null) {
			val
					.setClassName(MweUtil
							.toQualifiedName(ORG_ECLIPSE_MWE_WORKFLOW));
		}
		file.setValue(val);
		return file;
	}

	private Value createValue(final File file, final Element item) {
		final ValueConverter valueConverter = new ValueConverter();
		final EList<EObject> propertyCollection = new BasicEList<EObject>();
		final PropertyConverter propertyConverter =
				new PropertyConverter(propertyCollection);
		final Value value = (Value) valueConverter.create(item);
		propertyConverter.inject(item);
		addProperties(file, propertyCollection);
		return value;
	}
}
