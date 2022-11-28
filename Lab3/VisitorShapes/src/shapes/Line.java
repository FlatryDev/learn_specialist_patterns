package shapes;

import exports.ExportVisitor;

public class Line extends SimpleGraphObject implements Cloneable {
	public static final int SIZE = 10;
	private Point point1, point2;

	public Line(String color, Point point1, Point point2) {
		super(color);
		this.point1 = point1;
		this.point2 = point2;
	}
	
	@Override
	public String toString() {
		return "Line ("+getColor() + ", " + point1 + "-" + point2+")";
	}
	
	
	public Point getPoint1() {
		return point1;
	}

	public Point getPoint2() {
		return point2;
	}

	@Override
	public Line clone() throws CloneNotSupportedException {
		return (Line)super.clone();
	}
	
	@Override
	public int getSize() {
		return SIZE;
	}
	
	@Override
	public void accept(ExportVisitor v) {
		v.ExportLine(this);
	}
	
}
