package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Location;

public class LocationImpl implements Location
{
	public String createLocation(String gDiff_UUID
            , String X
            , String U
 ){
        return gDiff_UUID + X  + U ;
    }
	public String changeX(String gDiff_UUID, String newX) {   
        return gDiff_UUID + ".changeX(" + newX + ")";
    }
	public String changeU(String gDiff_UUID, String newU) {   
        return gDiff_UUID + ".changeU(" + newU + ")";
    }
	public String deleteLocation(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}