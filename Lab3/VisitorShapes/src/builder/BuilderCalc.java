package builder;

import shapes.GraphObject;

public class BuilderCalc implements Builder {
	private GraphObject[] lstObj;
	private int totalSize = 0;
	
	@Override
	public void proccess(boolean isColor, GraphObject[] lstObj) {
		this.lstObj = lstObj;
		for(GraphObject item : lstObj) {
			totalSize += item.getSize();
		}
	}

	@Override
	public void showResult() {
		System.out.println("\nВыполнен расчет размера сцены.");
		System.out.println("Total size all shapes equal " + totalSize);
		System.out.println("Shapes included in calculate:");
		for(GraphObject item : lstObj)  System.out.println(item);
	}
	
	

}
