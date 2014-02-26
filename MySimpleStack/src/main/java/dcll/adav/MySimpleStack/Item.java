package dcll.adav.MySimpleStack;

public class Item {
	private Object value;
	
	Item(Object value) {
		setValue(value);
	}

	public void setValue(Object value) {
		this.value = value;
		
	}
	
	public Object getValue() {
		return this.value;
	}
	
	
}
