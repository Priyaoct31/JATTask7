package jatTask7;

//Custom Exception Class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

// Main Class
public class Question3 {
    
	// Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
       
    	if (age < 18) {
            // Throwing custom exception 
            throw new InvalidAgeException("Age is less than 18. Access denied!");
        } 
    	
    	else {
            System.out.println("Access granted. You are old enough.");
        }
    }
    
    
	public static void main(String[] args) {
		
		 // user input
        int userAge = 12; 

        try {
            // Validating age
            validateAge(userAge);
        } 
        
        catch (InvalidAgeException e) {
             
        	// Handling exception
            System.out.println("Error: " + e.getMessage());
        }
		

	}

}
