package patterns.lab2.shapes;

public class DecoratorNotes extends DecoratorBase {
	private String notes;

	public DecoratorNotes(GraphObject wrappee, String notes) {
		super(wrappee);
		this.notes = notes;
	}
	
	@Override
	public String toString() {
		String result = wrappee.toString(); 
		return result.substring(0, result.length()-2) + ", Notes: "+notes+")";
	}
	
}
