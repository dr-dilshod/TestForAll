package de.uniol.como.generator.DifferenceLanguage;

public interface Size {
	public String createSize(String gDiff_UUID
        	, String Width
        	, String Height
        );
	public String changeWidth(String gDiff_UUID, String newWidth);
	public String changeHeight(String gDiff_UUID, String newHeight);
	public String deleteSize(String gDiff_UUID);
}