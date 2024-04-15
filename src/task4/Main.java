package task4;
import static java.lang.System.*;
import java.util.*;

public class Main {
	
	static Scanner input = new Scanner(in);

	public static void main(String[] args) {
		
		// Asking for two lines of colours and storing each line in each array
		out.print("Enter the first line of colours: ");
		String str1 = input.nextLine();
		String[] first = str1.split(",");
		
		out.print("Enter the second line of colours: ");
		String str2 = input.nextLine();
		String[] second = str2.split(",");
		
		List<String> duplicates = new LinkedList<>();
		
		// Checking if there are any duplicates between the arrays
		for(String e1 : first) {
			for(String e2 : second) {
				if(e1.equalsIgnoreCase(e2)) {
					duplicates.add(e1);
				}
			}
		}
		 
		// Displaying the results
		out.printf("You entered %d colours in the first list \n", first.length);
		out.printf("You entered %d colours in the second list \n", second.length);
		out.printf("Number of overlapping colours: %d \n", duplicates.size());
		out.println("The overlapping colours are as follows: ");
		for(String e3 : duplicates) {
			out.println(e3);
		}
		
	}

}
