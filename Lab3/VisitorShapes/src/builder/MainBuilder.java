package builder;

import shapes.GraphObject;

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
