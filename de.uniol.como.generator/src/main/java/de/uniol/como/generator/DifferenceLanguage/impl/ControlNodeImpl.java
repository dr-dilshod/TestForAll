package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ControlNode;

public class ControlNodeImpl implements ControlNode
{
	public String createControlNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteControlNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}