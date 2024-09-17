package jatTask7;

import java.util.TreeMap;

public class Question6 {

	public static void main(String[] args) {
		
		
		// Create a TreeMap with employee names as keys and their IDs as values
        TreeMap<String, Integer> eMap = new TreeMap<>();

        // Add employee details
        eMap.put("Priya", 01);
        eMap.put("Dharshini", 02);
        eMap.put("Rajesh", 03);
        eMap.put("Sathish", 04);
        eMap.put("Bala", 05);

        
        // Print the names of all employees in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        
        for (String name : eMap.keySet()) {
            System.out.println(name);
        }
    }

}
