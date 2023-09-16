package programs_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reversing_An_Arraylist {
	public static void main(String[] args) {
		// Creating ArrayList
		ArrayList<String> programmingLanguages = new ArrayList<>();

		// Add elements to the ArrayList
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C#");
		programmingLanguages.add("Kotlin");

		// Printing the ArrayList
		System.out.println("ArrayList : " + programmingLanguages);

		// Reversing the ArrayList
		Collections.reverse(programmingLanguages);

		// Printing the ArrayList after Reversing
		System.out.println("ArrayList : " + programmingLanguages);
	}
}
