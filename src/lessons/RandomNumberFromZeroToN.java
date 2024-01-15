package lessons;

public class RandomNumberFromZeroToN {

	public static void main(String[] args) {
		
		//Generates random number less than 1
		//System.out.println(Math.random());
		
		int n = 5;
		
		// Generates random number between 0 up to n
		System.out.println((int)(Math.random() * (n+1)));
		
		int m = 5;
		// Generates random number between 1 up to m
		System.out.println((int)(Math.random() * m) +1);
	}

}
