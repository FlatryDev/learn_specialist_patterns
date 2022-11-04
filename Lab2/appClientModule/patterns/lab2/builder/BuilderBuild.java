package patterns.lab2.builder;

import patterns.lab2.general.Scene;
import patterns.lab2.general.SceneBuilder;
import patterns.lab2.shapes.GraphObject;

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
