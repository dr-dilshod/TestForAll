package de.uniol.como.generator.DifferenceLanguage;

public interface Location {
	public String createLocation(String gDiff_UUID
        	, String X
        	, String U
        );
	public String changeX(String gDiff_UUID, String newX);
	public String changeU(String gDiff_UUID, String newU);
	public String deleteLocation(String gDiff_UUID);
}