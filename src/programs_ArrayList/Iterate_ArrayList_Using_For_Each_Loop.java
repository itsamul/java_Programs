package programs_ArrayList;

import java.util.ArrayList;

public class Iterate_ArrayList_Using_For_Each_Loop {

	public static void main(String[] args) {
		//Creating ArrayList
		ArrayList<String> programmingLanguages = new ArrayList<>();
		
		//Add elements to the ArrayList
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C#");
		programmingLanguages.add("JavaScript");
			
		//Printing the ArrayList elements
		System.out.println("ArrayList : " + programmingLanguages);
		
        // Iterating through the ArrayList
		System.out.println("List of Elements in the ArrayList : ");
		for (String element : programmingLanguages) {
			System.out.println(element);
		}
	}

}
