package task6;

public class Vegetable {
	// class fields
	private double weight;
	private double price;
	
	// parameterised constructor to set the class fields
	public Vegetable(double weight, double price) {
		this.setWeight(weight);
		this.setPrice(price);
	}
	
	
	// getters and setters
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
