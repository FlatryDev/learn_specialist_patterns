package patterns.lab2.shapes;

import java.util.ArrayList;

public class ShapeGroups extends GraphObject {
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
	
}
