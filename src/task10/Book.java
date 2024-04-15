package task10;

public class Book {
	private String name;
	private int year;
	
	// paramaterised constructor
	public Book(String name, int year) {
		this.setName(name);
		this.setYear(year);
	}
	
	// getters and setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
