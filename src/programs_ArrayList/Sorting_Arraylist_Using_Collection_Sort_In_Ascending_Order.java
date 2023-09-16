package programs_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_Arraylist_Using_Collection_Sort_In_Ascending_Order {
	public static void main(String[] args) {

		// Creating ArrayList contains String values
		ArrayList<String> programmingLanguages = new ArrayList<>();
		
		//Add elements to the ArrayList
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C#");
		programmingLanguages.add("Kotlin");
		
		// Print the ArrayList
		System.out.println("ArrayList before Sorting : " + programmingLanguages);
		
		// Sorting the ArrayList
		Collections.sort(programmingLanguages);
		
		// Printing the ArrayList After Sorting in Ascending order.
		System.out.println("ArrayList After Sorting in Ascending order : " + programmingLanguages);
		
		// Creating ArrayList containing Integers values
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//Add elements to the ArrayList
		numbers.add(13);
		numbers.add(7);
		numbers.add(26);
		numbers.add(46);
		numbers.add(2);
		
		// Print the ArrayList
		System.out.println("ArrayList before Sorting : " + numbers);
		
		// Sorting the ArrayList
		Collections.sort(numbers);

		// Printing the ArrayList After Sorting in Ascending order.
		System.out.println("ArrayList After Sorting in Ascending order : " + numbers);

	}
}
