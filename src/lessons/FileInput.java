package lessons;

import java.io.*;

public class FileInput {

	public static void main(String[] args) {
		
		int numItems = 4;
		
		String[] product = new String[numItems];
		int[] quantity = new int[numItems];
		double[] price = new double[numItems];
		
		try 
		{
			// create file reader (constructor)
			FileReader file = new FileReader("inventory.txt");
			
			// load contents of file into memory
			BufferedReader buffer = new BufferedReader(file);
			
			for(int i = 0; i < product.length; i++) 
			{
				product[i] = buffer.readLine();
				quantity[i] = Integer.parseInt(buffer.readLine());
				price[i] = Double.parseDouble(buffer.readLine());
				buffer.skip(2);
			}
			
			// clear memory
			buffer.close();
			
			for(int i = 0; i < product.length; i++) 
			{
				System.out.println("PRODUCT: "+ product[i] +"\nQUANTITY: "+ quantity[i] +"\nPRICE: $"+ price[i] +"\n");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
