package lessons;

public class NestedLoop {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) 
		{
			System.out.println("\nOuter Loop Number: " + (i+1));
			
			for(int j = 0; j < 10; j++) 
			{
				System.out.println("Inner Loop Number: " + (j+1));
			}
		}

	}

}
