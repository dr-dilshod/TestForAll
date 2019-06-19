package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ActivityEdge;

public class ActivityEdgeImpl implements ActivityEdge
{
	public String createActivityEdge(String gDiff_UUID
            , String target
            , String source
 ){
        return gDiff_UUID + target  + source ;
    }
	public String changetarget(String gDiff_UUID, String newtarget) {   
        return gDiff_UUID + ".changetarget(" + newtarget + ")";
    }
	public String changesource(String gDiff_UUID, String newsource) {   
        return gDiff_UUID + ".changesource(" + newsource + ")";
    }
	public String deleteActivityEdge(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}