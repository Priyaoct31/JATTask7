package jatTask7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		// file path
        File file = new File("Priya.txt");

        try {
            
        	// Try to read the file
            Scanner scanner = new Scanner(file);

            // Read and print the content
            while (scanner.hasNextLine()) {
                
            	String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } 
        
        catch (FileNotFoundException e) {
           
        	
        	// Exception handling
            System.out.println("Error: File not found. Please check the file path.");
        }
    }

}
