package assignments;

import java.util.Scanner;

class U2A10_VoidMethods {
	
	static int num;
	
  public static void main(String[] args) {  
	
    Scanner sc = new Scanner(System.in);
    while(true) 
    {
    	try 
    	{	  		
        	System.out.println("\nPlease enter your choice:");
            System.out.println("1. Find the value of a number squared");
            System.out.println("2. Find the value of a number cubed");
            System.out.println("3. Find the value of a number to a chosen power");
            System.out.println("4. Find the factorial of a number");
            System.out.println("5. Find the volume of a cuboid");
            System.out.println("6. Exit");
            String choice = sc.next();
            System.out.println();

            switch(choice)
            {
            
            	case "1":
            		System.out.println("Enter the number to square: ");
            		
            		square(sc.nextInt());
            		break;
                
            	case "2":
            		System.out.println("Enter the number to cube: ");
            		
            		cube(sc.nextInt());
            		break;
                
            	case "3":
            		System.out.println("Enter a number to power: ");
            		num = sc.nextInt();
            		
            		System.out.println("Enter a number to power by: ");
            		power(sc.nextInt());
            		break;
                
            	case "4":
            		System.out.println("Enter a number to find the factorial:");
            		
            		factorial(sc.nextInt());
            		break;
            		
            	case "5":
            		System.out.println("Enter the length, width and height of the cuboid:");
            		
            		cuboidVolume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            		break;
            		
            	case "6":
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
  
  public static void square(int num) 
  {	
		num *= num;
		System.out.println(num);
  }
  
  public static void cube(int num) 
  {	
	  	num *= num * num;
		System.out.println(num);
  }
  
  public static void power(int power) 
  {	
	  	int result = num;
		for(int i = 1; i < power; i++) 
		{
			result *= num;
		}
		System.out.println(result);
  }
  
  public static void factorial(int num) 
  {	
	  int result = num;
	  for(int i = 1; i < num; i++) 
	  {
		  result *= num - i;
	  }
	  
	  System.out.println(result);
  }
  
  public static void cuboidVolume(double l, double w, double h) 
  {
	  System.out.println(l*w*h);
  }
}