package general;

import java.util.ArrayList;

import fabrica.BlackFabrica;
import fabrica.ColorFabrica;
import fabrica.Fabrica;
import general.Scene;
import shapes.GraphObject; 

public class SceneBuilder {
	
	public static void createScene(boolean isColor, GraphObject[] lstObj) {
		Fabrica fabrica;
		if (isColor) {
			fabrica = new ColorFabrica();
		} else {
			fabrica = new BlackFabrica();
		}
		
		for(GraphObject item : lstObj)
			fabrica.createShape(item);
		
		
//		ArrayList<GraphObject> lstObj
//		for(GraphObject obj : lstObj) {
//			Scene.getScene().addObject(obj);
//		}
	}
	
}
