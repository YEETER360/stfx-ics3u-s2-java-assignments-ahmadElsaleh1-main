package lessons;

import java.util.Scanner;

public class ChkOddEven {

	public static void main(String[] args) {

		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("This program will determine if a number is odd or even");
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		if (num % 2 == 1) System.out.println("This number is odd");
		else System.out.println("This number is even");
	}

}
