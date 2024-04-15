package task9;
import static java.lang.System.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		String txtfile = "data9/data.txt"; 
		
		// try to play the game. if that fails, ask the user if the filename is correct
		try {
			GameApp app = new GameApp(txtfile);
			app.game();
		}catch(IOException ioe) {
			out.printf("Perhaps missing text file: %s/%s? \n\n",
			new Main().getClass().getPackage().getName(), txtfile);
		}
	}
}