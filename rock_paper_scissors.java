//simple game of rock paper and scissors

import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();

		int roshambo;
		int rand_num;
		String input;
		char repeat;
		int win = 0;
		int loss = 0;

		System.out.println("Welcome to the game of rock, paper, and scissors!");
		do {
			System.out.println("1 = rock, 2 = paper, 3 = scissors");
			System.out.print("Please refer to the menu above: ");
			roshambo = keyboard.nextInt();
			keyboard.nextLine();

			rand_num = randomNumbers.nextInt(3) + 1;
			/*user choices*/
			switch (roshambo) {
				case 1: //rock
					rock(rand_num);
					if (rand_num == 2){
						loss++;
					} else if (rand_num == 3) {
						win++;
					}
					break;
				case 2: //paper
					paper(rand_num);
					if (rand_num == 3){
						loss++;
					} else if (rand_num == 1) {
						win++;
					}
					break;
				case 3://scissors
					scissors(rand_num);
					if (rand_num == 1){
						loss++;
					} else if (rand_num == 2) {
						win++;
					}
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
			System.out.print("Would you like to try again? ");
			input = keyboard.nextLine();
			repeat = input.charAt(0);
		} while (repeat == 'Y' || repeat == 'y');

		System.out.println("Final Score: You " + win + " Computer " + loss);
	} 	/*computer choices*/
		/*user outcome for rock*/
		public static void rock(int num){
			switch (num) {
			case 1: //rock
				System.out.println("It is a draw");
				break;
			case 2: //paper
				System.out.println("You lost!");
				break;
			case 3: //scissors
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
		/*user outcome for scissors*/
		public static void scissors(int num){
			switch (num) {
				case 1: //rock
					System.out.println("You Lost!");
					break;
				case 2: //paper
					System.out.println("You Win!");
					break;
				case 3: //scissors
					System.out.println("It is a Draw");
					break;
				default:
					System.out.print("choose rock, paper, or scissors");
			}
		}
}