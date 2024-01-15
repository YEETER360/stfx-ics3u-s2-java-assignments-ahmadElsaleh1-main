package lessons;

import java.util.Scanner;

public class NestedIfElse2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String foodChoice = "";
		String meatChoice = "";
		String vegChoice = "";
		
		System.out.println("Food Menu:");
		System.out.println("Do you eat Meat (M), or Vegtables (V)?");
		foodChoice = sc.next();
		
		if(foodChoice.equals("M")) 
		{
			System.out.println("You selected meat, here are your options:");
			System.out.println("Chicken (C) or Fish (F)?");
			meatChoice = sc.next();
			
			if(meatChoice.equals("C")) System.out.println("KFC will be served");
			else System.out.println("Filet o Fish will be served");
		}
		
		else 
		{
			System.out.println("You selected vegtables, here are your options:");
			System.out.println("Chicken (C) or Fish (F)?");
			vegChoice = sc.next();
		}
	}

}