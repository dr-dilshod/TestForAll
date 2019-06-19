package de.uniol.como.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * This class imports given meta-models e.g. TGraphClass meta-models and UML
 * standard profiles
 * 
 * @author dilshod
 *
 */
public class MetaModelImporter {

	final static Logger LOG = Logger.getLogger(MetaModelImporter.class.getName());

	public List<NamedElement> importMetaModel(String metamodelPath) {
		
		List<NamedElement> modelingArtifact = new ArrayList<>();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
		Map uriMap = resourceSet.getURIConverter().getURIMap();
		URI uri = URI.createURI(metamodelPath);
		// uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),
		// uri.appendSegment("libraries").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));

		LOG.info("[readMM] : try to access to " + UMLResource.UML_METAMODEL_URI);
		Resource res = resourceSet.getResource(URI.createURI(UMLResource.UML_METAMODEL_URI), true);
		// ----------------------
		EList<EObject> lst = res.getContents();

		ModelImpl model = (ModelImpl) lst.get(0);
		Model root = model.getModel();
		EList<NamedElement> elements = root.getMembers();
		LOG.info("Fetching modeling artifacts from the given meta-model ...");
//		==== These are meta-classes ======
		for (Element el : elements) {
			NamedElement named = (NamedElement) el;
			if ((root.getName().equals("uml")) && (named instanceof org.eclipse.uml2.uml.Class))
//				System.out.println(
//						named.getName() + " has " + named.eClass().getEAllAttributes().size() + " attributes!");
			modelingArtifact.add(named);
		}

//		==== These are meta-associations ======
//		for (Element el : elements) {
//			NamedElement named = (NamedElement) el;
//			if (named instanceof org.eclipse.uml2.uml.Association)
//				System.out.println(named.getName() + " connects " + named.getOwner().eClass().getName() + " and "
//						+ named.getOwnedElements().size());
//		}
		return modelingArtifact;
	}
	public Resource importMetamodelFromEcore(String metamodelPath) {

		ResourceSet resourceSet = new ResourceSetImpl();

		EPackage.Registry reg1;
		reg1 = resourceSet.getPackageRegistry();
		reg1.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

		XMIResourceFactoryImpl xmiFactory = new XMIResourceFactoryImpl();
		EcoreResourceFactoryImpl ecoreFactory = new EcoreResourceFactoryImpl();
		
		Map<String, Object> options = resourceSet.getResourceFactoryRegistry()
		.getExtensionToFactoryMap();

		// Register the appropriate resource factory to handle all file
		// extensions.
		options.put("xmi", xmiFactory);
		options.put("ecore", ecoreFactory);

		URI uri = URI.createFileURI(metamodelPath);

		Resource resource = resourceSet.getResource(uri, true);
		
		LOG.info("[readMM] : try to access to " + resource);
		// ----------------------
		List<EObject> elements = new ArrayList<>();
		LOG.info("[readMM] : fetching all elements from the resource: " + resource);
		for (final TreeIterator<EObject> root = resource.getAllContents(); root.hasNext();) {
			EObject rest = root.next();
			if (rest instanceof EClass) {
//				System.out.println("eobject === " + rest.eGet(rest.eClass().getEStructuralFeature("name")));
//				for (EStructuralFeature feature : ((EClass) rest).getEAllReferences()) {
//					System.out.println("EReferences === " + feature.getName());
//				}
//				for (EStructuralFeature feature : ((EClass) rest).getEAllAttributes()) {
//					System.out.println("EAttributes === " + feature.getName());
//				}

				elements.add(rest);
			}
		}
		return resource;
	}
}
