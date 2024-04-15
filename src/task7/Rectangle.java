package task7;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	// parameterised constructor
	public Rectangle(String colour, double height, double width) {
		super(colour);
		this.setHeight(height);
		this.setWidth(width);
	}
	
	// overriding method 
	@Override
	public String getShapeType() {
		return "I'm a Rectangle";
	}
	
	public double getPerimeter() {
		// calculating and returning the perimeter
		double perimeter = 2 * (height + width);
		return perimeter;
	}
	
	
	// getters and setters
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
