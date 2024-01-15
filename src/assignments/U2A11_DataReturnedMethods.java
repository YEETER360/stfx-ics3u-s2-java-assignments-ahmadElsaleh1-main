package assignments;

import java.util.Scanner;

class U2A11_DataReturnedMethods {
	
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
            System.out.println("6. Find the average of two numbers");
            System.out.println("7. Find the volume of a sphere");
            System.out.println("8. Find the volume of a cone");
            System.out.println("9. Find the speed of an object");
            System.out.println("10. Find the volume of a pyramid");
            System.out.println("11. Exit");
            String choice = sc.next();
            System.out.println();

            switch(choice)
            {
            
            	case "1":
            		System.out.println("Enter the number to square: ");
            		
            		System.out.println(squared(sc.nextInt()));
            		break;
                
            	case "2":
            		System.out.println("Enter the number to cube: ");
            		
            		System.out.println(cubed(sc.nextInt()));
            		break;
                
            	case "3":
            		System.out.println("Enter a number to power: ");
            		num = sc.nextInt();
            		
            		System.out.println("Enter a number to power by: ");
            		System.out.println(power(sc.nextInt()));
            		break;
                
            	case "4":
            		System.out.println("Enter a number to find the factorial:");
            		
            		System.out.println(factorial(sc.nextInt()));
            		break;
            		
            	case "5":
            		System.out.println("Enter the length, width and height of the cuboid:");
            		
            		System.out.println(cuboidVolume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            		break;
            		
            	case "6":
            		System.out.println("Enter two numbers to find their average: ");
            		
            		System.out.println(avg(sc.nextDouble(), sc.nextDouble()));
            		break;
                
            	case "7":
            		System.out.println("Enter the radius of the sphere: ");
            		
            		System.out.println(sphereVol(sc.nextDouble()));
            		break;
                
            	case "8":
            		System.out.println("Enter the radius and height of the cone: ");
            		
            		System.out.println(coneVol(sc.nextDouble(), sc.nextDouble()));
            		break;
                
            	case "9":
            		System.out.println("Enter the distance traveled and the time taken: ");
            		
            		System.out.println(getSpeed(sc.nextDouble(), sc.nextDouble()));
            		break;
            		
            	case "10":
            		System.out.println("Enter the length, width and height of the pyramid:");
            		
            		System.out.println(pyramidVol(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            		break;
            		
            	case "11":
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
  
  public static int squared(int num) 
  {	
    return num * num;
  }
  
  public static int cubed(int num) 
  {	
    return num * num * num;
  }
  
  public static int power(int power) 
  {	
	  int result = num;
	  for(int i = 1; i < power; i++) 
	  {
		  result *= num;
	  }
	  return result;
  }
  
  public static int factorial(int num) 
  {	
	  int result = num;
	  for(int i = 1; i < num; i++) 
	  {
		  result *= num - i;
	  }
	  return result;
  }
  
  public static double cuboidVolume(double l, double w, double h) 
  {
	  return l*w*h;
  }
  
  public static double avg(double num1, double num2) 
  {
	  return (num1 + num2) / 2;
  }
  
  public static double sphereVol(double r) 
  {
	  return Math.round((4.0/3.0) * Math.PI * (r*r*r) * 100.0) / 100.0;
  }
  
  public static double coneVol(double r, double h) 
  {
	  return Math.round(Math.PI * (r*r) * (h/3) * 100.0) / 100.0;
  }
  
  public static double getSpeed(double d, double t) 
  {
	  return d/t;
  }
  
  public static double pyramidVol(double l, double w, double h) 
  {
	  return (l*w*h) / 3.0;
  }
}