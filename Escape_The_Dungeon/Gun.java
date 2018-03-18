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
 * Gun class:
 * This class will hold all the attributes of the weapon
 * accuracy, ammo count, and type of weapon
 */

import java.util.Random;

public class Gun {
	// The pistol field is set to 15 because it is max capacity of weapon
	// damage = 1
	// option 1
	private final static int MAX_PISTOL = 15;
	private final static int PISTOL_DAMAGE = 1;

	// rifle field is set to 10 because that is max capacity of this weapon
	// damage = 2
	// option 2
	private final static int MAX_RIFLE = 10;
	private final static int RIFLE_DAMAGE = 2;

	// shotgun field is set to 5 because it is max capacity of this weapon
	// damage = 3
	// option 3
	private final static int MAX_SHOTGUN = 5;
	private final static int SHOTGUN_DAMAGE = 3;
	
	// holds the basic gun functionality, will get chosen by user or computer
	private int gun;
	
	private final static int DEFAULT_ACCURACY = 5;
	
	Random rand = new Random();

	/**
	 * default constructor #2
	 */
	public Gun(int gun) {		
		switch(gun){
		case 1:
			this.gun = MAX_PISTOL;
			break;
		case 2:
			this.gun = MAX_RIFLE;
			break;
		case 3:
			this.gun = MAX_SHOTGUN;
			break;
		}
	}
	
	/**
	 * shoots weapon
	 * 
	 * need to check if ammo counter = 0
	 */
	public void gunShoot(){
		gun--;
	}

	/*
	 * used a power up. depending on how much ammunition was provided from 
	 * power up drop it will add on to total amount of ammunition already have
	 */
	public void reload(int reloadAmt) {
		gun += reloadAmt;
	}
	
	/**
	 * has a 50% chance of hitting or missing target
	 * 
	 * @return
	 * true = hit
	 * false = miss
	 */
	public boolean accuracy(){
		int randomAccuracy = rand.nextInt(10) + 1;
		if(randomAccuracy < DEFAULT_ACCURACY){
			return true;
		}
		else
			return false;
	}
	
	/**
	 * depending on weapon, it will give different point damage
	 * 1 = pistol damage (1)
	 * 2 = rifle damage (2)
	 * 3 = shotgun damage (3)
	 * 
	 * @param num gives the specific damage from weapon 
	 * 
	 * @return the damage weapon provided
	 */
	public int gunDamage(int num){
		switch(num){
		case 1:
			return PISTOL_DAMAGE;
		case 2:
			return RIFLE_DAMAGE;
		case 3:
			return SHOTGUN_DAMAGE;
		default:
			return 0;
		}
	}

	/**
	 * setter for gun
	 * 
	 * @param ammo
	 */
	public void setAmmo(int ammo) {
		this.gun = ammo;
	}
	
	/**
	 * getter for gun
	 * 
	 * @return
	 */
	public int getAmmo(){
		return gun;
	}
}
