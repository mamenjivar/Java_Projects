/**
 * Miguel Menjivar
 * 
 * Rock, Paper, Scissors
 */
package roshambo;

/**
 * @author Miguel
 *
 * Main class that begins the program
 */
public class Main
{

	/**
	 * @param args
	 * 
	 * Initializes the game by calling 
	 * the UserInterface class 
	 */
	public static void main(String[] args)
	{
		UserInterface ui = new UserInterface();
		ui.initialize();
	}
}
