package lessons;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		// Variable declaration;
		int age = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program checks driving eligibility");
		System.out.println("Please enter your age:");
		
		// Receives input from user
		age = sc.nextInt();
		
		if(age < 16) {
			System.out.println("You are too young to drive");
		}
		
		else if((age > 15) && (age < 65)) {
			System.out.println("You are eligible to drive");
		}
		
		else {
			System.out.println("You need a retest");
		}
	}

}
