package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.RelativeBendpoints;

public class RelativeBendpointsImpl implements RelativeBendpoints
{
	public String createRelativeBendpoints(String gDiff_UUID
            , String Points
 ){
        return gDiff_UUID + Points ;
    }
	public String changePoints(String gDiff_UUID, String newPoints) {   
        return gDiff_UUID + ".changePoints(" + newPoints + ")";
    }
	public String deleteRelativeBendpoints(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}