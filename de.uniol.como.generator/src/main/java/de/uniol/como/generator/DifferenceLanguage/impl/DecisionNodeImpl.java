package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.DecisionNode;

public class DecisionNodeImpl implements DecisionNode
{
	public String createDecisionNode(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteDecisionNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}