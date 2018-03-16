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
 * Gun: will hold all the gun attributes
 */
package targetPractice;

public class Gun {
	/**
	 * The ammo capacity for all weapons it will have a max capacity of 7
	 * bullets.
	 */
	private static final int AMMO_CAPACITY = 7;
	/**
	 * This will hold the ammo capacity of the weapon when it is shot from the
	 * weapon
	 */
	private int ammo;
	/**
	 * This private field will hold the value for the accuracy which will help
	 * if the target is hit or not
	 */
	private int accuracy;

	private String gunName;

	/**
	 * Default constructor that will initialize hand gun with only 7 rounds and
	 * 70% accuracy
	 */
	public Gun() {
		gunName = "pistol";
		ammo = 7;
		accuracy = 7;
	}

	/**
	 * Will overload constructor to set values for the rifle or shotgun
	 * 
	 * @param accuracy
	 *            will hold the value associated with the rifle or shotgun
	 *            methods
	 * @param ammo
	 *            will hold the ammunition provided by each weapon which will be
	 *            different for each weapon
	 */
	public Gun(String name, int ammo, int accuracy) {
		gunName = name;
		this.ammo = ammo;
		this.accuracy = accuracy;
	}


	/**
	 * edit it to check if ran out of ammo or not
	 */
	public void shootGun() {
		ammo--;
	}

	/**
	 * This will be a default method for reload that will reload the clip to the
	 * max capacity of the weapon
	 */
	public void reload() {
		ammo = AMMO_CAPACITY;
	}

	/**
	 * Setter for ammunition field method
	 * 
	 * @param ammo
	 *            will set parameter equal to private field ammo
	 */
	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	/**
	 * Setter for accuracy
	 * 
	 * @param accuracy
	 *            will set the parameter equal to the private field accuracy
	 */
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	/**
	 * Getter for ammunition
	 * 
	 * @return will return the value inside the ammo field
	 */
	public int getAmmo() {
		return ammo;
	}

	/**
	 * Getter for accuracy
	 * 
	 * @return will return the value that is associated with the private field
	 *         accuracy
	 */
	public int getAccuracy() {
		return accuracy;
	}

	/**
	 * setter for weapon name
	 * 
	 * @param name name of weapon
	 */
	public void setGunName(String name) {
		gunName = name;
	}

	/**
	 * getter for weapon name
	 * @return the name of the weapon
	 */
	public String getGunName() {
		return gunName;
	}
}
