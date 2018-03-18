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
 * GameEngine class:
 * The entity that represents an instance of the game.
 * Keeps track of the current state of the game,
 * statistics like the number of hit points left, etc
 */

import java.util.Random;

public class GameEngine {
	// max steps user can take to exit dungeon
	private final int MAX_STEPS = 10;

	// will keep track of amount of steps user takes to exit dungeon
	private int steps;

	// has weapon choice selected by user
	// 1 = pistol
	// 2 = rifle
	// 3 = shotgun
	private int weaponChoice;

	// utilized for randomness of power ups that may be given throughout the game
	Random rand = new Random();

	// instantiates the user interface, player, and enemy factors of the game
	UserInterface ui = new UserInterface();
	Player player;
	Enemy enemy;

	/**
	 * default constructor
	 * 
	 * sets the total amount of steps = 0
	 */
	public GameEngine() {
		steps = 0;
	}

	/**
	 * start of the program
	 */
	public void start() {
		// prints the introduction of the game
		ui.introduction();

		// gets user response for weapon choice an integer
		weaponChoice = ui.chooseWeapon();

		player = new Player(weaponChoice); // chooses if pistol/ rifle/ shotgun

		// begins escape dungeon part of game
		escapeDungeon();
		
		// when user has reached 10 steps, end of game string is printed
		ui.endGame();
	}

	/*
	 * will be in charge of fighting enemies and taking steps toward exit of dungeon
	 */
	public void escapeDungeon() {
		enemy = new Enemy();
		for (int i = 0; i < MAX_STEPS; i++) {
			ui.enemySpawned();
			fightEnemy();

			takeStep();
			ui.takeStep(getSteps());
		}
	}

	/*
	 * player vs enemy battle
	 */
	public void fightEnemy() {
		int powerUp = rand.nextInt(4) + 1; 
		boolean loop = true;
		enemy.spawnEnemy();

		// loops until enemy or player has been killed
		while (loop) {
			ui.playerHealthBar(player.getHealth());
			ui.ammoCount(weaponChoice, player.ammoCounter());
			ui.enemyHealthBar(enemy.getHealth());

			// true if player decides to shoot weapon
			// false if player decides to run
			if (ui.shootRun()) {
				// true = hit (1)
				// false = miss (2)
				// when the player shoots
				player.playerShoot();
				
				// true if player hits target
				// false if player mises target
				if(player.hitMiss()){
					enemy.hit(weaponChoice);
					ui.enemyPlayerHit(1);
				} else 
					ui.enemyPlayerHit(2);
				
				// true = hit (3)
				// false = miss (4)
				// when the enemy shoots
				enemy.enemyShoot();
				if(enemy.hitMiss()){
					player.hit(weaponChoice);
					ui.enemyPlayerHit(3);
				} else
					ui.enemyPlayerHit(4);
				
				// if enemy or player dies, you move on to next step
				if (enemy.getHealth() <= 0 || player.getHealth() <= 0) {
					if(enemy.isDead())
						ui.enemyPlayerDied(1);
					if(player.isDead())
						ui.enemyPlayerDied(2);
					
					
					powerUps(powerUp);
					loop = false;
				}
			} else {
				loop = false;
			}
		}
	}

	/**
	 * will be in charge of issuing power ups whenever necessary
	 */
	public void powerUps(int num) {
		switch (num) {
		case 1: // generates random amount of health
			int healthPack = 5;
			player.heal(healthPack); 
			ui.powerUp(num, healthPack);
			break;
		case 2: // generate finite amount of munition
			int numRounds = rand.nextInt(15) + 1;
			player.playerReload(numRounds);
			ui.powerUp(num, numRounds);
			break;
		default:
			// empty no power ups given
			ui.powerUp(3, 0);
			break;
		}
	}

	/**
	 * takes one step to exit the dungeon max number of steps = 10
	 */
	public void takeStep() {
		steps++;
	}

	/**
	 * setter for steps
	 * 
	 * @param steps
	 */
	public void setSteps(int steps) {
		this.steps = steps;
	}

	/**
	 * getter for steps
	 * 
	 * @return number of steps player has taken
	 */
	public int getSteps() {
		return steps;
	}
}
