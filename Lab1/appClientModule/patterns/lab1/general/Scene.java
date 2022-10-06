package patterns.lab1.general;

import java.util.ArrayList;

import patterns.lab1.shapes.GraphObject;

public final class Scene {
	private static Scene scene ;
	private ArrayList<GraphObject> lstObj = new ArrayList<GraphObject>();
	private String currColorSchema;
	
	public void setCurrColorSchema(String currColorSchema) {
		this.currColorSchema = currColorSchema;
	}
	
	private Scene() {
		super();
	}
	
	public static Scene getScene() {
		if (scene == null) scene = new Scene();
		return scene;
	}
	
	public void addObject(GraphObject obj) {
		lstObj.add(obj);
	}
	
	public void clear() {
		currColorSchema = null;
		lstObj.clear();
	}
	
	public void draw() {
		System.out.println(currColorSchema);
		System.out.println("--------------------------------------");
		for(GraphObject item : lstObj)  System.out.println(item);
		System.out.println("--------------------------------------");
		
	}
	
}
