package shapes;

import exports.ExportVisitor;
import exports.ExportableElement;

public abstract class GraphObject {
	private String color; 
	
	public GraphObject(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void draw() {
		System.out.println("Графический объект");
	} 
	
	public int getSize() {
		return (Integer) null;
	}
	
	//@Override
	//public abstract void accept(ExportVisitor v);
	
	
}
