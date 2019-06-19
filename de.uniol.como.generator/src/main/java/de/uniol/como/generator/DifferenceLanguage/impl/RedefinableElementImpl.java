package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.RedefinableElement;

public class RedefinableElementImpl implements RedefinableElement
{
	public String createRedefinableElement(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteRedefinableElement(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}