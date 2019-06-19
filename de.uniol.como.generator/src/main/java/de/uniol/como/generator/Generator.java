package de.uniol.como.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;

/**
 * This is the main service called DL generator which generates DL
 * @author dilshod
 *
 */
public class Generator {
    private final String packagePath = "src/main/java/de/uniol/como/generator/DifferenceLanguage";
    private final String importPath = "de.uniol.como.generator.DifferenceLanguage";
    private final String implPath = packagePath + "/impl";
    private final String factoryPath = packagePath + "/factory";

    private static final String interfaceTemplate = "src/main/resources/templates/DLInterfaceTemplate.vm";
    private static final String implementationTemplate = "src/main/resources/templates/DLImplementationTemplate.vm";
    private static final String factoryTemplate = "src/main/resources/templates/DLFactoryTemplate.vm";

    final static Logger LOG = Logger.getLogger(Generator.class.getName());

    public static VelocityEngine velocityEngine;

    public void generate(String metamodelPath) throws IOException, NoSuchFieldException, SecurityException {
    	// initialize velocity templates for DL generation
    	LOG.info("Initializing templates ...");
		velocityEngine = new VelocityEngine();
		velocityEngine.init();
		
		LOG.info("Importing meta-model ...");
        MetaModelImporter importer = new MetaModelImporter();
        Resource resource = importer.importMetamodelFromEcore(metamodelPath);

        // creating packages 
        createPackages();
        
        // generating interfaces
        generateInterfaces(resource);
        
        // generating implementations 
        generateImplementations(resource);
    }
    
    /**
     * This method creates packages for creating interfaces, implementations and adapter factory
     * @param path
     */
    private void createPackages()
    {
		File interfacePackage = new File(packagePath);
		LOG.info("Creating packages ...");
		if (!interfacePackage.exists()) {
			interfacePackage.mkdir();
			File impl = new File(implPath);
			impl.mkdir();
			File factory = new File(factoryPath);
			factory.mkdir();
		} else {
			interfacePackage.delete();
			interfacePackage.mkdir();
			File impl = new File(implPath);
			impl.mkdir();
			File factory = new File(factoryPath);
			factory.mkdir();		}
		LOG.info("Package creation finished!");
    }
    
    /**
     * This method generates interfaces
     * @param vcList
     * @param intPackage
     * @throws IOException
     * @throws SecurityException 
     * @throws NoSuchFieldException 
     */
    private void generateInterfaces(Resource resource) throws IOException, NoSuchFieldException, SecurityException {
    	LOG.info("Generating interfaces ... ");
    	Template intTemplate = velocityEngine.getTemplate(interfaceTemplate);
		VelocityContext velocityContext = new VelocityContext();
		File intPackage = new File(packagePath);
		String newIntPackage = packagePath.replace("/", ".");
		velocityContext.put("package_name", newIntPackage);
		ArrayList importList = new ArrayList();
		importList.add("");
		// velocityContext.put("importList", importList);
		for (final TreeIterator<EObject> root = resource.getAllContents(); root.hasNext();) {
			EObject rest = root.next();
			if (rest instanceof EClass) {
				FileWriter fw = null;
				File vertexFile = null;
				List<String> attrList = new ArrayList();
				vertexFile = new File(intPackage + "/" + rest.eGet(rest.eClass().getEStructuralFeature("name")) + ".java");
				velocityContext.put("interface_name", rest.eGet(rest.eClass().getEStructuralFeature("name")));
				velocityContext.put("model_element", rest.eGet(rest.eClass().getEStructuralFeature("name")));
				for (EStructuralFeature attribute : ((EClass) rest).getEAttributes()){
					if (!attribute.getName().equals("id")) {
						attrList.add(attribute.getName().substring(0, 1).toUpperCase() + attribute.getName().substring(1));
					}
				}
				for (EStructuralFeature reference : ((EClass)rest).getEReferences()) {
						attrList.add(reference.getName());
				}
				velocityContext.put("attrList", attrList);
				Writer stringWriter = new StringWriter();
				intTemplate.merge(velocityContext, stringWriter);
				try {
					fw = new FileWriter(vertexFile);
				} catch (IOException ex) {
					Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
				}
				fw.write(stringWriter.toString());
				fw.close();
			}
		}
		LOG.info("Interface generation finished!");
    }
    /**
     * This method generates implementations of DL language
     * @param vcList
     * @param intPackage
     * @throws IOException
     */
    private void generateImplementations(Resource resource) throws IOException {
    	LOG.info("Generating implementations ...");
        Template implTemplate = velocityEngine.getTemplate(implementationTemplate);
        VelocityContext velocityContext = new VelocityContext();
        File intPackage = new File(packagePath + "/impl");
        String newIntPackage = packagePath.toString().replace("/", ".");
        velocityContext.put("package_name", newIntPackage);
        ArrayList importList = new ArrayList();
        importList.add("");
        // velocityContext.put("importList", importList);
        for (final TreeIterator<EObject> root = resource.getAllContents(); root.hasNext();) {
			EObject rest = root.next();
			if (rest instanceof EClass) {
		            FileWriter fw = null;
		            File vertexFile = null;
		                List attrList = new ArrayList();
		                vertexFile = new File(intPackage + "/" + rest.eGet(rest.eClass().getEStructuralFeature("name")) + "Impl.java");
		                
		                velocityContext.put("import_part", "import " + importPath + "." + rest.eGet(rest.eClass().getEStructuralFeature("name")));
		                
		                velocityContext.put("class_name", rest.eGet(rest.eClass().getEStructuralFeature("name")) + "Impl");
		                velocityContext.put("interface_name", rest.eGet(rest.eClass().getEStructuralFeature("name")));
		                
		                velocityContext.put("model_element", rest.eGet(rest.eClass().getEStructuralFeature("name")));
		                for (EStructuralFeature attr : ((EClass) rest).getEAttributes()) {
		                    if (!attr.getName().equals("id")) {
		                        attrList.add(attr.getName().substring(0, 1).toUpperCase() + attr.getName().substring(1));
		                    }
		                }
		                for (EStructuralFeature reference : ((EClass) rest).getEReferences()) {
		                    attrList.add(reference.getName());
		                }
		                velocityContext.put("attrList", attrList);
		                Writer stringWriter = new StringWriter();
		                implTemplate.merge(velocityContext, stringWriter);
		                try {
		                    fw = new FileWriter(vertexFile);
		                } catch (IOException ex) {
		                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
		                }
		                fw.write(stringWriter.toString());
		                fw.close();
		            }
		        }
        LOG.info("Implementation generation finished!");
    }
    /**
     * This method generates factory for DL
     * @param vcList
     * @param intPackage
     * @throws IOException
     */
    private void generateFactory(Resource resource, File intPackage) throws IOException {
    	LOG.info("Generating factory ...");
        Template facTemplate = velocityEngine.getTemplate(factoryTemplate);
        VelocityContext velocityContext = new VelocityContext();
        String newIntPackage = intPackage.toString().replace("/", ".");
        velocityContext.put("package_name", newIntPackage);
        ArrayList importList = new ArrayList();
        importList.add("");
        // velocityContext.put("importList", importList);
        for (final TreeIterator<EObject> root = resource.getAllContents(); root.hasNext();) {
			EObject rest = root.next();
			if (rest instanceof EClass) {
            FileWriter fw = null;
            File vertexFile = null;
                List attrList = new ArrayList();
                vertexFile = new File(intPackage + "/" + rest.eGet(rest.eClass().getEStructuralFeature("name")) + ".java");
                velocityContext.put("interface_name", rest.eGet(rest.eClass().getEStructuralFeature("name")));
                velocityContext.put("model_element", rest.eGet(rest.eClass().getEStructuralFeature("name")));
                for (EStructuralFeature attr : ((EClass) rest).getEAttributes()) {
                    if (!attr.getName().equals("id")) {
                        attrList.add(attr.getName().substring(0, 1).toUpperCase() + attr.getName().substring(1));
                    }
                }
                for (EStructuralFeature ec : ((EClass) rest).getEReferences()) {
                    attrList.add(ec.getName());
                }
                velocityContext.put("attrList", attrList);
                Writer stringWriter = new StringWriter();
                facTemplate.merge(velocityContext, stringWriter);
                try {
                    fw = new FileWriter(vertexFile);
                } catch (IOException ex) {
                    Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null, ex);
                }
                fw.write(stringWriter.toString());
                fw.close();
            }
        }
    }    
}
