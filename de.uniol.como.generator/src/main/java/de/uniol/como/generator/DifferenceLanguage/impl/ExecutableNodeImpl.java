package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ExecutableNode;

public class ExecutableNodeImpl implements ExecutableNode
{
	public String createExecutableNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteExecutableNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}