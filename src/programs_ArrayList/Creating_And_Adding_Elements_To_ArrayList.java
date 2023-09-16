package programs_ArrayList;

import java.util.ArrayList;

public class Creating_And_Adding_Elements_To_ArrayList {

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

	}

}
