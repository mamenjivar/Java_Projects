import java.util.Scanner;

public class guess_number{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		String number;
		System.out.println("Please enter a number from 1 to 10: ");
		number = keyboard.nextInt();

		System.out.println(number);
	}
}