package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Bendpoints;

public class BendpointsImpl implements Bendpoints
{
	public String createBendpoints(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteBendpoints(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}