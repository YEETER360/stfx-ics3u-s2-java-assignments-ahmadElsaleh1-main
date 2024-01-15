package assignments;

import java.util.Scanner;

class U2A3_ForLoops {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter your choice:");
    System.out.println("1. Count from 0 to 10 by 1");
    System.out.println("2. Count from 100 to 0 by 10");
    System.out.println("3. Count from 50 to 500 by 50");
    System.out.println("4. Count from 6000 to 1000 by 1000\n");
    String choice = sc.next();

    switch(choice)
    {
      case "1":
        System.out.println("Counting from 0 to 10 by 1...");
        for(int i = 0; i <= 10; i++)
        {
          System.out.println(i);
        }
        break;
        
      case "2":
        System.out.println("Counting from 100 to 0 by 10...");
        for(int i = 100; i >= 0; i-=10)
        {
          System.out.println(i);
        }
        break;
        
      case "3":
        System.out.println("Counting from 50 to 500 by 50...");
        for(int i = 50; i <= 500; i+=50)
        {
          System.out.println(i);
        }
        break;
        
      case "4":
        System.out.println("Counting from 6000 to 1000 by 1000...");
        for(int i = 6000; i >= 1000; i-=1000)
        {
          System.out.println(i);
        }
        break;
        
      default:
        System.out.println("Invalid option");
    } 
  }
}