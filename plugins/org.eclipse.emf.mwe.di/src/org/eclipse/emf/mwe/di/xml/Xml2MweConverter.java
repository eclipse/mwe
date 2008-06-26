package org.eclipse.emf.mwe.di.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.mwe.Assignable;
import org.eclipse.emf.mwe.Assignment;
import org.eclipse.emf.mwe.ComplexValue;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.IdRef;
import org.eclipse.emf.mwe.MweFactory;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.Value;
import org.eclipse.emf.mwe.WorkflowRef;
import org.eclipse.emf.mwe.di.MweUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Xml2MweConverter {

	private static final String ORG_ECLIPSE_MWE_WORKFLOW =
			"org.eclipse.mwe.Workflow";

	private static final String VALUE = "value";

	private static final String ID_REF = "idRef";

	private static final String FILE = "file";

	private static final Set<String> RESERVED_ATTRS = new HashSet<String>();

	private static final String CLASS = "class";

	private static final String ID = "id";

	private static final String PROPERTY = "property";

	private static final Set<String> RESERVED_ELES = new HashSet<String>();

	private static final short[] RELEVANT_TYPES =
			{ Node.ATTRIBUTE_NODE, Node.ELEMENT_NODE };

	static {
		RESERVED_ATTRS.add(VALUE);
		RESERVED_ATTRS.add(ID_REF);
		RESERVED_ATTRS.add(FILE);
		RESERVED_ATTRS.add(CLASS);
		RESERVED_ATTRS.add(ID);
	}

	static {
		RESERVED_ELES.add(PROPERTY);
	}

	private final MweFactory f = MweFactory.eINSTANCE;

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

	private void addToValue(final Assignable assignableValue,
			final EList<Assignment> assignments) {
		if (assignableValue == null) {
			throw new IllegalArgumentException();
		}

		if (assignments == null)
			return;

		assignableValue.getAssignments().addAll(assignments);
	}

	private Assignment createAssignment(final Node item) {
		if (item.getNodeType() == Node.ATTRIBUTE_NODE) {
			if (RESERVED_ATTRS.contains(item.getNodeName()))
				return null;
			final Assignment a = f.createAssignment();
			a.setFeature(item.getNodeName());
			final SimpleValue sv = f.createSimpleValue();
			sv.setValue(item.getNodeValue());
			a.setValue(sv);
			return a;
		} else if (item.getNodeType() == Node.ELEMENT_NODE) {
			if (RESERVED_ELES.contains(item.getNodeName()))
				return null;
			final Assignment a = f.createAssignment();
			a.setFeature(item.getNodeName());
			a.setValue(createValue((Element) item));
			return a;
		}
		throw new IllegalArgumentException(item.toString());
	}

	private File createFile(final Document document) {
		final File file = f.createFile();
		final ComplexValue val =
				(ComplexValue) createValue(document.getDocumentElement());
		if (val.getClassName() == null) {
			val
					.setClassName(MweUtil
							.toQualifiedName(ORG_ECLIPSE_MWE_WORKFLOW));
		}
		file.setValue(val);
		return file;
	}

	private Value createValue(final Element item) {
		EList<Assignment> assignments = null;

		if (item.getAttribute(VALUE).length() > 0) {
			final SimpleValue s = f.createSimpleValue();
			s.setValue(item.getAttribute(VALUE));
			return s;
		} else if (item.getAttribute(ID_REF).length() > 0) {
			final IdRef ref = f.createIdRef();
			ref.setId(item.getAttribute(ID_REF));
			return ref;
		} else if (item.getAttribute(FILE).length() > 0) {
			final WorkflowRef wf = f.createWorkflowRef();
			wf.setUri(item.getAttribute(FILE));
			final NamedNodeMap attributes = item.getAttributes();
			assignments = getAssignments(attributes);
			addToValue(wf, assignments);

			final NodeList childNodes = item.getChildNodes();
			assignments = getAssignments(childNodes);
			addToValue(wf, assignments);
			return wf;
		} else {
			final ComplexValue complexVal = f.createComplexValue();
			complexVal.setClassName(MweUtil.toQualifiedName(item
					.getAttribute(CLASS)));
			complexVal.setId(item.getAttribute(ID));
			final NamedNodeMap attributes = item.getAttributes();
			assignments = getAssignments(attributes);
			addToValue(complexVal, assignments);

			final NodeList childNodes = item.getChildNodes();
			assignments = getAssignments(childNodes);
			addToValue(complexVal, assignments);
			return complexVal;
		}
	}

	private EList<Assignment> getAssignments(final NamedNodeMap nodes) {
		if (nodes == null)
			return null;

		final EList<Assignment> assignments = new BasicEList<Assignment>();
		for (int i = 0; i < nodes.getLength(); i++) {
			final Node child = nodes.item(i);
			if (isRelevantNode(child)) {
				final Assignment a = createAssignment(nodes.item(i));
				if (a != null) {
					assignments.add(a);
				}
			}
		}
		return assignments;
	}

	private EList<Assignment> getAssignments(final NodeList nodes) {
		if (nodes == null)
			return null;

		final EList<Assignment> assignments = new BasicEList<Assignment>();
		for (int i = 0; i < nodes.getLength(); i++) {
			final Node child = nodes.item(i);
			if (isRelevantNode(child)) {
				final Assignment a = createAssignment(nodes.item(i));
				if (a != null) {
					assignments.add(a);
				}
			}
		}
		return assignments;
	}

	private boolean isRelevantNode(final Node child) {
		if (child == null)
			return false;

		for (final short type : RELEVANT_TYPES) {
			if (child.getNodeType() == type)
				return true;
		}
		return false;
	}
}
