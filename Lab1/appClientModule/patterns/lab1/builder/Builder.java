package patterns.lab1.builder;

import patterns.lab1.shapes.GraphObject;

public interface Builder {
	public void proccess(boolean isColor, GraphObject[] lstObj);
	public void showResult();
}
