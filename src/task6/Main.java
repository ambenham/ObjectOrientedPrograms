package task6;
import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		// Creating a list of vegetables and adding instances to it 
		List<LeafyGreen> veges = new LinkedList<>();
		veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
		veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
		veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
		veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
		veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
		veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
		veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
		veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
		veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
		veges.add(new LeafyGreen(26, 4.8, "Broccoli"));
		
		calculateStats(veges);
	}
	
	public static void calculateStats(List<LeafyGreen> veges){
		// List validation
		if(veges == null || veges.size() == 0) {
			return;
		}
		
		double totalCost = 0;
		double cabbageWeight = 0;
		double broccoliWeight = 0;
		double lettuceWeight = 0;
		
		// Calculating the total cost, and the total weight of each type
		for(LeafyGreen l : veges) {
			totalCost += l.getWeight() * l.getPrice();
			if(l.getType() == "Cabbage") {
				cabbageWeight += l.getWeight();
			}else if(l.getType() == "Broccoli") {
				broccoliWeight += l.getWeight();
			}else {
				lettuceWeight += l.getWeight();
			}
		}
		
		// Displaying the results
		out.printf("Total vegetable cost: $%.1f\n", totalCost);
		out.printf("Total Cabbage weight: %.1f kg\n", cabbageWeight);
		out.printf("Total Broccoli weight: %.1f kg\n", broccoliWeight);
		out.printf("Total Lettuce weight: %.1f kg\n", lettuceWeight);
	} 

}
