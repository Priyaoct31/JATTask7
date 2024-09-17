package jatTask7;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {
		
		// Create an ArrayList
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Priya");
        stringList.add("Monica");
        stringList.add("Java");
        stringList.add("Python");

        // Print the ArrayList before removing 
        System.out.println("ArrayList before removal: " + stringList);

        // Remove elements
        stringList.clear();

        // Print after removing elements
        System.out.println("ArrayList after removal: " + stringList);
    }

}
