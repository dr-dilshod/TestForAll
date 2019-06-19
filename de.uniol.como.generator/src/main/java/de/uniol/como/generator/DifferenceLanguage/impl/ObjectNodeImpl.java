package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ObjectNode;

public class ObjectNodeImpl implements ObjectNode
{
	public String createObjectNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteObjectNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}