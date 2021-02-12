package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel 
{	public void run() 
	{	firstMove();
		move2end();
	}
	
	private void firstMove()
	{	move();
		check4voteAndClean();
	}
	
	private void check4voteAndClean()
	{	/*	Assumption:
				Positioned in the center of a rectangle facing East.
				
			Post condition:
				Positioned in the center of a rectangle facing East.
	 	*/
		if( noBeepersPresent())
		{	turnLeft();
			move();
			pickAll();
			turnAround();
			move();
			move();
			pickAll();
			turnAround();
			move();
			turnRight();
		}
	}
	
	private void pickAll()
	{	while( beepersPresent())
			pickBeeper();
	}
	
	private void move2end()
	{	while( frontIsClear())
		{	move();
			if( frontIsClear())
			{	move();
				check4voteAndClean();
			}
		}
	}
}
