
import java.util.Random;
import java.util.Scanner;


public class Rock_Paper_Scissors{

	public static void main (String[]args){
	
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	int playerScore = 0;
	int aiScore = 0;
	
	
	int playerChoice;
	int aiChoice;
	
	System.out.println("You are going to play Rock, Paper, Scissors against an Computer opponent");
	System.out.println("When making your choice Rock = 1, Paper = 2, and Scissors = 3 \n\nWhoever gets to 5 points first wins.  Good luck\n");
	
	while(playerScore < 5 && aiScore < 5){
	
		System.out.println("\nRock, Paper, Scissors, GO!");
		playerChoice = scan.nextInt();
		
		aiChoice = rand.nextInt(3) + 1;
		
		if(playerChoice == aiChoice){
			System.out.println("You tied. Go again.");
		}
		
		else if(playerChoice == 1 && aiChoice == 2){
			aiScore++ ;
			System.out.println("You: Rock  Computer: Paper");
		}
		else if(playerChoice == 1 && aiChoice == 3){
			playerScore++;
			System.out.println("You: Rock  Computer: Paper");
		}
		else if(playerChoice == 2 && aiChoice == 1){
			playerScore++;
			System.out.println("You: Paper  Computer: Rock");
		}
		else if(playerChoice == 2 && aiChoice == 3){
			aiScore++;
			System.out.println("You: Paper  Computer: Scissors");
		}	
		else if(playerChoice == 3 && aiChoice == 1){
			aiScore++;
			System.out.println("You: Scissors  Computer: Rock");
		}
		else if(playerChoice == 3 && aiChoice == 2){
			playerScore++;
			System.out.println("You: Scissors  Computer: Paper");
		}	
		
		System.out.println("Player score: " + playerScore + " Computer score: " + aiScore);
		
	}
	
	if(aiScore == 5){
		System.out.println("\nThe Computer wins!  Better luck next time.");
	}
	
	else{
		System.out.println("\nYOU WIN!  Good job!");
	}




		
	
	}
}
	