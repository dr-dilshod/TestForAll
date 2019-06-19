package de.uniol.como.generator.DifferenceLanguage;

public interface LayoutConstraint {
	public String createLayoutConstraint(String gDiff_UUID
        );
	public String deleteLayoutConstraint(String gDiff_UUID);
}