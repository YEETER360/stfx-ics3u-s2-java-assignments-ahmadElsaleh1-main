package sandbox;

import java.net.*;
import java.util.Arrays;
import java.util.Collections;
import java.io.*;

public class TriviaGameServer {

	private Socket socket = null;
	private DataInputStream dataInput = null;
	private InputStream input = null;
	static DataOutputStream dataOutput = null;
	static OutputStream output = null;
	private ServerSocket server = null;
	
	int i = 0;
	
	String names[] = new String[0];
	String scores[] = new String[0];
	
	public TriviaGameServer(int port) throws IOException, InterruptedException
	{
		server = new ServerSocket(port);
		System.out.println("Server started on port "+ port);
		System.out.println("Waiting for client...");
		
		while(true)
		{
			socket = server.accept();
			System.out.println("Connection from "+ socket);
				
			// get the output stream from the socket
	        output = socket.getOutputStream();
	        // create a data output stream from the output stream so we can send data through it
	        dataOutput = new DataOutputStream(output);
			
			// get the input stream from the connected socket
		    input = socket.getInputStream();
		    // create a DataInputStream so we can read data from it
		    dataInput = new DataInputStream(input);
		    
		    // Wait a bit before accepting user input, otherwise input.available() will always return 0
		    synchronized (input) {
		    	  input.wait(10);
		    	}
		    
		    //System.out.println(input.available()); // For debugging
		    if(input.available() > 0) // if there is incoming input from client (adding new name and score from client)
		    {
		    	// Copy names array and add new name from client
		    	String tempNames[] = new String[names.length + 1];
		    	for(int n = 0; n < names.length; n++) 
		    	{
		    		tempNames[n] = names[n];
		    	}
		    	tempNames[i] = dataInput.readUTF();
			    System.out.println("Saved client name: " + tempNames[i]);
			    //System.out.println(input.available()); // For debugging
			    
			    // Copy scores array and add new score from client
			    String tempScores[] = new String[scores.length + 1];
		    	for(int n = 0; n < scores.length; n++) 
		    	{
		    		tempScores[n] = scores[n];
		    	}
		    	tempScores[i] = dataInput.readUTF();
			    System.out.println("Saved client score: " + tempScores[i]);
			    //System.out.println(input.available()); // For debugging
			    
			    //Sort arrays by highest score first
			    for(int n = 0; n < tempNames.length; n++) 
		    	{
		    		tempNames[n] = tempScores[n].charAt(0) + tempNames[n];
		    	}
			    Arrays.sort(tempNames, Collections.reverseOrder());
		        Arrays.sort(tempScores, Collections.reverseOrder());
		        
		        for(int n = 0; n < tempNames.length; n++)
		        {
		        	tempNames[n] = tempNames[n].substring(1);
		        }
		        
		        scores = tempScores;
		        names = tempNames;
			    
			    //Send names
			    String joinedNames = String.join(",", names);
				dataOutput.writeUTF(joinedNames);
	            dataOutput.flush();
	            System.out.println("Sent names to client successfully");

	            //Send scores
			    String joinedScores = String.join(",", scores);
				dataOutput.writeUTF(joinedScores);
	            dataOutput.flush();
	            System.out.println("Sent scores to client successfully");
	            
	            i++;
		    }
		    else // if there is no input from client (request for current arrays)
		    {	            
		    	System.out.println("Incoming request for list...");
		    	String joinedNames = String.join(",", names);
				dataOutput.writeUTF(joinedNames);
	            dataOutput.flush();
	            System.out.println("Resent names to client successfully");
	            
	            String joinedScores = String.join(",", scores);
				dataOutput.writeUTF(joinedScores);
	            dataOutput.flush();
	            System.out.println("Resent scores to client successfully");
		    }
		    System.out.println("\nWaiting for client...");
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException{

		TriviaGameServer server = new TriviaGameServer(7777);

	}

}