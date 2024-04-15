package task3;
import static java.lang.System.*;
import java.util.*;

public class Main {
	
	static Scanner input = new Scanner(in);
	
	public static void main(String[] args) {
		// Assigning a grade based on a score the user enters, from 0-100
		double score;
		
		while(true) {
			out.print("Enter a score: ");
			score = Double.parseDouble(input.nextLine());
			
			if(score >=0 && score <= 100) {
				if(score < 50) {
					out.printf("Score %.1f will receive grade D", score);
				} else if(score < 70) {
					out.printf("Score %.1f will receive grade C", score);
				} else if(score < 80) {
					out.printf("Score %.1f will receive grade B", score);
				} else {
					out.printf("Score %.1f will receive grade A", score);
				} 
				break;
			} else {
				out.println("Invalid score");
			}
		}
	}

}
