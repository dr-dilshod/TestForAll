package de.uniol.como.generator.DifferenceLanguage;

public interface ExecutableNode {
	public String createExecutableNode(String gDiff_UUID
        );
	public String deleteExecutableNode(String gDiff_UUID);
}