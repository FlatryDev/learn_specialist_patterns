package builder;

import general.Scene;
import general.SceneBuilder;
import shapes.GraphObject;

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
