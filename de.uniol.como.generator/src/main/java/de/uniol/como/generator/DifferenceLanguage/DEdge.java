package de.uniol.como.generator.DifferenceLanguage;

public interface DEdge {
	public String createDEdge(String gDiff_UUID
        	, String target
        );
	public String changetarget(String gDiff_UUID, String newtarget);
	public String deleteDEdge(String gDiff_UUID);
}