package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.DNode;

public class DNodeImpl implements DNode
{
	public String createDNode(String gDiff_UUID
            , String target
 ){
        return gDiff_UUID + target ;
    }
	public String changetarget(String gDiff_UUID, String newtarget) {   
        return gDiff_UUID + ".changetarget(" + newtarget + ")";
    }
	public String deleteDNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}