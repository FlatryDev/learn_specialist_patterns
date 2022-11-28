package fabrica;

import general.Scene;
import shapes.GraphObject;

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
