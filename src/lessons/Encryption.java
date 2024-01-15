package lessons;

public class Encryption {

	public static void main(String[] args) {

		String myString = "hippopotamus";
		
		char myChar = myString.charAt(5);

		//change char to ASCII
		int ascii = (int)myChar;
		
		System.out.println(ascii);
		
		// shift right by 2
		ascii += 2;
		
		//change ascii back to char
		char shiftedChar = (char)ascii;
		
		System.out.println(shiftedChar);
	}

}
