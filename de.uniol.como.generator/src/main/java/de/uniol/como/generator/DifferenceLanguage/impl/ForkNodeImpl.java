package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ForkNode;

public class ForkNodeImpl implements ForkNode
{
	public String createForkNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteForkNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}