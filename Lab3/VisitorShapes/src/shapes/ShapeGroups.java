package shapes;

import java.util.ArrayList;
import java.util.Iterator;

import exports.ExportJSON;
import exports.ExportVisitor;

public class ShapeGroups extends SimpleGraphObject {
	public static final int SIZE = 0;
	private ArrayList<GraphObject> children = new ArrayList<>();
	private String nameGroup;

	public ShapeGroups(String nameGroup) {
		super(null);
		this.nameGroup = nameGroup;
	}
	
	public ShapeGroups add(GraphObject graph) {
		children.add(graph);
		return this;
	}
	
	public ShapeGroups remove(GraphObject graph) {
		children.remove(graph);
		return this;
	}
	
	@Override
	public String toString() {
		String result = "ShapeGroup ("+nameGroup+",";
		for(GraphObject elm : children) {
			result += "\n      " + elm.toString();	
		}
		result += "\n)";
		return result;
	}
	
	@Override
	public int getSize() {
		int result = 0;
		for(GraphObject elm : children) {
			result += elm.getSize();
		}
		return result;
	}

	@Override
	public void accept(ExportVisitor v) {
		int i = 0;
		for (GraphObject graphObject : children) {
			if (graphObject instanceof SimpleGraphObject) {
				i++;
				if (v instanceof ExportJSON)	if (i > 1) System.out.println(","); 
				((SimpleGraphObject)graphObject).accept(v);
				
			}
		}
		
	}
	
}
