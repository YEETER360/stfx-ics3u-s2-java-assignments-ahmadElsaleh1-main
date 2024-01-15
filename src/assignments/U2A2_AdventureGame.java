package assignments;

import java.util.Scanner;

class U2A2_AdventureGame 
{ 
	public static void main(String[] args) 
	{
		boolean gameOver = false;
		
		String a = "";
		String b = "";
		String c = "";
    
		Scanner sc = new Scanner(System.in);
  
		System.out.println("You wake up with a mild pain in your head, you're trapped in a spooky enclosed room...");
		System.out.println("There are no windows, only a single door...");
		System.out.println("...it seems that you are in a Haunted House!");

	    while(!gameOver)
	    {
	    	System.out.println("Do you try to open the door (D) or search the room some more (S)?");
    	    a = sc.next();
	    	
	    	if(a.equalsIgnoreCase("D"))
	    	{
		        System.out.println("You approach the door and reach for the handle");
		        System.out.println("Leaning yourself behind the door, you turn the unnaturally cold handle. It turns all the way and the door creaks inwards");
		        System.out.println("You see a flight of stairs just a little away from the door, and there seems to be faint whispers coming from the top");
		        System.out.println("It seems that you're in the basement. You try to crane you head to see farther up, but to no avail");
		        System.out.println("Do you go up the stairs (U) or wait (W)?");
		        b = sc.next();
	  
		        if(b.equalsIgnoreCase("U"))
		        {
		        	System.out.println("You slowly creep up the stairs, staying as low as possible as to not get spotted by something lurking up ahead...");
		        	System.out.println("In front of you are more stairs, to the right a window with moonlight shining through and to the left a door");
		        	System.out.println("You hear footsteps nearing from above you...");
		        	System.out.println("Quickly!! Do you go left to the door (L), stright up the stairs (S), or right to the window (R)?");
		        	c = sc.next();
		        	
		        	if(c.equalsIgnoreCase("L"))
			        {
			        	System.out.println("You sprint left to the door, grip the handle and turn it...");
			        	System.out.println("...it's locked!!");
			        	System.out.println("You hear the footsteps getting louder and louder...");
			        	System.out.println("Panicked and desperate, you violently shake the handle, but to no result");
			        	System.out.println("You turn back to jump out the window, but it's too late");
			        	System.out.println("A humanoid figure is standing at the foot of the stairs, staring you down with bleak, white eyes");
			        	System.out.println("The figure then speaks in a shrill voice, 'Say goodnight...'");
			        	System.out.println("As if you'd gone blind, you vision goes dark, and you are left with the words echoing infinitly in your head, 'Say goodnight... goodnight... goodnight...'");
			        	
			        	gameOver = true;
			        }
			        else if(c.equalsIgnoreCase("S"))
			        {
			        	System.out.println("You run up the stairs and are met with a humanoid figure, standing in a door frame in front of you, staring you down with bleak, white eyes...");
			        	System.out.println("The figure then speaks in a shrill voice, 'Say goodnight...'");
			        	System.out.println("As if you'd gone blind, you vision goes dark, and you are left with the words echoing infinitly in your head, 'Say goodnight... goodnight... goodnight...'");
			        	
			        	gameOver = true;
			        }
			        else if(c.equalsIgnoreCase("R"))
			        {
			        	System.out.println("You leave the stairs and sprint right down the hall to the window");
			        	System.out.println("Through it you see the outside world, your escape from this place");
			        	System.out.println("You go back a little to get a running start, but you hear the footsteps right on your tail...");
			        	System.out.println("...without hesitation, you dash through the hall towards the window, time your jump perfectly and dolphin dive through the window, smashing it as you go through");
			        	System.out.println("Now outside, you run as far away as possible without looking back");
			        	System.out.println("What an escape!");
			        	
			        	gameOver = true;
			        }
			        else System.out.println("Please enter a valid option!");
		        }
		        else if(b.equalsIgnoreCase("W"))
		        {
		        	System.out.println("You wait for a bit.");
		        	System.out.println("The whispers you heard earlier become louder and louder, and you hear footsteps getting nearer...");
		        	System.out.println("Before you have time to react, a humanoid figure steps down onto the top step");
		        	System.out.println("You freeze in place.");
		        	System.out.println("The whispers get louder, and you can barely make out any words from them, but they seem to be saying ,'No escape... no escape...' over and over");
		        	System.out.println("The figure is coming closer down the stairs");
		        	System.out.println("You come to your senses and dash back into the room shutting the door behind you and lying against it to keep it shut");
		        	System.out.println("The thudding footsteps are right outside the door now, whispers still echoing around you 'No escape... no escape...'");
		        	System.out.println("The enitiy then speaks in a shrill voice, 'Say goodnight...'");
		        	System.out.println("As if you'd gone blind, you vision goes dark, and you are left with the words echoing infinitly in your head, 'Say goodnight... goodnight... goodnight...'");
		        	
		        	gameOver = true;
		        }
		        else System.out.println("Please enter a valid option!");
	    	}
	    	else if(a.equalsIgnoreCase("S"))
		    {
	    		System.out.println("You look around. The room still baren, just four walls.");
	    		System.out.println("Just when you're about to give up, you spot a section of a wall that seems out of place...");
	    		System.out.println("You get closer to investigate. It's a vent, with a slight, chilly air blow from it");
	    		System.out.println("You pull off the metal grate and climb in");
	    		System.out.println("You move forwards, carefull not to make too much noise");
	    		System.out.println("The vent winds upwards and you see a faint white light up ahead");
	    		System.out.println("The vent opens to the outside! You kick the vent open, hop out and run as far away as possible without looking back.");
		  
	    		gameOver = true;
		    }
		    else System.out.println("Please enter a valid option!");
	    }
  }
}