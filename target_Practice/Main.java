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
 * Main: Runs the program
 */
package targetPractice;

public class Main {
	public static void main(String[] args){
		//UserInterface test = new UserInterface();
		GameEngine gE = new GameEngine();
		gE.start();
	}

}
