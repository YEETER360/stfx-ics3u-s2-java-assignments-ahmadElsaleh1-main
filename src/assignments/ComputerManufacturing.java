package assignments;
import java.util.Scanner;

public class ComputerManufacturing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int computers;
		double weight;
		
		System.out.println("Please enter the number of computers you own: ");
		computers = sc.nextInt();
		
		weight = computers * 1.5;
		System.out.println(weight +" tonnes of water were used to manufacture your computers!");
	}

}
