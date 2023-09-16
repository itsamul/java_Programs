package programs_ArrayList;

import java.util.ArrayList;

public class Accessing_ArrayList_Elements {
	public static void main(String[] args) {
		
		// Creating ArrayList of String
		ArrayList<String> programmingLanguages = new ArrayList<>();
		
		// Add elements to the ArrayList
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C#");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Perl");
		
		// Printing the ArrayList elements
		System.out.println("ArrayList : " + programmingLanguages);
		
		// Accessing an element in an ArrayList
		String element = programmingLanguages.get(0);
		System.out.println("Element at index 0 : " + element);
		System.out.println("Element at index 1 : " + programmingLanguages.get(1));
		System.out.println("Index of element \"Java\" : " + programmingLanguages.indexOf("Java"));
		System.out.println("Index of element \"JavaScript\" : " + programmingLanguages.indexOf("JavaScript"));

	}
}
