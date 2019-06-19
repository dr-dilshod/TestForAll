package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.LayoutConstraint;

public class LayoutConstraintImpl implements LayoutConstraint
{
	public String createLayoutConstraint(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteLayoutConstraint(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}