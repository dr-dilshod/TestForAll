package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Activity;

public class ActivityImpl implements Activity
{
	public String createActivity(String gDiff_UUID
            , String activityedge
            , String activitynode
 ){
        return gDiff_UUID + activityedge  + activitynode ;
    }
	public String changeactivityedge(String gDiff_UUID, String newactivityedge) {   
        return gDiff_UUID + ".changeactivityedge(" + newactivityedge + ")";
    }
	public String changeactivitynode(String gDiff_UUID, String newactivitynode) {   
        return gDiff_UUID + ".changeactivitynode(" + newactivitynode + ")";
    }
	public String deleteActivity(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}