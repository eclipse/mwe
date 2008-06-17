package org.eclipse.emf.mwe.di.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
	private static final String ORG_ECLIPSE_MWE_WORKFLOW = "org.eclipse.mwe.Workflow";
	private static final String VALUE = "value";
	private static final String ID_REF = "idRef";
	private static final String FILE = "file";
	private static final Set<String> RESERVED_ATTRS = new HashSet<String>();
	private static final String CLASS = "class";
	private static final String ID = "id";
	private static final String PROPERTY = "property";
	private static final Set<String> RESERVED_ELES = new HashSet<String>();

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

	private MweFactory f = MweFactory.eINSTANCE;

	public File fromXML(InputStream in) {
		Document document;
		try {
			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(in);
		} catch (Exception e) {
			throw new WrappedException(e);
		}
		return createFile(document);
	}

	private File createFile(Document document) {
		File file = f.createFile();
		ComplexValue val = (ComplexValue) createValue(document.getDocumentElement());
		if (val.getClassName()==null)
			val.setClassName(MweUtil.toQualifiedName(ORG_ECLIPSE_MWE_WORKFLOW));
		file.setValue(val);
		return file;
	}

	private Value createValue(Element item) {
		if (item.getAttribute(VALUE).length()>0) {
			SimpleValue s = f.createSimpleValue();
			s.setValue(item.getAttribute(VALUE));
			return s;
		} else if (item.getAttribute(ID_REF).length()>0) {
			IdRef ref = f.createIdRef();
			ref.setId(item.getAttribute(ID_REF));
			return ref;
		} else if (item.getAttribute(FILE).length()>0) {
			WorkflowRef wf = f.createWorkflowRef();
			wf.setUri(item.getAttribute(FILE));
			NamedNodeMap attributes = item.getAttributes();
			for (int i = 0; i < attributes.getLength(); i++) {
				Assignment a = createAssignment(attributes.item(i));
				if (a != null)
					wf.getAssignments().add(a);
			}
			NodeList childNodes = item.getChildNodes();
			for (int i = 0; i < childNodes.getLength(); i++) {
				Assignment a = createAssignment(childNodes.item(i));
				if (a != null)
					wf.getAssignments().add(a);
			}
			return wf;
		} else {
			ComplexValue complexVal = f.createComplexValue();
			complexVal.setClassName(MweUtil.toQualifiedName(item.getAttribute(CLASS)));
			complexVal.setId(item.getAttribute(ID));
			NamedNodeMap attributes = item.getAttributes();
			for (int i = 0; i < attributes.getLength(); i++) {
				Assignment a = createAssignment(attributes.item(i));
				if (a != null)
					complexVal.getAssignments().add(a);
			}
			NodeList childNodes = item.getChildNodes();
			for (int i = 0; i < childNodes.getLength(); i++) {
				Assignment a = createAssignment(childNodes.item(i));
				if (a != null)
					complexVal.getAssignments().add(a);
			}
			return complexVal;
		}
	}

	private Assignment createAssignment(Node item) {
		if (item.getNodeType() == Node.ATTRIBUTE_NODE) {
			if (RESERVED_ATTRS.contains(item.getNodeName()))
				return null;
			Assignment a = f.createAssignment();
			a.setFeature(item.getNodeName());
			SimpleValue sv = f.createSimpleValue();
			sv.setValue(item.getNodeValue());
			a.setValue(sv);
			return a;
		} else if (item.getNodeType() == Node.ELEMENT_NODE) {
			if (RESERVED_ELES.contains(item.getNodeName()))
				return null;
			Assignment a = f.createAssignment();
			a.setFeature(item.getNodeName());
			a.setValue(createValue((Element) item));
			return a;
		}
		throw new IllegalArgumentException(item.toString());
	}

	@SuppressWarnings("unchecked")
	public static String toString(EObject o) {
		if (o==null)
			return "<NULL/>";
		StringBuffer buff = new StringBuffer();
		buff.append("<" + o.eClass().getName());
		for (EAttribute f : o.eClass().getEAllAttributes()) {
			Collection<Object> all = new ArrayList<Object>();
			if (f.isMany()) {
				all.addAll((Collection) o.eGet(f));
			} else {
				all.add(o.eGet(f));
			}
			for (Object object : all) {
				buff.append(" ").append(f.getName()).append("=").append("'").append(object).append("'");
			}
		}
		buff.append(">");
		for (EReference r : o.eClass().getEAllReferences()) {
			Collection<Object> all = new ArrayList<Object>();
			if (r.isMany()) {
				all.addAll((Collection) o.eGet(r));
			} else {
				all.add(o.eGet(r));
			}
			for (Object object : all) {
				buff.append(toString((EObject) object));
			}
		}
		buff.append("</" + o.eClass().getName() + ">");
		return buff.toString();
	}
}
