package jatTask7;

public class Question2_2 {

	public static void main(String[] args) {
		String str = "Hello";

        try {
            // access an invalid index in the string
            System.out.println(str.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e) {
           
        	// Exception handling
            System.out.println("Error: String index is out of bounds!");
        }
    }

}
