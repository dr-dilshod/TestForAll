package de.uniol.como.generator.DifferenceLanguage;

public interface Activity {
	public String createActivity(String gDiff_UUID
        	, String activityedge
        	, String activitynode
        );
	public String changeactivityedge(String gDiff_UUID, String newactivityedge);
	public String changeactivitynode(String gDiff_UUID, String newactivitynode);
	public String deleteActivity(String gDiff_UUID);
}