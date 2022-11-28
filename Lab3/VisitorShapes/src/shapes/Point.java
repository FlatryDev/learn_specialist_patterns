package shapes;

public class Point extends GraphObject {
	private int x, y;
	
	
	
	public Point(int x, int y) {
		super(null);  // у точки же нет цвета
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Point setKoord(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}
	
	@Override
	public String toString() {
		return getX() + ":" + getY();
	}
	
}
