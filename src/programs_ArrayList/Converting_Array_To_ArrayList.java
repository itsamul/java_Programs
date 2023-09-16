package programs_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Converting_Array_To_ArrayList {
	public static void main(String[] args) {

		// Creating a Array of String type
		String[] str_Array = { "Java", "Python", "Ruby", "C#", "JavaScript", "C", "C++", "Perl" };

		// Printing Array
		System.out.print("Array : ");
		for (String element : str_Array) {
			System.out.print(element + " ");
		}

		// Creating a ArrayList from Array.
		// The asList() method converts the array into an arraylist.
		ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList(str_Array)); 

		// Printing the ArrayList elements.
		System.out.println();
		System.out.println("Converted to ArrayList : " + programmingLanguages);
	}
}
