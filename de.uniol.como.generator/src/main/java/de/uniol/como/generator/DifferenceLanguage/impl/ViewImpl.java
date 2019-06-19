package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.View;

public class ViewImpl implements View
{
	public String createView(String gDiff_UUID
            , String Visible
            , String Type
            , String Mutable
            , String children
            , String targetEdge
            , String sourceEdge
 ){
        return gDiff_UUID + Visible  + Type  + Mutable  + children  + targetEdge  + sourceEdge ;
    }
	public String changeVisible(String gDiff_UUID, String newVisible) {   
        return gDiff_UUID + ".changeVisible(" + newVisible + ")";
    }
	public String changeType(String gDiff_UUID, String newType) {   
        return gDiff_UUID + ".changeType(" + newType + ")";
    }
	public String changeMutable(String gDiff_UUID, String newMutable) {   
        return gDiff_UUID + ".changeMutable(" + newMutable + ")";
    }
	public String changechildren(String gDiff_UUID, String newchildren) {   
        return gDiff_UUID + ".changechildren(" + newchildren + ")";
    }
	public String changetargetEdge(String gDiff_UUID, String newtargetEdge) {   
        return gDiff_UUID + ".changetargetEdge(" + newtargetEdge + ")";
    }
	public String changesourceEdge(String gDiff_UUID, String newsourceEdge) {   
        return gDiff_UUID + ".changesourceEdge(" + newsourceEdge + ")";
    }
	public String deleteView(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}