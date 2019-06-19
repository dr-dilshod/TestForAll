package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ObjectFlow;

public class ObjectFlowImpl implements ObjectFlow
{
	public String createObjectFlow(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteObjectFlow(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}