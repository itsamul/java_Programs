package programs_ArrayList;

import java.util.ArrayList;

public class Converting_ArrayList_To_Array {

	public static void main(String[] args) {
		// Creating ArrayList
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
		
		// Creating a new array of String type
		String[] str_array = new String[programmingLanguages.size()];
		
		// Converts ArrayList to Array of Strings
		programmingLanguages.toArray(str_array);	// the toArray() method converts the arraylist to an array 
		
		// Printing the Array elements.
		System.out.print("Converted to Array : ");
		for (int i = 0; i < str_array.length; i++) {
			System.out.print(str_array[i] + " ");
		}		
	}

}
