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
 * Enemy class:
 * This class will solely focus on the attributes of the enemy
 */

public class Enemy {
	
	// instantiates weapon utilized by enemy during fights
	Gun gun;

	// sets the max health of enemy encounters to 5
	private final static int MAX_HEALTH = 5;
	
	// hold the current value of health 
	private int health;

	/**
	 * default constructor
	 * 
	 * sets the enemy's health = 5
	 */
	public Enemy() {
		health = MAX_HEALTH;
	}
	
	/**
	 * will spawn an enemy with default health and default weapon
	 */
	public void spawnEnemy(){
		health = MAX_HEALTH;
		gun = new Gun(1); // uses pistol as example
	}
	
	/**
	 * when the enemy pulls the trigger, subtracts 1 from ammo counter
	 */
	public void enemyShoot(){
		gun.gunShoot();
	}

	/**
	 * This method will be called when the enemy has been hit by the user. It
	 * will also subtract one point from its health depending on the weapon used
	 */
	public void hit(int damage) {
		health -= gun.gunDamage(damage);
	}
	
	/**
	 * checks if enemy is dead or alive
	 * 
	 * @return
	 * true = dead
	 * false = alive
	 */
	public boolean isDead(){
		if(health <= 0)
			return true;
		else
			return false;
	}
	
	/**
	 * depends on the accuracy of the weapon when enemy pulls the trigger
	 * 
	 * @return
	 * true = hit
	 * false = miss
	 */
	public boolean hitMiss(){
		return gun.accuracy();
	}

	/**
	 * The setter for the variable health
	 * 
	 * @param health
	 *            will set the parameter value of health to the private field
	 *            health
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * heals the enemy to max health
	 */
	public void heal() {
		health = MAX_HEALTH;
	}

	/**
	 * This getter for the variable health
	 * 
	 * @return This will return the value associated with the health field in
	 *         this class
	 */
	public int getHealth() {
		return health;
	}
}
