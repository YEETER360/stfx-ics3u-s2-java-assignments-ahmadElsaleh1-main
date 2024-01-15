package assignments;

import java.util.Scanner;

public class U1A7_SavingsCalculatorCLI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double spent = 0;
		
		System.out.println("This program will check the amount of discount you are entitled to");
		System.out.println("Please enter the amount spent: ");
		spent = sc.nextDouble();
		
		if(spent < 0) System.out.println("That's impossible");
		else if(spent <= 40) System.out.println("\nYou spent: $"+ Math.round(spent * 100.0) / 100.0 +"\nYou are saving 10% \nYou are saving: $"+ Math.round((spent * 0.1) * 100.0) / 100 +"\nYour total is: $"+ Math.round((spent * 0.9) * 100.0) /100.0);
		else if(spent <= 80) System.out.println("\nYou spent: $"+ Math.round(spent * 100.0) / 100.0 +"\nYou are saving 20% \nYou are saving: $"+ Math.round((spent * 0.2) * 100.0) / 100 +"\nYour total is: $"+ Math.round((spent * 0.8) * 100.0) /100.0);
		else if(spent <= 120) System.out.println("\nYou spent: $"+ Math.round(spent * 100.0) / 100.0 +"\nYou are saving 30% \nYou are saving: $"+ Math.round((spent * 0.3) * 100.0) / 100 +"\nYour total is: $"+ Math.round((spent * 0.7) * 100.0) /100.0);
		else System.out.println("\nYou spent: $"+ Math.round(spent * 100.0) / 100.0 +"\nYou are saving 40% \nYou are saving: $"+ Math.round((spent * 0.4) * 100.0) / 100.0 +"\nYour total is: $"+ Math.round((spent * 0.6) * 100.0) /100.0);
	}

}
