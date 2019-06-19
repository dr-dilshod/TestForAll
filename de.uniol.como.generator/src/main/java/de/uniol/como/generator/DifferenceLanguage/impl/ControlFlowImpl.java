package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ControlFlow;

public class ControlFlowImpl implements ControlFlow
{
	public String createControlFlow(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteControlFlow(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}