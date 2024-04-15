package task8;
import static java.lang.System.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// Creating a list of bags and adding bag instances to it
		List<Bag> bags = new LinkedList<>();
		bags.add(new Bag("blue", 3.6));
		bags.add(new Bag("white", 4.5));
		bags.add(new Bag("grey", 4.8));
		
		BagApp bgapp = new BagApp(); // BagApp instance
		double totalCapacity = bgapp.calcTotalCapacity(bags);
		// Displaying the results
		out.printf("Total capacity: %.2f\n", totalCapacity);
		out.printf("Total number of bags: %d\n", bags.size());
	}
}
