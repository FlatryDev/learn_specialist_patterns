package shapes;

import exports.ExportVisitor;

public class DecoratorBase extends SimpleGraphObject {
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

	@Override
	public void accept(ExportVisitor v) {
		if (wrappee instanceof SimpleGraphObject) ((SimpleGraphObject)wrappee).accept(v);
	}
	
}
