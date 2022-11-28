package general;

import java.util.ArrayList;

import exports.ExportJSON;
import exports.ExportXML;
import exports.ExportableElement;
import shapes.DecoratorBase;
import shapes.GraphObject;
import shapes.SimpleGraphObject;

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
	
	public void exportToJSON() {
		boolean isFirstPrnt = false;
		ExportJSON export = new ExportJSON();
		System.out.println("[");
		for(int i = 0; i < lstObj.size() ;i++) {
			if (lstObj.get(i) instanceof ExportableElement) {
				if (isFirstPrnt) System.out.println(","); 
				else isFirstPrnt = true;
				((ExportableElement)lstObj.get(i)).accept(export);
			}
		}
		System.out.println("]");
	}
	
	public void exportToXML() {
		boolean isFirstPrnt = false;
		ExportXML export = new ExportXML();
		System.out.println("<?xml version=\"1.0\" encoding=\"WINDOWS-1251\"?>");
		System.out.println("<graphObjects>");
		for(int i = 0; i < lstObj.size() ;i++) {
			if (lstObj.get(i) instanceof ExportableElement) {
				((ExportableElement)lstObj.get(i)).accept(export);
			}
		}
		System.out.println("</graphObjects>");
	}
	
}
