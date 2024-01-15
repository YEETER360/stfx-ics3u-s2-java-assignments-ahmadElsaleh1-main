package sandbox;

import java.util.Scanner;

class AdventureGame 
{ 
	public static void main(String[] args) 
	{
		boolean gameOver = false;
		
		String entry = "";
		String entryF = "";
		String entryB = "";
		String entryR = "";
		String entryS = "";
    
		Scanner sc = new Scanner(System.in);
  
		System.out.println("Welcome to The Great Diamond Heist");
		System.out.println("You are on an epic heist for the World's Largest Diamond, owned by Elon Musk");
		System.out.println("You must get in the high security, heavily guarded home of Elon and get out with the diamond successfully undetected");
	    System.out.println("The diamond is located in a secret room underneath Elon Musk's bed, with a Quantumly encryped password that changes every 12h, with the decryption key saved on Elon's smart watch");
	    System.out.println("It is 2am, you have confirmed that Elon Musk is asleep. You vault the fence surrounding his mansion and approach.");
	    System.out.println("Do you enter from the front (F), back (B), roof (R) or from the sewers (S)?");
	    entry = sc.next();

	    while(!gameOver)
	    {
	    	if(entry.equalsIgnoreCase("F"))
	    	{
		        System.out.println("You approach the front door and hear an automated message go off in a robotic voice which says, 'State the purpose of the visit, you have 10 seconds to answer'");
		        System.out.println("Do you run away (R) or say that you are his mother visiting (S)?");
		        entryF = sc.next();
	  
		        if(entryF.equalsIgnoreCase("R"))
		        {
		        	System.out.println("You run back to vault the fence, but guards have already been alerted. You narrowly escape, and fail the mission. You made some dumb decisions...");
		        	gameOver = true;
		        }
		        else if(entryF.equalsIgnoreCase("S"))
		        {
		        	System.out.println("You say in an elderly voice,'It's me! Your mother! Now let me in.'");
		        	System.out.println("The robot voice replies back 'There is no scheduled visit of Elon's mother for 2:03am, you are an imposter.'");
		        	System.out.println("The floor under you opens, and you fall down a tunnel. You find yourself in a dimly lit room with no doors or windows, then you hear the robot from above you now, 'Welcome to the dungeon'");
		        	System.out.println("You are stuck in Elon's dungeon for eternity. You made some very dumb decisions...");
		        	gameOver = true;
		        }
		        else System.out.println("Please enter a valid option!");
	    	}
	    	else if(entry.equalsIgnoreCase("B"))
		    {
	    		System.out.println("you went Right");
	    		System.out.println("Slide (S) or jump (J)?");
	    		entryB = sc.next();
		  
		        if(entryB.equalsIgnoreCase("S"))
		        {
		        	System.out.println("You slid");
		        }
		        else if(entryB.equalsIgnoreCase("J"))
		        {
		        	System.out.println("You jumped");
		        }
		        else System.out.println("Please enter a valid option!");
		    }
		    else System.out.println("Please enter a valid option!");
	    }
  }
}