package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.OpaqueAction;

public class OpaqueActionImpl implements OpaqueAction
{
	public String createOpaqueAction(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteOpaqueAction(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}