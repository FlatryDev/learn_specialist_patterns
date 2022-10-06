package patterns.lab1.fabrica;

import patterns.lab1.shapes.GraphObject;

public interface Fabrica {
	public void draw();
	public void createShape(GraphObject grObj);
}
