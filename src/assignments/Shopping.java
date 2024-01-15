package assignments;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mice;
		int usbs;
		int keyboards;
		
		double miceCost;
		double usbsCost;
		double keyboardsCost;
		
		double subtotal;
		double tax;
		double grandTotal;
		
		System.out.println("Please enter the number of (computer, not animal) mice you want to purchase: ");
		mice = sc.nextInt();
		// this function should round to 2 decimal places most of the time
		miceCost = Math.round(mice * 25.99 * 100)/100;
		
		System.out.println("Please enter the number of USB storage devices you want to purchase: ");
		usbs = sc.nextInt();
		// this function should round to 2 decimal places most of the time
		usbsCost = Math.round(usbs * 19.99 * 100)/100;
		
		System.out.println("Please enter the number of keyboards you want to purchase: ");
		keyboards = sc.nextInt();
		// this function should round to 2 decimal places most of the time
		keyboardsCost = Math.round(keyboards * 49.99 * 100)/100;;
		
		subtotal = miceCost + usbsCost + keyboardsCost;
		tax = subtotal * 0.13;
		grandTotal = subtotal + tax;
		
		System.out.println("Your subtotal is $"+ subtotal +", the tax is $"+ tax +" with a tax rate of 13%, and your grand total is $"+ grandTotal);
	}

}
