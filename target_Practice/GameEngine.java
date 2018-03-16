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
 * Game Engine: this class will handle the game logic
 */
package targetPractice;

import java.util.Random;

public class GameEngine {

	Target target = new Target();
	UserInterface uI = new UserInterface();
	Gun weapon;
	Random random = new Random();

	/**
	 * program starts here
	 */
	public void start() {
		boolean loop = true;
		uI.introduction();
		while (loop) {
			// creates the weapon
			gunCreation(uI.Intro());

			// instantiates the targets
			uI.printRange(weapon.getGunName(), createTarget(), weapon.getAmmo());

			boolean gameLoop = true;
			while (gameLoop) {
				if (weapon.getAmmo() == 0 || target.getTarget() == 0)
					gameLoop = false;
				else
					gameTime(uI.shoot());

			}
			
			// prompts user if they want to play again with different weapon
			if(uI.replay().equals("n")){
//				target.reloadTargets();
				loop = false;
			}
		}
	}

	/**
	 * gunCreation method will create the weapon that the user chooses when the
	 * program initializes
	 * 
	 * @param gun
	 *            is the value that is initialized from the UserInterface class
	 *            when the user types what weapon he/she will use
	 * 
	 * @return will return the value initialized when creating the value for the
	 *         weapon
	 */
	public Gun gunCreation(String gun) {
		if (gun.equals("pistol")) {
			weapon = new Gun();
			return weapon;
		} else if (gun.equals("rifle")) {
			weapon = new Gun(gun, 8, 8);
			return weapon;
		} else if (gun.equals("shotgun")) {
			weapon = new Gun(gun, 6, 4);
			return weapon;
		} else
			System.out.println("There is no known weapon\n");
		return null;
	}

	/**
	 * plays the game and takes user input to shoot weapon or quit game
	 */
	public void gameTime(String choice) {
		boolean hitMiss;
		// when user chooses to shoot weapon at target
		if (choice.equals("s")) {
			hitMiss = shootTarget();
			uI.shotWeapon(weapon.getAmmo());
			uI.hitTarget(target.getTarget(), hitMiss);
		}
		// exits program if quit chosen
		else if (choice.equals("q")) {
			System.exit(0);
		}
		// if user chooses something other than options provided
		else
			uI.wrongChoice();
	}

	/**
	 * set up to pull trigger and subtract target
	 */
	public boolean shootTarget() {
		boolean hitMiss;
		weapon.shootGun();

		int num = random.nextInt(weapon.getAccuracy()) + 1;
		if (weapon.getAccuracy() > num) {
			target.targetHit();
			hitMiss = true;
		} else
			hitMiss = false;
		return hitMiss;
	}

	/**
	 * Instantiate the targets for user to shoot at
	 * 
	 * @return number of targets created
	 */
	public int createTarget() {
		target.targetCreation();
		return target.getTarget();
	}
}
