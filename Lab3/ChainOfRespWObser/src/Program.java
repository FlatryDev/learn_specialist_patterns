import obsever.Publisher;
import widgets.*;

public class Program {

	public static void main(String[] args) {
		
		Publisher groupComponents = new Publisher();
		CompositeControl mainWin = new MainWindow();
		CompositeControl frame1 = new CompositeControl();
		CompositeControl frame2 = new CompositeControl();
		frame1.add(new Label("Login")).add(new Button("OK"));
		frame2.add(new Label("Password")).add(new Button("Verify"));
		Button printButton = new Button("Print");
		groupComponents.addListener(printButton);
		mainWin.add(frame1).add(frame2).add(new CompositeControl().add(printButton));
		
		CompositeControl frame = new CompositeControl();
		mainWin.add(frame);
		printButton = new Button("Print 2");
		frame.add(printButton);
		groupComponents.addListener(printButton);
		
		printButton = new Button("Print 3");
		frame.add(printButton);
		groupComponents.addListener(printButton);
		
		
		
		// отрисовка окна
		mainWin.draw();
		printButton.press();
		
		System.out.println("\n--------- Publisher's cycle  -----------");
		groupComponents.sendNotify();
		
		
		

	}

}
