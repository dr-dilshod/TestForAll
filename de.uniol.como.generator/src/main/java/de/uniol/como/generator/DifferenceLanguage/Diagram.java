package de.uniol.como.generator.DifferenceLanguage;

public interface Diagram {
	public String createDiagram(String gDiff_UUID
        	, String Name
        	, String view
        );
	public String changeName(String gDiff_UUID, String newName);
	public String changeview(String gDiff_UUID, String newview);
	public String deleteDiagram(String gDiff_UUID);
}