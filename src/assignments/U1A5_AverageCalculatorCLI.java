package assignments;
import java.util.Scanner;

public class U1A5_AverageCalculatorCLI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double mark1;
		double mark2;
		double mark3;
		double mark4;
		double average;
		
		System.out.println("Please enter your first course mark: ");
		mark1 = sc.nextDouble();
		System.out.println("Please enter your second course mark: ");
		mark2 = sc.nextDouble();
		System.out.println("Please enter your third course mark: ");
		mark3 = sc.nextDouble();
		System.out.println("Please enter your fourth course mark: ");
		mark4 = sc.nextDouble();
		
		average = (mark1 + mark2 + mark3 + mark4) / 4;
		System.out.println("Your average mark is: " + average);
	}

}
