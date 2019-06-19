package de.uniol.como.generator.DifferenceLanguage;

public interface Anchor {
	public String createAnchor(String gDiff_UUID
        );
	public String deleteAnchor(String gDiff_UUID);
}