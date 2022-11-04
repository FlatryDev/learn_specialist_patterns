package patterns.lab2.fabrica;

import patterns.lab2.general.Scene;
import patterns.lab2.shapes.GraphObject;

public class BlackFabrica implements Fabrica {

	@Override
	public void draw() {
		System.out.println("Черно-белое кино");
		
	}

	@Override
	public void createShape(GraphObject grObj) {
		grObj.setColor(null);
		Scene.getScene().setCurrColorSchema("Черно-белое кино");
		Scene.getScene().addObject(grObj);
	}
	

}
