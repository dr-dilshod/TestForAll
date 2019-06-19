package de.uniol.como.generator.DifferenceLanguage;

public interface DNode {
	public String createDNode(String gDiff_UUID
        	, String target
        );
	public String changetarget(String gDiff_UUID, String newtarget);
	public String deleteDNode(String gDiff_UUID);
}