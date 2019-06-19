package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.MergeNode;

public class MergeNodeImpl implements MergeNode
{
	public String createMergeNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteMergeNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}