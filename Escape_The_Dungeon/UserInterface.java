/**
 * CS 141: Intro to Programming and Problem Solving
 *
 * Programming Assignment #3
 *
 * Escape the Dungeon
 * The user has to escape the dungeon by taking 10 steps.
 * Each step user takes, enemies might spawn and attack user.
 * The user has the opportunity to fight each enemy and kill them
 * in order to escape dungeon. Power-ups are given throughout the journey
 *
 * @author Miguel Menjivar
 * 
 * UserInterface class: 
 * It is responsible for printing statements onto the
 * screen for the user to read and navigate through the game
 */

import java.util.Scanner;

public class UserInterface {

	Scanner keyboard = new Scanner(System.in);

	/**
	 * Title of the program to be printed when it first starts
	 */
	public void introduction() {
		System.out.println("Welcome to Escape the Dungeon!");
		System.out.println();

		instructions();
	}

	/**
	 * Instructions on what the game is about will be printed at the start of
	 * the game
	 */
	public void instructions() {
		System.out.println("INSTRUCTIONS:");
		System.out.println("You are in a cave and must escape the dungeon in 10 steps. \n"
				+ "You utilize a weapon of choice: pistol, shotgun, or rifle. You will \n"
				+ "engage in combat with enemies as you are trying to escape the dungeon \n"
				+ "You have the option to shoot or run away. There will be power-ups along \n" + "the way.");
		System.out.println();
	}

	/**
	 * Prompts user to choose a weapon 1 = pistol 2 = shotgun 3 = rifle
	 * 
	 * @return weapon chosen by user
	 */
	public int chooseWeapon() {
		System.out.println("Menu");
		System.out.println("1) Pistol\n2) Rifle\n3) Shotgun");
		System.out.print("Choose your weapon: ");

		int weaponChoice = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println();
		return weaponChoice;
	}

	/**
	 * When the player has successfully exited the cave
	 */
	public void endGame() {
		System.out.println("You have exited the cave!");
	}

	/*
	 * statement that keeps track of how many steps user has taken to exit cave
	 */
	public void takeStep(int stepsTaken) {
		System.out.println("You have taken " + stepsTaken + " step(s)");
		System.out.println();
	}

	/**
	 * prompts user to either shoot weapon or run away
	 * 
	 * @return true if user chooses shoot option false if choice is to run away
	 */
	public boolean shootRun() {
		System.out.print("What would you like to do?\n" + "Shoot or run away: ");
		String choice = keyboard.nextLine().substring(0).toLowerCase();

		if (choice.equals("s")) // shoot
			return true;
		else // run away
			return false;
	}

	/**
	 * enemy has spawned string
	 */
	public void enemySpawned() {
		System.out.println("An enemy has spawned!");
	}

	/**
	 * Player's health bar tracker
	 * 
	 * @param health
	 *            integer that holds how much health player has
	 */
	public void playerHealthBar(int health) {
		System.out.println("Player's health: " + health);
	}

	/**
	 * ammunition counter for each weapon when utilized
	 * 
	 * @param weaponChoice
	 *            holds the value of specific weapon player/ enemy chose 
	 *            1 = pistol, 2 = rifle, 3 = shotgun
	 * 
	 * @param ammoCount
	 *            holds the specific amount of ammunition that remains in the
	 *            clip
	 */
	public void ammoCount(int weaponChoice, int ammoCount) {
		switch (weaponChoice) {
		case 1:
			System.out.println("Pistol: " + ammoCount + " bullet(s) remain");
			break;
		case 2:
			System.out.println("Rifle: " + ammoCount + " bullet(s) remain");
			break;
		case 3:
			System.out.println("Shotugn: " + ammoCount + " bullet(s) remain");
			break;
		}
	}

	/**
	 * when the enemy has been damaged by the player
	 * 
	 * @param options
	 *            different scenarios if player or enemy was hit or not
	 */
	public void enemyPlayerHit(int options) {
		switch (options) {
		case 1:
			System.out.println("HIT: enemy has been wounded!");

			break;
		case 2:
			System.out.println("MISS: enemy wasn't hurt.");
			break;
		case 3:
			System.out.println("HIT: player has been hit!");
			System.out.println();
			break;
		case 4:
			System.out.println("MISS: player was not hit");
			System.out.println();
			break;
		}
	}

	/**
	 * When the player picks up a power up after an enemy encounter
	 * 
	 * @param num
	 *            depends on number, it will be power up player will receive 
	 *            1 = health pack, 2 = ammunition, 3 = nothing
	 * 
	 * @param amt
	 *            Be specifically as to how much of said item player will
	 *            receive
	 */
	public void powerUp(int num, int amt) {
		switch (num) {
		case 1:
			System.out.println("Power UP!: You have received a health pack!");
			break;
		case 2:
			System.out.println("Power UP!: You have received " + amt + " bullet(s)");
			break;
		case 3:
			System.out.println("You didn't get anything.");
			break;
		}
	}

	/**
	 * When the player or enemy dies during the game
	 * 
	 * @param number
	 *            Depending on situation 1 = enemy died, 2 = player died
	 */
	public void enemyPlayerDied(int number) {
		switch (number) {
		case 1:
			System.out.println("Enemy has died");
			break;
		case 2:
			System.out.println("Player has died");
			break;
		}
	}

	/**
	 * the health bar for the enemy
	 * 
	 * @param health
	 *            will print the current value of enemy's health
	 */
	public void enemyHealthBar(int health) {
		System.out.println("Enemy's health: " + health);
	}
}
