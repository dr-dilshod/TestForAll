package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Edge;

public class EdgeImpl implements Edge
{
	public String createEdge(String gDiff_UUID
            , String edge
            , String target
            , String source
            , String sourceAnchor
            , String targetAnchor
            , String element
 ){
        return gDiff_UUID + edge  + target  + source  + sourceAnchor  + targetAnchor  + element ;
    }
	public String changeedge(String gDiff_UUID, String newedge) {   
        return gDiff_UUID + ".changeedge(" + newedge + ")";
    }
	public String changetarget(String gDiff_UUID, String newtarget) {   
        return gDiff_UUID + ".changetarget(" + newtarget + ")";
    }
	public String changesource(String gDiff_UUID, String newsource) {   
        return gDiff_UUID + ".changesource(" + newsource + ")";
    }
	public String changesourceAnchor(String gDiff_UUID, String newsourceAnchor) {   
        return gDiff_UUID + ".changesourceAnchor(" + newsourceAnchor + ")";
    }
	public String changetargetAnchor(String gDiff_UUID, String newtargetAnchor) {   
        return gDiff_UUID + ".changetargetAnchor(" + newtargetAnchor + ")";
    }
	public String changeelement(String gDiff_UUID, String newelement) {   
        return gDiff_UUID + ".changeelement(" + newelement + ")";
    }
	public String deleteEdge(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}