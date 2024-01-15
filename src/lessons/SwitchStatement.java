package lessons;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int userChoice = 77;
		
		switch(userChoice) 
		{
			case 1:
				System.out.println("You picked 1");
				break;
				
			case 2:
				System.out.println("You picked 2");
				break;
				
			case 3:
				System.out.println("You picked 3");
				break;
				
			case 4:
				System.out.println("You picked 4");
				break;
				
			case 5:
				System.out.println("You picked 5");
				break;
				
			default:
				System.out.println("Invalid entry");
		}

	}

}
