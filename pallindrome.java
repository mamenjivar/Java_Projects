//program will check to see if inputted word is a pallindrome

import java.util.Scanner;

public class pallindrome{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		String pallindrome; 
		char repeat;
		String input;

		do { 
			System.out.print("Please enter a pallindrome: "); //keyboard input of pallindrome
			pallindrome = keyboard.nextLine(); 

			String reverse = new StringBuilder(pallindrome).reverse().toString(); //reverses word and converts to a string

			if(pallindrome.equals(reverse)) { //if original value equals reversed value
				System.out.println("It is a pallindrome: "); //two values are equal
			} else{
				System.out.println("it is not a pallindrome: "); //two values are not equal
			}
			System.out.print("Would you like to try another word? ");
			input = keyboard.nextLine();
			repeat = input.charAt(0);
		} while (repeat == 'Y' || repeat =='y'); //prompts user if they want to try another word
	}
}