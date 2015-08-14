//program will check to see if inputted word is a pallindrome

import java.util.Scanner;
import java.util.Collections;

public class pallindrome{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		String pallindrome;
		String reverse;

		System.out.print("Please enter a pallindrome: ");
		pallindrome = keyboard.nextLine();

		char[] charArray = pallindrome.toCharArray();
		reverse = Collections.reverse(charArray);
		System.out.println(reverse);
	}
}