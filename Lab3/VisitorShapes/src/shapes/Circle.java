package shapes;

import exports.ExportVisitor;

public class Circle extends SimpleGraphObject {
	public static final int SIZE = 20;
	private Point center;
	private int r;
	
	public Circle(String color, Point center, int r) {
		super(color);
		this.center = center;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "Circle ("+getColor() + ", " + center + ", r=" + r+")";
	}
	
	@Override
	public int getSize() {
		return SIZE;
	}

	@Override
	public void accept(ExportVisitor v) {
		v.ExportCircle(this);
	}

	public Point getCenter() {
		return center;
	}

	public int getR() {
		return r;
	}
	
	
	
}
