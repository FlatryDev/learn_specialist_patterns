package patterns.lab2.fabrica;

import patterns.lab2.general.Scene;
import patterns.lab2.shapes.GraphObject;

public class ColorFabrica implements Fabrica {

	@Override
	public void draw() {
		System.out.println("Цветное кино");
	}
	
	@Override
	public void createShape(GraphObject grObj) {
		Scene.getScene().setCurrColorSchema("Цветное кино");
		Scene.getScene().addObject(grObj);
	}

}
