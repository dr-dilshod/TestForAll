package de.uniol.como.generator.DifferenceLanguage;

public interface MergeNode {
	public String createMergeNode(String gDiff_UUID
        );
	public String deleteMergeNode(String gDiff_UUID);
}