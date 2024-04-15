package task10;
import static java.lang.System.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		String txtfile = "data/data.txt";
		 
		try { // try to create an AudioBookApp instance and display the results
			AudioBookApp app = new AudioBookApp(txtfile);
			AudioBook shortest = app.getShortestBook();
			if(shortest != null) {
				out.println("Shortest book:");
				shortest.displayInfo();
			}
			out.printf("Books published btw 2010-2020: %d\n", app.countBooks());
			app.randomBookList();
		}catch(IOException ioe) { // if the try fails, ask the user if the filename is correct
			out.printf("Perhaps missing text file: %s/%s? \n\n",
			new Main().getClass().getPackage().getName(), txtfile);
		}
	}

}
