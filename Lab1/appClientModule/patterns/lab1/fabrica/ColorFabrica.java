package patterns.lab1.fabrica;

import patterns.lab1.general.Scene;
import patterns.lab1.shapes.GraphObject;

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
