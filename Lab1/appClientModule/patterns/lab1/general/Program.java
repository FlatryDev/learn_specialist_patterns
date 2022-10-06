package patterns.lab1.general;

import java.util.ArrayList;

import patterns.lab1.builder.BuilderBuild;
import patterns.lab1.builder.BuilderCalc;
import patterns.lab1.builder.MainBuilder;
import patterns.lab1.shapes.Circle;
import patterns.lab1.shapes.GraphObject;
import patterns.lab1.shapes.Line;
import patterns.lab1.shapes.Point;

public class Program {
	public static void main(String[] args)  {
		//Line line = new Line("#0011FF", new Point(1,1), new Point(100, 100));
		
//		SceneBuilder.createScene(true, new GraphObject[] { 
//									 new Line("#0011FF", new Point(1,1), new Point(100, 100)),
//									 new Circle("#123456", new Point(1,1), 10),
//									 new Circle("#5632CC", new Point(100,1), 20),
//									 new Line("#033CFF", new Point(10,20), new Point(50, 160))
//								  }
//								);
//		Scene.getScene().draw();
		
		BuilderCalc  buildCalc = new BuilderCalc();
		BuilderBuild buildBuild = new BuilderBuild();

		GraphObject[] lstObj = new GraphObject[] { 
											 new Line("#0011FF", new Point(1,1), new Point(100, 100)),
											 new Circle("#123456", new Point(1,1), 10),
											 new Circle("#5632CC", new Point(100,1), 20),
											 new Line("#033CFF", new Point(10,20), new Point(50, 160))
										  };
		
		MainBuilder mb = new MainBuilder(buildBuild);
		
		// строим сцену
		mb.goProccess(true, lstObj);
		
		// посчитаем размер
		mb.changeBuilder(buildCalc);
		mb.goProccess(true, lstObj);
		
		
	}
}
