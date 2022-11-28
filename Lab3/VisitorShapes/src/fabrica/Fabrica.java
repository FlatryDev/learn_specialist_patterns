package fabrica;

import shapes.GraphObject;

public interface Fabrica {
	public void draw();
	public void createShape(GraphObject grObj);
}
