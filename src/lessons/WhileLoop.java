package lessons;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int stop = 0;
		
		do
		{
			System.out.println("Enter 0 to continue, other number to exit");
			System.out.println("Enter number: ");
			stop = sc.nextInt();
		} while(stop == 0);

	}

}
