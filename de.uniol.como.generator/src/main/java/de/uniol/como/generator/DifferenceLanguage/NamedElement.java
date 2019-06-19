package de.uniol.como.generator.DifferenceLanguage;

public interface NamedElement {
	public String createNamedElement(String gDiff_UUID
        	, String Name
        );
	public String changeName(String gDiff_UUID, String newName);
	public String deleteNamedElement(String gDiff_UUID);
}