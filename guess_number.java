//guessing game with hints

import java.util.Scanner; 
import java.util.Random;

public class guess_number{
	public static void main(String args[]){

		Random randomNumbers = new Random();
		Scanner keyboard = new Scanner(System.in);

		int number; //variable for keyboard input
		int rand_num; //variable for random number
		int tracker = 1;

		System.out.print("Please enter a number from 1 through 10: ");
		number = keyboard.nextInt();

		rand_num = randomNumbers.nextInt(10) + 1; //random number range from 1-10
		
		while (number != rand_num){ //keeps looping until correct answer is reached
			if (number < 0 || number > 10){ //checks if number is outside of 1-10 range
				System.out.print("Pick a number between 1 and 10: ");
				number = keyboard.nextInt();
				tracker++;
			} else if (rand_num < number){ //checks value of number if higher than guessed number
				System.out.print("Hint: go lower ");
				number = keyboard.nextInt();
				tracker++;
			} else if (rand_num > number){ //checks value of number if lower than guess number
				System.out.print("Hint: go higher ");
				number = keyboard.nextInt();
				tracker++;
			}		
		}
		System.out.println("You guessed the correct number!");
		System.out.println("It took you " + tracker + " tries!");
	}
}