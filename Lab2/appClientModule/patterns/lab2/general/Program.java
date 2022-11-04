package patterns.lab2.general;

import java.util.ArrayList;

import patterns.lab2.builder.BuilderBuild;
import patterns.lab2.builder.BuilderCalc;
import patterns.lab2.builder.MainBuilder;
import patterns.lab2.shapes.Circle;
import patterns.lab2.shapes.DecoratorNotes;
import patterns.lab2.shapes.GraphObject;
import patterns.lab2.shapes.Line;
import patterns.lab2.shapes.Point;
import patterns.lab2.shapes.ShapeGroups;
import patterns.lab2.shapes.TriangleAdapter;

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
											 new DecoratorNotes(new Line("#0011FF", new Point(1,1), new Point(100, 100)), "Строка с примечанием, йуху") ,
											 new Circle("#123456", new Point(1,1), 10),
											 new Circle("#5632CC", new Point(100,1), 20),
											 new Line("#033CFF", new Point(10,20), new Point(50, 160)),
											 new TriangleAdapter("#325476", new Point(1, 1), new Point(3, 3), new Point(10, 12)),
											 (new ShapeGroups("Группа фигур"))
											 	.add(new Circle("#123456", new Point(100,111), 10))
											 	.add(new DecoratorNotes(new Line("#033CFF", new Point(120,220), new Point(520, 1260)), "Супер-мега длинная прямая"))
										  };
		
		MainBuilder mb = new MainBuilder(buildBuild);
		
		// строим сцену
		mb.goProccess(true, lstObj);
		
		// посчитаем размер
		mb.changeBuilder(buildCalc);
		mb.goProccess(true, lstObj);
		
		
	}
}
