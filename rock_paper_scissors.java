//simple game of rock paper and scissors with point tracker

import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();

		int roshambo; //user input
		int rand_num; //computer input
		String input;
		char repeat;
		/*counters for win and loss*/
		int win = 0;
		int loss = 0;
		int draw = 0;

		System.out.println("Welcome to the game of rock, paper, and scissors!");
		do {
			System.out.println("1 = rock, 2 = paper, 3 = scissors"); //choices for r, p, s
			System.out.print("Please refer to the menu above: ");
			roshambo = keyboard.nextInt();
			keyboard.nextLine();

			rand_num = randomNumbers.nextInt(3) + 1; //randomizes computer choices with 1, 2, and 3
			/*user choices*/
			switch (roshambo) {
				case 1: //rock
					rock(rand_num);
					/*if else statement adds a point to computer or user based on winning or losing*/
					if (rand_num == 2){
						loss++;
					} else if (rand_num == 3) {
						win++;
					} else {
						draw++;
					}
					break;
				case 2: //paper
					paper(rand_num);
					/*if else statement adds a point to computer or user based on winning or losing*/
					if (rand_num == 3){
						loss++;
					} else if (rand_num == 1) {
						win++;
					} else {
						draw++;
					}
					break;
				case 3://scissors
					scissors(rand_num);
					/*if else statement adds a point to computer or user based on winning or losing*/
					if (rand_num == 1){
						loss++;
					} else if (rand_num == 2) {
						win++;
					} else{
						draw++;
					}
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
			/*prompts user if they want to play again*/
			System.out.print("Would you like to try again? ");
			input = keyboard.nextLine();
			repeat = input.charAt(0);
			System.out.println();
		} while (repeat == 'Y' || repeat == 'y');

		//after program quits, user is prompted with final score
		System.out.println("Final Score =  You: " + win + " Draws: " + draw + " Computer: " + loss);
	}
		/*computer choices*/
		/*user outcome for rock*/
		public static void rock(int num){
			switch (num) {
			case 1: //rock
				System.out.println("Computer chose rock");
				System.out.println("It is a draw!");
				break;
			case 2: //paper
				System.out.println("Computer chose paper");
				System.out.println("You lost!");
				break;
			case 3: //scissors
				System.out.println("Computer chose scissors");
				System.out.println("You Win!");
				break;
			default:
				System.out.print("choose rock, paper, or scissors");
			}
		}
		/*user outcome for paper*/
		public static void paper(int num){
			switch (num) {
				case 1: // rock
					System.out.println("Computer chose rock");
					System.out.println("You Win!");
					break;
				case 2: // paper
					System.out.println("Computer chose paper");
					System.out.println("It is a draw!");
					break;
				case 3: // scissors
					System.out.println("Computer chose scissors");
					System.out.println("You Lost!");
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
		}
		/*user outcome for scissors*/
		public static void scissors(int num){
			switch (num) {
				case 1: //rock
					System.out.println("Computer chose rock");
					System.out.println("You Lost!");
					break;
				case 2: //paper
					System.out.println("Computer chose paper");
					System.out.println("You Win!");
					break;
				case 3: //scissors
					System.out.println("Computer chose scissors");
					System.out.println("It is a draw!");
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
		}
	}
