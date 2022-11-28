package builder;

import shapes.GraphObject;

public interface Builder {
	public void proccess(boolean isColor, GraphObject[] lstObj);
	public void showResult();
}
