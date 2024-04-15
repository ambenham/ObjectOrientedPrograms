package task6;

public class LeafyGreen extends Vegetable {
	private String type; // class field
	
	// parameterised constructor to set the class and super class fields
	public LeafyGreen(double weight, double price, String type) {
		super(weight, price);
		this.setType(type);
	}
	
	
	// getters and setters

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
}
