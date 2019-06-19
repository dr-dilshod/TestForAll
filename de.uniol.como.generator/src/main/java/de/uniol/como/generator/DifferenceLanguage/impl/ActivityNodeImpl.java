package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.ActivityNode;

public class ActivityNodeImpl implements ActivityNode
{
	public String createActivityNode(String gDiff_UUID
            , String outgoing
            , String incoming
 ){
        return gDiff_UUID + outgoing  + incoming ;
    }
	public String changeoutgoing(String gDiff_UUID, String newoutgoing) {   
        return gDiff_UUID + ".changeoutgoing(" + newoutgoing + ")";
    }
	public String changeincoming(String gDiff_UUID, String newincoming) {   
        return gDiff_UUID + ".changeincoming(" + newincoming + ")";
    }
	public String deleteActivityNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}