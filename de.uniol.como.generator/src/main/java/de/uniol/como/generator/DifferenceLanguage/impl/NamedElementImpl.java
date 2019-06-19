package de.uniol.como.generator.DifferenceLanguage.impl;

import de.uniol.como.generator.DifferenceLanguage.NamedElement;

public class NamedElementImpl implements NamedElement
{
	public String createNamedElement(String gDiff_UUID
            , String Name
 ){
        return gDiff_UUID + Name ;
    }
	public String changeName(String gDiff_UUID, String newName) {   
        return gDiff_UUID + ".changeName(" + newName + ")";
    }
	public String deleteNamedElement(String gDiff_UUID) {
        return gDiff_UUID + ".delete()";
    }
}