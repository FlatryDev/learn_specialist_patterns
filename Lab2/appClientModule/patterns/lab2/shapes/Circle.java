package patterns.lab2.shapes;

public class Circle extends GraphObject {
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
	
}
