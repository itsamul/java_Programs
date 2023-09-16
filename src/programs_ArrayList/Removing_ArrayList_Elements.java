package programs_ArrayList;

import java.util.ArrayList;

public class Removing_ArrayList_Elements {
	public static void main(String[] args) {

		//Creating ArrayList
		ArrayList<String> programmingLanguages = new ArrayList<>();

		//Add elements to the ArrayList
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("C#");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
        programmingLanguages.add("Perl");
		
		//Printing the ArrayList elements
		System.out.println("ArrayList before removing an element : " + programmingLanguages);
		
		//Removing the element from the ArrayList
		System.out.println("Element removing from the ArrayList : " + programmingLanguages.get(2));
		programmingLanguages.remove(2);

		//Printing the ArrayList elements after removing the element.
		System.out.println("ArrayList after removing an element  : " + programmingLanguages);
				
		//Removing the element from the ArrayList
		System.out.println("Element removing from the ArrayList index : " + "C#");
		programmingLanguages.remove("C#");
		
		//Printing the ArrayList elements after removing the element.
		System.out.println("ArrayList after removing an element  : " + programmingLanguages);
		
		
	}
}
