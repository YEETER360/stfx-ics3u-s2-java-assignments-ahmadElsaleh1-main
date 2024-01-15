package lessons;

import java.io.*;

public class FileOutput {

	public static void main(String[] args) {

		String[] product = {"milk", "eggs", "cheese", "butter", "bread"};
		int[] quantity = {12, 24, 17, 33, 42};
		double[] price = {4.99, 3.99, 5.99, 6.99, 5.99};

		try 
		{
			// create file (constructor)
			FileOutputStream fout = new FileOutputStream("groceryItems.txt");
			
			// load contents of file into memory
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			// create file writer object, "8859_1" means plain ASCII text
			OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
			
			//write to file
			for(int i = 0; i < product.length; i++) 
			{
				out.write("\n"+ product[i] +"\n"+ quantity[i] +"\n$"+ price[i] +"\n");
			}
			
			//force data to be written even if program crashes
			out.flush();
			
			//clear memory
			out.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
