package de.uniol.como.generator.DifferenceLanguage;

public interface ActivityEdge {
	public String createActivityEdge(String gDiff_UUID
        	, String target
        	, String source
        );
	public String changetarget(String gDiff_UUID, String newtarget);
	public String changesource(String gDiff_UUID, String newsource);
	public String deleteActivityEdge(String gDiff_UUID);
}