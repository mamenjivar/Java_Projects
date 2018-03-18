/**
 * CS 141: Intro to Programming and Problem Solving
 *
 * Programming Assignment #3
 *
 * Escape the Dungeon:
 * The user has to escape the dungeon by taking 10 steps.
 * Each step user takes, enemies might spawn and attack user.
 * The user has the opportunity to fight each enemy and kill them
 * in order to escape dungeon. Power-ups are given throughout the journey
 *
 * @author Miguel Menjivar
 * 
 * Main class: 
 * This main program where the game will start. It will first
 * call the GameEngine and make the program run as a whole
 */

public class Main {

	public static void main(String[] args) {
		// change up format again to use gameengine as callee
		GameEngine ge = new GameEngine();
		ge.start();
	}
}
