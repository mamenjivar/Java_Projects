import java.util.Scanner;
import java.util.Random;

public class guess_number{
	public static void main(String args[]){

		Random randomNumbers = new Random();
		Scanner keyboard = new Scanner(System.in);

		int number; //variable for keyboard input
		int number1; //variable for random number

		System.out.print("Please enter a number from 1 to 10: ");
		number = keyboard.nextInt();

		number1 = randomNumbers.nextInt(10) + 1; //random number range from 1-10
		
		while (number != number1){ //keeps looping until correct answer is reached
			if (number < 0 || number > 10){ //checks if number is outside of 1-10 range
				System.out.print("Pick a number between 1 and 10: ");
				number = keyboard.nextInt();
			} else if (number1 < number){ //checks value of number if higher than guessed number
				System.out.print("Hint: go lower ");
				number = keyboard.nextInt();
			} else if (number1 > number){ //checks value of number if lower than guess number
				System.out.print("Hint: go higher ");
				number = keyboard.nextInt();
			}		
		}
		System.out.println("You guessed the correct number!");
	}
}