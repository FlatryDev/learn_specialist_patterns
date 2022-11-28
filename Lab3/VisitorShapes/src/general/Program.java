package general;

import java.util.ArrayList;

import builder.BuilderBuild;
import builder.BuilderCalc;
import builder.MainBuilder;
import shapes.Circle;
import shapes.DecoratorNotes;
import shapes.GraphObject;
import shapes.Line;
import shapes.Point;
import shapes.ShapeGroups;
import shapes.TriangleAdapter;

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
		
		System.out.println("------------");
		Scene.getScene().exportToJSON();
		
		System.out.println("------------");
		Scene.getScene().exportToXML();
		
	}
}
