package de.uniol.como.generator;

import java.io.IOException;

public class GeneratorRunner {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IOException {
		System.out.println("Hello World");
		String modelPath = "/Users/backup/Desktop/dilshod/gitlabRepo/differenceLanguage/de.uniol.como.generator/metamodels/comometamodel.ecore";
		MetaModelImporter importer = new MetaModelImporter();
		importer.importMetamodelFromEcore(modelPath);
		Generator gen = new Generator();
		gen.generate(modelPath);
	}

}
