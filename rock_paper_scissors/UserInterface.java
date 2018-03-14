/**
 * Miguel Menjivar
 * 
 * Rock, Paper, Scissors
 */
package roshambo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Miguel
 *
 * This class will be be in charge of printing all the information onto the
 * terminal for the user to see
 */
public class UserInterface
{
	GameEngine gE = new GameEngine();
	Scanner keyboard = new Scanner(System.in);

	private String letter;
	private int number;

	/**
	 * This method is called from the main class when the program first starts
	 * and prompts the user if they want to play the game
	 */
	public void initialize()
	{
		System.out.println("ROCK PAPER SCISCORS GAME\n");
		System.out.println("Would you like to play the game?");
		System.out.println("Please enter 'y' for yes and 'n' for no");
		while (true)
		{
			letter = keyboard.nextLine();
			if (letter.equals("yes") || letter.equals("Y") || letter.equals("no") || letter.equals("n"))
			{
				switch (letter.toLowerCase())
				{
					case "yes":
						playGame();
						break;
					case "y":
						playGame();
						break;
					case "n":
						System.exit(0);
						break;
					case "no":
						System.exit(0);
				}
			} else
			{
				System.out.println("Please enter from the choices given");
			}
		}

	}

	/**
	 * This method gives the user the option to choose from the various options
	 * of rock, paper, and scissors which puts the game into motion
	 */
	public void playGame()
	{
		System.out.println("\nPlease choose from the menu below");

		while (true)
		{
			System.out.println("\n(1)Rock   (2)Paper   (3)Scissors   (4)Check Score   (5)Quit");

			try
			{
				number = keyboard.nextInt();

				switch (number)
				{
					case 1:
						gE.rock();
						break;
					case 2:
						gE.paper();
						break;
					case 3:
						gE.scissors();
						break;
					case 4:
						printScores();
						break;
					case 5:
						System.exit(0);
						break;
				}
			} catch (InputMismatchException e)
			{
				System.out.println("Please input a number not a letter");
				keyboard.next();
				continue;
			}
		}

	}

	/**
	 * This method will print the scores whenever the user wants to check the
	 * scores and it will display all the information for the user to see
	 */
	public void printScores()
	{
		System.out.println("\nPlayer has " + gE.printPlayerScore() + " points");
		System.out.println("Computer has " + gE.printComputerScore() + " points");
		System.out.println("There are " + gE.printTieScore() + " ties in game");
	}
}
