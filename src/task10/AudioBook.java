package task10;
import static java.lang.System.*;

public class AudioBook extends Book {
	private double length;
	
	// parameterised constructor
	public AudioBook(String name, int year, double length) {
		super(name, year);
		this.setLength(length);
	}
	
	public void displayInfo() {
		// Displaying the audiobook's data using formatting
		out.printf("%-20s%-10s\n", "Book name:", super.getName());
		out.printf("%-20s%-10d\n", "Publish year:", super.getYear());
		out.printf("%-20s%-10.2f \n\n", "Length (hours):", this.length);
	}
	
	// getters and setters
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
}
