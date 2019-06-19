package de.uniol.como.generator.DifferenceLanguage;

public interface ActivityNode {
	public String createActivityNode(String gDiff_UUID
        	, String outgoing
        	, String incoming
        );
	public String changeoutgoing(String gDiff_UUID, String newoutgoing);
	public String changeincoming(String gDiff_UUID, String newincoming);
	public String deleteActivityNode(String gDiff_UUID);
}