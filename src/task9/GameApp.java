package task9;
import java.util.*;
import static java.lang.System.*;
import java.nio.file.*; // Path, Paths, Files classes
import java.io.*; // IOException
import java.util.concurrent.*;

public class GameApp {
	Scanner input = new Scanner(in);
	private List<Country> countryList;
	
	// parameterised constructor
	public GameApp(String filename) throws IOException {
		countryList = new LinkedList<>();
		readData(filename);
	}
	
	public void readData(String filename) throws IOException {
		// Reading the data file, splitting it and converting it into a list of Country instances
		Path path = Paths.get(filename);
		List<String> lines = Files.readAllLines(path);
		for(String line : lines) {
			String[] items = line.split(",");
			String name = items[0];
			String capital = items[1];
			int population = Integer.parseInt(items[2]);
			Country c = new Country(name, capital, population);
			countryList.add(c);
		}
	}
	
	public void game() {
		// Checking the list isn't empty
		if (countryList == null || countryList.size() == 0) {
			return;
		}
		
		// Letting the player choose to stop or play again
		while(true) {
			guessingGame();
			out.print("Play again (y/n)? ");
			if(input.nextLine().equalsIgnoreCase("n")) {
				out.println("Thanks for playing!");
				return;
			}
		}
	}
	
	public void guessingGame() {
		// Guessing game where the player guesses the capital city of a given country
		
		int num = ThreadLocalRandom.current().nextInt(0, countryList.size());
		String answer;
		int count = 1;
		
		out.printf("What's the capital of %s? ", countryList.get(num).getName());
		
		// Allowing the user to guess three times before revealing the answer
		while(true) {
			answer = input.nextLine();
			if (answer.equalsIgnoreCase(countryList.get(num).getCapital())) {
				out.println("Well done!");
				break;
			} else if(count < 3){
				out.println("Incorrect. Try again.");
				count++;
			} else {
				out.printf("Incorrect. It's %s.\n", countryList.get(num).getCapital());
				break;
			}
		}
		out.printf("%s is a country of %s million.\n", countryList.get(num).getName(), countryList.get(num).getPopulation());
	}
}
