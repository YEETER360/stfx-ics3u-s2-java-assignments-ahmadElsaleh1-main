package assignments;
import java.util.Scanner;

public class MathProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double base;
		double height;
		double area;
		
		System.out.println("This program will calcuate the area of a triangle for you");
		System.out.println("Enter the length of the base of the triangle in centimeters: ");
		base = sc.nextDouble();
		System.out.println("Enter the length of the height of the triangle in centimeters: ");
		height = sc.nextDouble();

		area = (base * height) / 2;
		System.out.printf("The area of the triangle is " + area + " centimeters squared");
		
	}

}
