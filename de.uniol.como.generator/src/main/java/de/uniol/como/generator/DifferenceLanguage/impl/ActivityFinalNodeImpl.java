package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ActivityFinalNode;

public class ActivityFinalNodeImpl implements ActivityFinalNode
{
	public String createActivityFinalNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteActivityFinalNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}