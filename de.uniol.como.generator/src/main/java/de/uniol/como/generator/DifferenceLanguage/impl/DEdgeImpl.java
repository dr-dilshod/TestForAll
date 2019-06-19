package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.DEdge;

public class DEdgeImpl implements DEdge
{
	public String createDEdge(String gDiff_UUID
            , String target
 ){
        return gDiff_UUID + target ;
    }
	public String changetarget(String gDiff_UUID, String newtarget) {   
        return gDiff_UUID + ".changetarget(" + newtarget + ")";
    }
	public String deleteDEdge(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}