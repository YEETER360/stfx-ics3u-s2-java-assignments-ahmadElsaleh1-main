package assignments;

import java.util.Scanner;

class U2A5_Powers {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while(true) 
    {
    	try 
    	{
    		int num;
        	
        	System.out.println("\nPlease enter your choice:");
            System.out.println("1. Find the value of a number squared");
            System.out.println("2. Find the value of a number cubed");
            System.out.println("3. Find the value of a number to a chosen power");
            System.out.println("4. Exit");
            String choice = sc.next();
            System.out.println();

            switch(choice)
            {
            
            	case "1":
            		System.out.println("Enter the number to square: ");
            		num = sc.nextInt();
            		
            		num *= num;
            		System.out.println(num);
            		break;
                
            	case "2":
            		System.out.println("Enter the number to cube: ");
            		num = sc.nextInt();
            		
            		num *= num * num;
            		System.out.println(num);
            		break;
                
            	case "3":
            		System.out.println("Enter a number to power: ");
            		num = sc.nextInt();
            		
            		System.out.println("Enter a number to power by: ");
            		int power = sc.nextInt();
            		
            		int result = num;
            		for(int i = 1; i < power; i++) 
            		{
            			result *= num;
            		}
            		System.out.println(result);
            		
            		break;
                
            	case "4":
            		System.out.println("Thank you and goodbye world!");
            		System.exit(0);
                
            	default:
            		System.out.println("Invalid option");
            } 
    	}
    	catch(Exception e) 
        {
        	System.out.println("Invalid option");
        }
    }
  }
}