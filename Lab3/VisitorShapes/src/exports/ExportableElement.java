package exports;

public interface ExportableElement {
	public void accept(ExportVisitor v);
}
