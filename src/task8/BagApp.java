package task8;
import java.util.*;

public class BagApp {
	public double calcTotalCapacity(List<Bag> bagList) {
		// Calculating and returning the total capacity of all instances in "bagList"
		
		// base case: when bagList is empty
		if(bagList == null || bagList.size() == 0) return 0.0;
		
		// recursive case: break off first object, retrieve the rest
		// of the list, then add it to the total
		double total = bagList.get(0).getCapacity();
		List<Bag> sublist = bagList.subList(1, bagList.size());
		return total + calcTotalCapacity(sublist);
	 } 
}
