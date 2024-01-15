package lessons;

public class StringComparisons {

	public static void main(String[] args) {
		// Do not use <, <=, >, >=, == and != to compare Strings
		
		String string1 = "apple";
		String string2 = "orange";
		
		// Use .equals method for String comparisons
		if(string1.equals("apple")) System.out.println("Hello World!");
		else System.out.println("Goodbye");
		
	}

}
