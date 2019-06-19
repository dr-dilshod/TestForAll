package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Ration;

public class RationImpl implements Ration
{
	public String createRation(String gDiff_UUID
            , String V
 ){
        return gDiff_UUID + V ;
    }
	public String changeV(String gDiff_UUID, String newV) {   
        return gDiff_UUID + ".changeV(" + newV + ")";
    }
	public String deleteRation(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}