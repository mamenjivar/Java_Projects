import java.util.Scanner;
import java.util.Random;

public class guess_number{
	public static void main(String args[]){

		Random randomNumbers = new Random();
		Scanner keyboard = new Scanner(System.in);

		int number;
		int number1 = 5;
		System.out.print("Please enter a number from 1 to 10: ");
		number = keyboard.nextInt();

		//number1 = randomNumbers.nextInt(10) + 1;

		if (number == number1){
			System.out.println("Correct number!");
		} else{
			System.out.println("wrong number!");
		}
	}
}