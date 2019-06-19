package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.Diagram;

public class DiagramImpl implements Diagram
{
	public String createDiagram(String gDiff_UUID
            , String Name
            , String view
 ){
        return gDiff_UUID + Name  + view ;
    }
	public String changeName(String gDiff_UUID, String newName) {   
        return gDiff_UUID + ".changeName(" + newName + ")";
    }
	public String changeview(String gDiff_UUID, String newview) {   
        return gDiff_UUID + ".changeview(" + newview + ")";
    }
	public String deleteDiagram(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}