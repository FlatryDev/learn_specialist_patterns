package shapes;

import exports.ExportVisitor;
import exports.ExportableElement;

public class DecoratorNotes extends DecoratorBase implements ExportableElement {
	private String notes;
	private GraphObject shape;

	public DecoratorNotes(GraphObject wrappee, String notes) {
		super(wrappee);
		this.notes = notes;
		this.shape = wrappee;
	}
	
	@Override
	public String toString() {
		String result = wrappee.toString(); 
		return result.substring(0, result.length()-2) + ", Notes: "+notes+")";
	}
	
	@Override
	public void accept(ExportVisitor v) {
		if (shape instanceof SimpleGraphObject)
			((SimpleGraphObject)shape).accept(v);
	}
	
}
