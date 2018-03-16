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
 * Target class: has attributes of the target whether hit or miss
 */
package targetPractice;

public class Target {
	private static final int TARGET_NUMBERS = 5;

	/**
	 * The private field target will hold the value for the targets that the
	 * weapons will shoot at
	 */
	private int target;

	/**
	 * default constructor
	 */
	public Target() {
		target = TARGET_NUMBERS;
	}

	/**
	 * The method targetCreation will create the five different targets that the
	 * weapons will shoot at when the game begins
	 */
	public void targetCreation() {
		target = TARGET_NUMBERS;
	}

	public void targetHit() {
		target--;
	}

	/**
	 * This method is used to reload the targets if the user wants to
	 */
	public void reloadTargets() {
		target = TARGET_NUMBERS;
	}

	/**
	 * Setter for target method sets value equal to the private field values
	 */
	public void setTarget(int target) {
		this.target = target;
	}

	/**
	 * getter for private field
	 * 
	 * @return will return the value of how much targets throughout the game
	 */
	public int getTarget() {
		return target;
	}
}
