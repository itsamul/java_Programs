package programs_ArrayList;

import java.util.ArrayList;

public class Changing_ArrayList_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> programmingLanguages = new ArrayList<>();

		//Add elements to the ArrayList
		// Add elements to the ArrayList
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C#");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
        programmingLanguages.add("Perl");
		
		//Printing the ArrayList elements
		System.out.println("ArrayList before change : " + programmingLanguages);
		
		// Changing ArrayList element
		System.out.println("Changing the Element in the ArrayList : " + programmingLanguages.get(2));
		programmingLanguages.set(2, "Kotlin");
		
		//Printing the ArrayList elements after changing.
		System.out.println("ArrayList after change : " + programmingLanguages);

		
	}

}
