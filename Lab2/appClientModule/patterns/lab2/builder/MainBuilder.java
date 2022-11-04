package patterns.lab2.builder;

import patterns.lab2.shapes.GraphObject;

public class MainBuilder {
	private Builder builder ;
	

	public void changeBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public MainBuilder(Builder builder) {
		changeBuilder(builder);
	}
	
	public void goProccess(boolean isColor, GraphObject[] lstObj) {
		builder.proccess(isColor, lstObj);
		builder.showResult();
	}
	
}
