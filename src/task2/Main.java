package task2;
import static java.lang.System.*;
import java.util.*;

public class Main {
	
	static Scanner input = new Scanner(in);

	public static void main(String[] args) {
		// Calculating the perimeter and area based on user input
		out.print("Please enter the radius of a circle: ");
		double radius = Double.parseDouble(input.nextLine());
		double perimeter = radius * 2 * Math.PI;
		double area = Math.pow(radius, 2) * Math.PI;
		
		// Displaying the results in a table
		String fmt = "%-10s%-15s%-10s\n";
		out.printf(fmt, "Radius", "Perimeter", "Area");
		out.println("-".repeat(35));
		out.printf("%-10.2f%-15.2f%-10.2f", radius, perimeter, area);
	}

}
