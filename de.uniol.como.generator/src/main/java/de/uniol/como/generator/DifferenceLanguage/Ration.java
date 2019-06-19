package de.uniol.como.generator.DifferenceLanguage;

public interface Ration {
	public String createRation(String gDiff_UUID
        	, String V
        );
	public String changeV(String gDiff_UUID, String newV);
	public String deleteRation(String gDiff_UUID);
}