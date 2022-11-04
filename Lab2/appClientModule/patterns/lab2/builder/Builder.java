package patterns.lab2.builder;

import patterns.lab2.shapes.GraphObject;

public interface Builder {
	public void proccess(boolean isColor, GraphObject[] lstObj);
	public void showResult();
}
