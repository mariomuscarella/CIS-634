import java.util.Scanner;

public class DiceGame
{
	public static void main( String [] args )
	{
		//Rules of the Game
		System.out.println("          Rules of the Game         		");
		System.out.println("                   							");
		System.out.println("  Roll a pair of dice vs Computer  			");
		System.out.println("                   							");
		System.out.println("  The first player to reach 100 points wins	");
		System.out.println("                   							");
		System.out.println("  Rolling a 1 ends your turn	         	");
		System.out.println("                   							");
		System.out.println("  Please follow direction for required input");
		System.out.println("  'y' for yes, any key to end turn          ");
		System.out.println("  'done' when die value ends turn           ");
		System.out.println("                   							");
		
		Cup d1 = new Cup(); //Creating PairOfDice object
		
		int turnTotal = 0;
		int computerTotal = 0; //your total
		int playerTotal = 0; //computer's total
		int turnOver = 1; //give up die
		int winner = 100; //reached before winning
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner( System.in );
		String answer; //answer from user
		
		//repeating the change between user and computer
		do{
			if (playerTotal <= winner && computerTotal <= winner)
			{
				System.out.println("Your turn!");
				
				//player's turn
				do
				{
				System.out.println("Type 'y' if ready and any other key to end turn.");
				answer = in.next();
				
				if (answer.equalsIgnoreCase("y") && playerTotal <= winner && computerTotal <= winner) {
				    d1.roll();
				    System.out.println(d1.d1);
				    System.out.println(d1.d2);
					
					//determine players turn 
					if (d1.getDie1() == turnOver || d1.getDie2() == turnOver){
						System.out.println("You rolled a 1. Your turn is over.");
						System.out.println("Please type 'done' when you are ready to turn the dice over to the Computer.");
						answer = in.next();
					}
					else
					{
						turnTotal = turnTotal + d1.getDiceSum();
						playerTotal = playerTotal + d1.getDiceSum();
						System.out.println("Your Turn Total: " + turnTotal);
						System.out.println("Your Grand Total: " + playerTotal);
					}
				}
				}
				
				while (answer.equalsIgnoreCase("y") && playerTotal <= winner && computerTotal <= winner);
				turnTotal = 0; // turn total assigned to 0
				System.out.println();
				System.out.println("Your Grand Total is: " + playerTotal);
				System.out.println("The Computer's Grand Total is: " + computerTotal);
				System.out.println();
			
				//Begin the Computer's turn
				turnOver = 1; //turn over die roll
				int answercomp = 1; 
				
				do
				{
					if ( answercomp == 1 && playerTotal <= winner && computerTotal <= winner) {
					    d1.roll();
					    System.out.println("Computer rolled a " + d1.getDie1());
					    System.out.println("Computer rolled a " + d1.getDie2());
								if (d1.getDie1() == turnOver || d1.getDie2() == turnOver)
								{
									System.out.println("The Computer rolled a 1. Their turn is over.");
									answercomp = 0;
								}
								
								else
								{
									turnTotal = turnTotal + d1.getDiceSum();
									computerTotal = computerTotal + d1.getDiceSum();
									System.out.println("The Computer's Turn Total is: " + turnTotal);
									System.out.println("The Computer's Grand Total is: " + computerTotal);
								}
					}
				}
				
				while (answercomp == 1 && playerTotal <= winner && computerTotal <= winner);
				turnTotal = 0; //turn total assigned to 0
			
				if (playerTotal <= winner || computerTotal <= winner)
				{
					System.out.println();
					System.out.println("The Computer's Grand Total is: " + computerTotal);
					System.out.println("Your Grand Total is: " + playerTotal);
					System.out.println();
				}
			
				else
				{
				System.out.println();
				System.out.println();
				}
			}
		}
		
		while(playerTotal <= winner && computerTotal <= winner);
		
		//Check who is a winner
		if (playerTotal >= winner)
			System.out.println("You win!");
		else
			System.out.println("You lose!");
	
	}
}
