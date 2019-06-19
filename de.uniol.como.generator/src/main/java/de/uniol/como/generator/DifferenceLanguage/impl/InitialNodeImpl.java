package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.InitialNode;

public class InitialNodeImpl implements InitialNode
{
	public String createInitialNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteInitialNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}