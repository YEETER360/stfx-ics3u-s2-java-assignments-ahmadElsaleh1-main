package lessons;

public class Rounding {

	public static void main(String[] args) {
		
		double money = 12.7912;
		
		// Step 1 - move decimal to the right of the position you wish to round to
		money *= 100;
		
		// Step 2 - round to nearest one
		money = Math.round(money);
		
		// Step 3 - move decimal back to original position
		money /= 100;
		
		System.out.println(money);
	}

}
