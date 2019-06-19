package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Node;

public class NodeImpl implements Node
{
	public String createNode(String gDiff_UUID
            , String constrainLayout
            , String element
 ){
        return gDiff_UUID + constrainLayout  + element ;
    }
	public String changeconstrainLayout(String gDiff_UUID, String newconstrainLayout) {   
        return gDiff_UUID + ".changeconstrainLayout(" + newconstrainLayout + ")";
    }
	public String changeelement(String gDiff_UUID, String newelement) {   
        return gDiff_UUID + ".changeelement(" + newelement + ")";
    }
	public String deleteNode(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}