//simple calculator

import java.util.Scanner;

public class simple_calculator{
	public static void main(String[] args) {
		/*inputting the first two values*/
		int first_value;
		int second_value;
		/*operator*/
		int operation;
		/*result from both given values*/
		int answer;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("This is a simple calculator that ");
		System.out.println("adds, subtracts, divides, and multiplies");
		System.out.println();

		System.out.print("Please enter your first value: ");
		first_value = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("Please enter your second value: ");
		second_value = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println();
		/*choosing which operation to use*/
		System.out.println("1: addition 2: subtraction 3: multiplication 4: division");
		System.out.print("Please choose an operation from menu above: ");
		operation = keyboard.nextInt();

		/*outcomes from each operation*/
		switch(operation) {
			//addition
			case 1:
				answer = first_value + second_value;
				System.out.println(first_value + " + " + second_value + " = " + answer);
				break;
			//subtraction
			case 2:
				answer = first_value - second_value;
				System.out.println(first_value + " - " + second_value + " = " + answer);
				break;
			//multiplication
			case 3:
				answer = first_value * second_value;
				System.out.println(first_value + " x " + second_value + " = " + answer);
				break;
			//division
			case 4:
				answer = first_value / second_value;
				System.out.println(first_value + " \u00F7 " + second_value + " = " + answer);
				break;
			default:
				System.out.println("error");
		}
	}
}
