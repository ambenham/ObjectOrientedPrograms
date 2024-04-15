package task5;
import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args){
		// Creating a list of notes and adding note instances to it 
		List<Note> notes = new LinkedList<>();
		 notes.add(new Note("D", 19));
		 notes.add(new Note("C", 20));
		 notes.add(new Note("F", 31));
		 notes.add(new Note("B", 45));
		 notes.add(new Note("C", 73));
		 notes.add(new Note("F", 13));
		 notes.add(new Note("B", 34));
		 notes.add(new Note("C", 53));
		 processNotes(notes);
	}
	
	public static void processNotes(List<Note> notes){
		// Finding the total duration of all the notes
		int total = 0; 
		for(Note e : notes) {
			e.playNote();
			total += e.getDuration();
		}
		out.printf("\nTotal duration: %d seconds", total);
	} 

}
