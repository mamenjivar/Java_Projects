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
			System.out.print("wrong number, please try again: ");
			number = keyboard.nextInt();
		}
		System.out.println("You guessed the correct number!");
	}
}