package exports;

import shapes.Circle;
import shapes.Line;
import shapes.TriangleAdapter;

public interface ExportVisitor {
	
	public void ExportLine(Line shape);
	public void ExportCircle(Circle shape);
	public void ExportTriangle(TriangleAdapter shape);
	
}
