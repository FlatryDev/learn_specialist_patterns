package patterns.lab2.fabrica;

import patterns.lab2.shapes.GraphObject;

public interface Fabrica {
	public void draw();
	public void createShape(GraphObject grObj);
}
