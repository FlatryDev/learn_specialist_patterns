package patterns.lab2.general;

import java.util.ArrayList;

import patterns.lab2.fabrica.BlackFabrica;
import patterns.lab2.fabrica.ColorFabrica;
import patterns.lab2.fabrica.Fabrica;
import patterns.lab2.general.Scene;
import patterns.lab2.shapes.GraphObject; 

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
