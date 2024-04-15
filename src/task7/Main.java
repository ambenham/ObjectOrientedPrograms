package task7;
import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Creating a list of shapes and adding shape & rectangles instances to it 
		List<Shape> shapes = new LinkedList<>();
		shapes.add(new Shape("white"));
		shapes.add(new Rectangle("red", 10, 6));
		shapes.add(new Rectangle("black", 20, 9));
		shapes.add(new Shape("orange"));
		
		showShapeNames(shapes);
		
		// Creating two arrays of rectangles and adding rectangle instances to both
		Rectangle[] rectangleArray1 = {
				new Rectangle("white", 4, 3),
				new Rectangle("red", 9, 5),
				new Rectangle("purple", 3, 6),
				new Rectangle("orange", 15, 10),
				new Rectangle("black", 4, 14),
		};
		Rectangle[] rectangleArray2 = {
				new Rectangle("pink", 3, 4),
				new Rectangle("red", 10, 2),
				new Rectangle("white", 8, 5),
				new Rectangle("blue", 14, 4),
				new Rectangle("bindle", 10, 15),
		};
		
		countOverlapRectangles(rectangleArray1, rectangleArray2);
		}
	
		public static void showShapeNames(List<Shape> shapes){
			// List validation
			if(shapes == null || shapes.size() == 0) {
				 return;
			}
			
			for(Shape s : shapes) {
				out.println(s.getShapeType());
			}
		}
		 
		public static void countOverlapRectangles(Rectangle[] group1, Rectangle[]
		group2){
			// Array validation
			if(group1 == null || group1.length == 0 || group2 == null || group2.length == 0) {
				 return;
			}
			
			// Calculating the numbers of overlapping colours and perimeters between the two arrays
			 
			int overlapColours = 0;
			int overlapPerimeter = 0;
			 
			for(Rectangle r1 : group1) {
				for(Rectangle r2 : group2) {
					if(r1.getColour().equalsIgnoreCase(r2.getColour())) {
						overlapColours++;
					}
					if(r1.getPerimeter() == r2.getPerimeter()) {
						overlapPerimeter++;
					}
				}
			}
			 
			out.printf("There are %d Rectangle objects with overlapping colours between the two arrays\n", overlapColours);
			out.printf("There are %d Rectangle objects with overlapping perimeters between the two arrays\n", overlapPerimeter);
		} 

}
