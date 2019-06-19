package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.JoinNode;

public class JoinNodeImpl implements JoinNode
{
	public String createJoinNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteJoinNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}