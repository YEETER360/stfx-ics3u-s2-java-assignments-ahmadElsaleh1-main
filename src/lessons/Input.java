package lessons;

// Import Scanner library for input
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		int myInteger;
		
		// Create new Scanner called "sc"
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		// Receives input from user
		myInteger = sc.nextInt();
		
		// Prints user input
		System.out.println("You entered: " + myInteger);
	}

}
