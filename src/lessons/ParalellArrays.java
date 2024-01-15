package lessons;

public class ParalellArrays {

	public static void main(String[] args) {
		
		String[] names = {"Leo", "John", "Juju", "Adnan", "Owen"};
		int[] debt = {10, 1000, 10000, 7500, 2000};
		String[] reason = {"poor", "car", "travel", "stocks", "business"};
		
		for(int i = 0; i < names.length; i++) 
		{
			System.out.println("NAME: "+ names[i] +"\nDEBT: $"+ debt[i] +"\nREASON: "+ reason[i] +"\n");
		}

	}

}
