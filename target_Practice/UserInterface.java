/**
 * CS 141: Intro to Programming and Problem Solving
 * 
 * Programming Assignment #2
 * 
 * The purpose is that the user will
 * be able to choose a weapon ranging from hand guns, rifles, and shotguns. They also
 * have to shoot at five targets.
 * 
 * @author Miguel Menjivar
 * 
 * User Interface: prints statements to terminal
 */
package targetPractice;

import java.util.Scanner;

public class UserInterface {
	Scanner keyboard = new Scanner(System.in);
	GameEngine gE;
	Target bullseye;
	
	/**
	 * title for program
	 */
	public void introduction(){
		System.out.println("Welcome to Target Practice");
		System.out.println();
	}

	/**
	 * This is the user interface where most of the gaming interaction takes
	 * place. It is also the introduction where you can choose your weapon of
	 * choice before the game begins
	 */
	public String Intro() {
		System.out.println("Please choose: pistol, shotgun, rifle");
		String weapon = keyboard.nextLine();
		System.out.println();

		return weapon;
	}
	
	/**
	 * prompts user if they want to play again with different weapon
	 * 
	 * @return returns yes or no (first letter only)
	 */
	public String replay(){
		System.out.println("Would you like to play again?");
		System.out.println("(y) yes (n) no");
		return keyboard.nextLine().toLowerCase();
	}

	/**
	 * prints out the initial values of both target and weapon
	 * 
	 * @param initialTargets
	 * @param initialAmmo
	 */
	public void printRange(String gunName, int initialTargets, int initialAmmo) {
		System.out.println(initialTargets + " target(s) remaining");
		System.out.println(gunName + " has " + initialAmmo + " rounds remaining");
	}

	/**
	 * prompt user to press either s or q to shoot or quit game and returns
	 * user response
	 * 
	 * @return returns response whether "s" to shoot or "q" to quit
	 */
	public String shoot() {
		System.out.print("Enter s to shoot or q to quit: ");
		String shot = keyboard.nextLine().toLowerCase();
		System.out.println();

		return shot;
	}

	/**
	 * will print how much ammunition remains in weapon
	 * 
	 * @param ammoCounter
	 */
	public void shotWeapon(int ammoCounter) {
		System.out.println("SHOT: " + ammoCounter + " rounds remaining");
	}

	/**
	 * true will be when target is hit
	 * false will be when target is missed
	 * 
	 * @param targetCounter
	 */
	public void hitTarget(int targetCounter, boolean hitMiss) {
		if (hitMiss) {
			System.out.println("HIT: " + targetCounter + " target(s) remaining");

		} else
			System.out.println("MISS: " + targetCounter + " target(s) remaining");
	}

	/*
	 * when user chooses an option other than s or q s = shoot q = quit
	 */
	public void wrongChoice() {
		System.out.println("This option does not exist");
	}
}
