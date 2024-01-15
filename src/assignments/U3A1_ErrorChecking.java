package assignments;

import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		boolean valid = false;
		
		//stage 1
		while (!valid) 
		{
			System.out.println("\nEnter a string that is more than 6 characters: ");
			userInput = sc.nextLine();
			
			valid = stageOne(userInput);
		}
		
		valid = false;
		
		//stage 2
		while (!valid) 
		{
			System.out.println("\nEnter a string that contains a lowercase 'a': ");
			userInput = sc.nextLine();
			
			valid = stageTwo(userInput);
		}
		
		valid = false;
		
		//stage 3
		while (!valid) 
		{
			System.out.println("\nEnter a string that is 5 to 15 characters long, and doesn't contain 'z':");
			userInput = sc.nextLine();
			
			valid = stageThree(userInput);
		}
		
		valid = false;
		
		//stage 4
		while (!valid) 
		{
			System.out.println("\nEnter a whole number between 5 and 500: ");
			userInput = sc.nextLine();
			
			valid = stageFour(userInput);
		}
		
		valid = false;
		
		//stage 5
		while (!valid) 
		{
			System.out.println("\nEnter a negative whole number: ");
			userInput = sc.nextLine();
			
			valid = stageFive(userInput);
		}
		
		valid = false;
		
		//stage 6
		while (!valid) 
		{
			System.out.println("\nEnter a positive, odd, whole number: ");
			userInput = sc.nextLine();
			
			valid = stageSix(userInput);
		}
		
		System.out.println("\nYou have finished. Goodbye world!");
	}
	
	// DESCRIPTION: Returns true if string is longer than 6 char
	// PARAMETERS: String
	// RETURN TYPE: boolean
	public static boolean stageOne(String input) 
	{	
		if(input.length() > 6) return true;
		return false;
	}
	
	// DESCRIPTION: Returns true if string contains letter "a"
	// PARAMETERS: String
	// RETURN TYPE: boolean
	public static boolean stageTwo(String input) 
	{	
		if(input.contains("a")) return true;
		return false;
	}
	
	// DESCRIPTION: Returns true if string contains letter "z" and if it is between 5 and 15 char
	// PARAMETERS: String
	// RETURN TYPE: boolean
	public static boolean stageThree(String input)
	{	
		if(input.contains("z") || input.contains("Z")) return false;
		else if(input.length() >= 5 && input.length() <= 15) return true;
		return false;
	}

	// DESCRIPTION: Returns true if integer is a whole number between 5 and 500
	// PARAMETERS: String
	// RETURN TYPE: boolean
	public static boolean stageFour(String input)
	{	
		int num = 0;
		try 
		{
			num = Integer.parseInt(input);
		}
		catch(Exception e) 
		{
			return false;
		}
		
		if(num >= 5 && num <= 500) return true;
		return false;
	}
	
	// DESCRIPTION: Returns true if integer is a negative whole number
	// PARAMETERS: String
	// RETURN TYPE: boolean
	public static boolean stageFive(String input)
	{	
		int num = 0;
		try 
		{
			num = Integer.parseInt(input);
		}
		catch(Exception e) 
		{
			return false;
		}
		
		if(num < 0) return true;
		return false;
	}
	
	// DESCRIPTION: Returns true if integer is a positive odd, whole number
	// PARAMETERS: String
	// RETURN TYPE: boolean
	public static boolean stageSix(String input)
	{	
		int num = 0;
		try 
		{
			num = Integer.parseInt(input);
		}
		catch(Exception e) 
		{
			return false;
		}
		
		if(num > 0 && num % 2 == 1) return true;
		return false;
	}
}
