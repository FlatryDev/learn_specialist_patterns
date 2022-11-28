package exports;

import shapes.Circle;
import shapes.Line;
import shapes.TriangleAdapter;

public class ExportJSON implements ExportVisitor {

	@Override
	public void ExportLine(Line shape) {
		System.out.printf("{type:\"%s\", x1:%d, y1:%d, x2:%d, y2:%d, color:\"%s\"}", 
							shape.getClass().toString(),
							shape.getPoint1().getX(), shape.getPoint1().getY(), 
							shape.getPoint2().getX(), shape.getPoint2().getY(),
							shape.getColor()
						 );
	}

	@Override
	public void ExportCircle(Circle shape) {
		System.out.printf("{type:\"%s\", x:%d, y:%d, r:%d, color:\"%s\"}", 
				shape.getClass().toString(),
				shape.getCenter().getX(), shape.getCenter().getY(), 
				shape.getR(), shape.getColor()
			 );
	}

	@Override
	public void ExportTriangle(TriangleAdapter shape) {
		System.out.printf("{type:\"%s\", x1:%d, y1:%d, x2:%d, y2:%d, x3:%d, y3:%d, color:\"%s\"}", 
				shape.getClass().toString(),
				shape.getPoint1().getX(), shape.getPoint1().getY(), 
				shape.getPoint2().getX(), shape.getPoint2().getY(),
				shape.getPoint3().getX(), shape.getPoint3().getY(),
				shape.getColor()
			 );
	}

}
