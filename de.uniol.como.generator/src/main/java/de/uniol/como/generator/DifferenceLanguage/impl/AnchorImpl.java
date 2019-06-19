package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Anchor;

public class AnchorImpl implements Anchor
{
	public String createAnchor(String gDiff_UUID
 ){
        return gDiff_UUID;
    }
	public String deleteAnchor(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}