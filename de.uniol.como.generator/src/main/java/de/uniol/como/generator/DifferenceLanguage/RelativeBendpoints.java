package de.uniol.como.generator.DifferenceLanguage;

public interface RelativeBendpoints {
	public String createRelativeBendpoints(String gDiff_UUID
        	, String Points
        );
	public String changePoints(String gDiff_UUID, String newPoints);
	public String deleteRelativeBendpoints(String gDiff_UUID);
}