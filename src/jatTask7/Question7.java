package jatTask7;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		
		// Create a List of Strings
        List<String> stringList = new ArrayList<>();
        
        // Add elements to the List
        stringList.add("Madhu");
        stringList.add("Swedha");
        stringList.add("Indhumathi");
        stringList.add("Lavanya");

        // Convert the List to an Array
        String[] array = stringList.toArray(new String[0]);

        // Print the Array elements
        System.out.println("Array elements:");
        
        for (String element : array) {
            
        	
        	System.out.println(element);
        }
    }

}
