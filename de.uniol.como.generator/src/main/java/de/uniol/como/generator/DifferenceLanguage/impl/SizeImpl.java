package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Size;

public class SizeImpl implements Size
{
	public String createSize(String gDiff_UUID
            , String Width
            , String Height
 ){
        return gDiff_UUID + Width  + Height ;
    }
	public String changeWidth(String gDiff_UUID, String newWidth) {   
        return gDiff_UUID + ".changeWidth(" + newWidth + ")";
    }
	public String changeHeight(String gDiff_UUID, String newHeight) {   
        return gDiff_UUID + ".changeHeight(" + newHeight + ")";
    }
	public String deleteSize(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}