import java.util.Random;

/**
 * @author Miguel Menjivar
 *
 * Rock, Paper, and Scissors game
 *
 * This class will be in charge of all the  possible scenarios
 * for each choice 
 */
public class GameEngine
{
	Score track = new Score();
	Random rand = new Random();

	private int num;

	/**
	 * This method will have all the possible outcomes when the user chooses
	 * rock as its choice.
	 * 
	 * There is a counter that will track the wins, losses, and ties of each
	 * game
	 */
	public void rock() // 1
	{
		num = rand.nextInt(3) + 1;

		if (num == 1)
		{
			System.out.println("it is a tie!");
			track.tieScore();
		} else if (num == 2)
		{
			System.out.println("You lose!");
			track.computerScore();
		} else if (num == 3)
		{
			System.out.println("You win!");
			track.playerScore();
		}
	}

	/**
	 * This method will have all the possible outcomes when the user chooses
	 * paper as its choice
	 * 
	 * There is also a counter that will keep track of the wins, losses, and
	 * ties of each game
	 */
	public void paper()
	{
		num = rand.nextInt(3) + 1;

		if (num == 1)
		{
			System.out.println("You Win!");
			track.playerScore();
		} else if (num == 2)
		{
			System.out.println("It's a tie!");
			track.tieScore();
		} else if (num == 3)
		{
			System.out.println("You Lose!");
			track.computerScore();
		}
	}

	/**
	 * This method will have all the possible outcomes when the user chooses
	 * scissors as its choice
	 * 
	 * There is also a counter that will keep track of the wins, losses, and
	 * ties of each game
	 */
	public void scissors() // 3
	{
		num = rand.nextInt(3) + 1;

		if (num == 1)
		{
			System.out.println("You Lose!");
			track.computerScore();
		} else if (num == 2)
		{
			System.out.println("You win!");
			track.playerScore();
		} else if (num == 3)
		{
			System.out.println("It's a tie!");
			track.tieScore();
		}
	}

	/**
	 * This method will keep track of the score that the player won in each
	 * match
	 * 
	 * @return is the current amount of wins the player has over the computer
	 */
	public int printPlayerScore()
	{
		return track.viewPlayerScore();
	}

	/**
	 * This method will keep track of the computer's wins over the player in
	 * each match played
	 * 
	 * @return Is the total amount of wins the computer has as the game
	 * progresses
	 */
	public int printComputerScore()
	{
		return track.viewComputerScore();
	}

	/**
	 * This method will keep track of the ties when both the computer and the
	 * player have the same choice in play
	 * 
	 * @return is the total amount of ties there is when the game ends in a draw
	 */
	public int printTieScore()
	{
		return track.viewTieScore();
	}
}
