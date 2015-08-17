//simple game of rock paper and scissors

import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();

		int roshambo;
		int rand_num;
		String choice;
		char repeat;

		System.out.println("Welcome to the game of rock, paper, and scissors!");
		do {
			System.out.println("1 = rock, 2 = paper, 3 = scissors");
			System.out.print("Please refer to the menu above: ");
			roshambo = keyboard.nextInt();

			rand_num = randomNumbers.nextInt(3) + 1;
			/*user choices*/
			switch (roshambo) {
				case 1: //rock
					rock(rand_num);
					break;
				case 2: //paper
					paper(rand_num);
					break;
				case 3://scissors
					scissors(rand_num);
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
			System.out.println("Would you like to try again? ");
			choice = keyboard.nextLine();
			repeat = choice.charAt(0);
		} while (repeat == 'Y' || repeat == 'y');
	} /*computer choices*/
		public static void rock(int num){
			/*user outcome for rock*/
			switch (num) {
			case 1: //rock
				System.out.println("It is a draw");

				break;
			case 2: //paper
				System.out.println("You lost!");
				break;
			case 3: //scissors
				System.out.println("You Won!");
				break;
			default:
				System.out.print("choose rock, paper, or scissors");
			}
		}
		public static void paper(int num){
			/*user outcome for paper*/
			switch (num) {
				case 1: // rock
					System.out.println("You Win!");
					break;
				case 2: // paper
					System.out.println("It is a draw!");
					break;
				case 3: // scissors
					System.out.println("You Lost!");
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
		}
		public static void scissors(int num){
			/*user outcome for scissors*/
			switch (num) {
				case 1: //rock
					System.out.println("You Lost!");
					break;
				case 2: //paper
					System.out.println("You Won!");
					break;
				case 3: //scissors
					System.out.println("It is a Draw");
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
		}
}