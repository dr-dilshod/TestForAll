package de.uniol.como.generator.DifferenceLanguage;

public interface RedefinableElement {
	public String createRedefinableElement(String gDiff_UUID
        );
	public String deleteRedefinableElement(String gDiff_UUID);
}