package patterns.lab2.shapes;

public class TriangleAdapter extends GraphObject {
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
	
	
}
