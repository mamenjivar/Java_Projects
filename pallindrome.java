//program will check to see if inputted word is a pallindrome

import java.util.Scanner;

public class pallindrome{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		String pallindrome;
		char repeat;
		String input;

		do { 
			System.out.print("Please enter a pallindrome: ");
			pallindrome = keyboard.nextLine();

			String reverse = new StringBuilder(pallindrome).reverse().toString();

			if(pallindrome.equals(reverse)) {
				System.out.println("It is a pallindrome: ");
			} else{
				System.out.println("it is not a pallindrome: ");
			}
			System.out.print("Would you like to try another word? ");
			input = keyboard.nextLine();
			repeat = input.charAt(0);
		} while (repeat == 'Y' || repeat =='y');
	}
}