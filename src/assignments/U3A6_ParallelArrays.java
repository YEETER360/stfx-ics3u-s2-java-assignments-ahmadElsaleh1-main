package assignments;

import java.io.*;

public class U3A6_ParallelArrays {

	public static void main(String[] args) {
		
		int index = 8;
		String[] species = new String[index];
		int[] population = new int[index];
		
		try 
		{			
			// create file reader (constructor)
			FileReader file = new FileReader("endangeredAnimals.txt");
						
			// load contents of file into memory
			BufferedReader buffer = new BufferedReader(file);
			
			for(int i = 0; i < species.length; i++) 
			{
				species[i] = buffer.readLine();
				population[i] = Integer.parseInt(buffer.readLine());
			}
			
			// clear memory
			buffer.close();
			
			for(int i = 0; i < species.length; i++) 
			{
				System.out.println("SPECIES: "+ species[i] +"\nPOPULATION: "+ population[i] +"\n");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
