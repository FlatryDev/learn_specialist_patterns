package shapes;

import exports.ExportVisitor;

public class TriangleAdapter extends SimpleGraphObject {
	private Triangle instance;
	public static final int SIZE = 30;
	
	public TriangleAdapter(String color, Point p1, Point p2, Point p3) {
		super(color);
		this.instance = new Triangle(p1, p2, p3);
	}
	
	@Override
	public String toString() {
		return "Triangle ("+getColor() + ", " + instance.getP1() + " - " + instance.getP2() + " - " + instance.getP3() + ")";
	}
	
	@Override
	public int getSize() {
		return SIZE;
	}
	
	@Override
	public void accept(ExportVisitor v) {
		v.ExportTriangle(this);
	}
	
	public Point getPoint1() {
		return instance.getP1();
	}

	public Point getPoint2() {
		return instance.getP2();
	}
	
	public Point getPoint3() {
		return instance.getP3();
	}
	
}
