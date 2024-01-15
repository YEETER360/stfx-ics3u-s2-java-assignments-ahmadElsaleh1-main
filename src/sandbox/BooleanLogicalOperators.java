package sandbox;

import java.util.Scanner;

public class BooleanLogicalOperators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final double PRICE = 1;
		double cost = 0;
		
		String item;
		int count = 0;
		
		System.out.println("Would you like to buy an apple or an orange?");
		item = sc.next();
		
		System.out.println("How many "+ item +"s?");
		try 
		{
			count = sc.nextInt();
		}
		
		catch(Exception e) 
		{
			System.out.println("Please enter a whole number, or die :)");
		}

		if(item.equals("apple") || item.equals("orange")) 
		{
			cost = PRICE * count;
		}
		
		System.out.println("Your price is: \n$"+ cost);
	}

}
