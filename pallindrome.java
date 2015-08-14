//program will check to see if inputted word is a pallindrome

import java.util.Scanner;
import java.util.Collections;

public class pallindrome{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		String pallindrome;
		String copy;

		System.out.print("Please enter a pallindrome: ");
		pallindrome = keyboard.nextLine();

		StringBuilder a = new StringBuilder(pallindrome);
		System.out.println(a);
		System.out.println(a.reverse());
		//String b = a.reverse();
		//String c = b.toString();

		if(a == a.reverse()) {
			System.out.println("It is a pallindrome: ");
		} else{
			System.out.println("it is not a pallindrome: ");
		}
	}
}