/**
 * Miguel Menjivar
 * 
 * Rock, Paper, Scissors
 */
package roshambo;

/**
 * @author Miguel
 *
 * this class will keep track of the score for each game played of rock paper
 * scissors
 */
public class Score
{
	private int player = 0;
	private int computer = 0;
	private int tie = 0;

	/**
	 * Will add 1 to the current score each time the player wins
	 */
	public void playerScore()
	{
		player++;
	}

	/**
	 * Will add 1 to the current score each time the computer wins
	 */
	public void computerScore()
	{
		computer++;
	}

	/**
	 * Will add 1 to the score each time there is a draw between both the
	 * computer and the player
	 */
	public void tieScore()
	{
		tie++;
	}

	/**
	 * This will show the value of the user to the terminal
	 * 
	 * @return will return the value that was added up by the player as the game
	 * progressed
	 */
	public int viewPlayerScore()
	{
		return player;
	}

	/**
	 * This will show the value of the computer to the terminal
	 * 
	 * @return will return the value that was added up by the computer as the
	 * game progressed
	 */
	public int viewComputerScore()
	{
		return computer;
	}

	/**
	 * This will show the value of every tie to the terminal
	 * 
	 * @return will return the value that was added up each time there was a
	 * draw between the computer and the player
	 */
	public int viewTieScore()
	{
		return tie;
	}
}
