package patterns.lab1.builder;

import patterns.lab1.general.Scene;
import patterns.lab1.general.SceneBuilder;
import patterns.lab1.shapes.GraphObject;

public class BuilderBuild implements Builder {

	@Override
	public void proccess(boolean isColor, GraphObject[] lstObj) {
		
		SceneBuilder.createScene(isColor, lstObj);
	}

	@Override
	public void showResult() {
		System.out.println("\nПостроение схемы выполнено.");
		Scene.getScene().draw();
	}

}
