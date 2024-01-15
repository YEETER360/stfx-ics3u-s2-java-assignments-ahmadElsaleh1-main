package assignments;

import java.util.Scanner;

public class U2A6_Arrays_1 {

	public static void main(String[] args) {

        Scanner keyedInput = new Scanner (System.in);
        
        int[] numbers = new int[20];
        int total = 0;
        
        System.out.println("Enter "+ numbers.length +" integers and they will be added together:");
        for (int i = 0; i < numbers.length; i++)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++)
        {
             total = total + numbers[i];
        }
        
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
	}

}
