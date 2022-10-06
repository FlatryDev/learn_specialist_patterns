package patterns.lab1.shapes;

public class Line extends GraphObject implements Cloneable {
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
	
	@Override
	public Line clone() throws CloneNotSupportedException {
		return (Line)super.clone();
	}
	
	@Override
	public int getSize() {
		return SIZE;
	}
	
}
