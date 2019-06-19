package de.uniol.como.generator.DifferenceLanguage;

public interface Edge {
	public String createEdge(String gDiff_UUID
        	, String edge
        	, String target
        	, String source
        	, String sourceAnchor
        	, String targetAnchor
        	, String element
        );
	public String changeedge(String gDiff_UUID, String newedge);
	public String changetarget(String gDiff_UUID, String newtarget);
	public String changesource(String gDiff_UUID, String newsource);
	public String changesourceAnchor(String gDiff_UUID, String newsourceAnchor);
	public String changetargetAnchor(String gDiff_UUID, String newtargetAnchor);
	public String changeelement(String gDiff_UUID, String newelement);
	public String deleteEdge(String gDiff_UUID);
}