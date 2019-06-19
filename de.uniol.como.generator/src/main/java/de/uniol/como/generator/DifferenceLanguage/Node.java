package de.uniol.como.generator.DifferenceLanguage;

public interface Node {
	public String createNode(String gDiff_UUID
        	, String constrainLayout
        	, String element
        );
	public String changeconstrainLayout(String gDiff_UUID, String newconstrainLayout);
	public String changeelement(String gDiff_UUID, String newelement);
	public String deleteNode(String gDiff_UUID);
}