package jatTask7;

public class Question2_1 {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};

	        try {
	            // Access invalid index
	            System.out.println(arr[10]);
	        } 
	        
	        catch (ArrayIndexOutOfBoundsException e) {
	            
	        	// Exception handling
	            System.out.println("Error: Array index is out of bounds!");
	        }
	    }
}
