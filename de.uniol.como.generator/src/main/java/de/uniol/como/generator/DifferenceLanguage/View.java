package de.uniol.como.generator.DifferenceLanguage;

public interface View {
	public String createView(String gDiff_UUID
        	, String Visible
        	, String Type
        	, String Mutable
        	, String children
        	, String targetEdge
        	, String sourceEdge
        );
	public String changeVisible(String gDiff_UUID, String newVisible);
	public String changeType(String gDiff_UUID, String newType);
	public String changeMutable(String gDiff_UUID, String newMutable);
	public String changechildren(String gDiff_UUID, String newchildren);
	public String changetargetEdge(String gDiff_UUID, String newtargetEdge);
	public String changesourceEdge(String gDiff_UUID, String newsourceEdge);
	public String deleteView(String gDiff_UUID);
}