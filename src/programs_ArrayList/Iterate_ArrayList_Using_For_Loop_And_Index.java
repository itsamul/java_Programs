package programs_ArrayList;

import java.util.ArrayList;

public class Iterate_ArrayList_Using_For_Loop_And_Index {

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
		
		// Iterating through the ArrayList using for loop with index
        System.out.println("List of Elements in the ArrayList : ");
		for (int i = 0; i < programmingLanguages.size(); i++) {
			System.out.println(programmingLanguages.get(i));
		}
	}

}
