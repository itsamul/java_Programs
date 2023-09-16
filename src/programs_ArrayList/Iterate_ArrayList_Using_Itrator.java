package programs_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_ArrayList_Using_Itrator {

	public static void main(String[] args) {
		// Creating ArrayList
		ArrayList<String> programmingLanguages = new ArrayList<>();

		// Add elements to the ArrayList
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C#");
		programmingLanguages.add("JavaScript");

		// Printing the ArrayList elements
		System.out.println("ArrayList : " + programmingLanguages);
		
		// Iterating through the ArrayList using an iterator()
		System.out.println("List of Elements in the ArrayList : ");
		Iterator<String> itr_programmingLanguages = programmingLanguages.iterator();
		while (itr_programmingLanguages.hasNext()) {
			System.out.println(itr_programmingLanguages.next());
		}
	}

}
