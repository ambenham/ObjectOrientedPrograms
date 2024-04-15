package task1;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		// Displaying different escape sequences in a table
		String fmt = "%-20s%-20s\n";
		out.printf(fmt, "Escape sequence", "Description");
		out.println("-".repeat(40));
		out.printf(fmt, "\\n", "New line character");
		out.printf(fmt, "\\t", "Horizontal tab character");
		out.printf(fmt, "\\\"", "Double quote character");
		out.printf(fmt, "\\b", "Backspace character");
	}

}
