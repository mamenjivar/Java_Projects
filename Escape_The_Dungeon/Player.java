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
 * Player class:
 * This class will solely focus on the player attributes
 */

public class Player {
	// max health user can acquire by default
	private final int MAX_HEALTH = 20;

	// will hold the health for player
	private int health;

	// instantiates weapon player will use
	private Gun gun;

	/**
	 * constructor #2
	 * 
	 * sets value of player's health to max health health = 20
	 * 
	 * sets weapon of choice to gun class
	 */
	public Player(int gunDecision) {
		health = MAX_HEALTH;
		gun = new Gun(gunDecision);
	}

	/**
	 * This method will set the value of health back to 20 to simulate that the
	 * person received a health pack
	 */
	public void heal(int healUp) {
		health += healUp;
	}

	/**
	 * When the player pulls the trigger, will subtract 1 from ammunition
	 * counter
	 */
	public void playerShoot() {
		gun.gunShoot();
	}

	/**
	 * used for power up when user reloads weapon
	 */
	public void playerReload(int number) {
		gun.reload(number);
	}

	/**
	 * When the player has been hit by the enemy
	 */
	public void hit(int damage) {
		health -= gun.gunDamage(damage);
	}

	/**
	 * keeps track of how many bullets remain
	 */
	public int ammoCounter() {
		return gun.getAmmo();
	}

	/**
	 * The accuracy of the weapon detects whether it was a hit or miss to enemy/
	 * player
	 * 
	 * @return
	 * true = hit 
	 * false = miss
	 */
	public boolean hitMiss() {
		return gun.accuracy();
	}

	/**
	 * checks if player is dead or alive
	 * 
	 * @return 
	 * true = player is dead 
	 * false = player is alive
	 */
	public boolean isDead() {
		if (health <= 0)
			return true;
		else
			return false;
	}

	/**
	 * The setter for the health field
	 * 
	 * @param health
	 *            will set the parameter equal to the private field health
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * The getter for health
	 * 
	 * @return will return the value associated with the private field health
	 */
	public int getHealth() {
		return health;
	}
}
