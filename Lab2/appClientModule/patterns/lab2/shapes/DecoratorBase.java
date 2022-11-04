package patterns.lab2.shapes;

public class DecoratorBase extends GraphObject {
	protected GraphObject wrappee;

	public DecoratorBase(GraphObject wrappee) {
		super(null);
		this.wrappee = wrappee;
	}
	
	@Override
	public String toString() {
		return wrappee.toString();
	}
	
	@Override
	public int getSize() {
		return wrappee.getSize();
	}
	
}
