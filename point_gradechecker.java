//grade checker for point based systems

import java.util.Scanner;

public class point_gradechecker{
	public static void public static void main(String[] args) {
		 
		 Scanner keyboard = new Scanner(System.in);

		 int score_earned = 0;
		 int overal_score = 0;
		 int final score;
		 char repeat;
		 String input;

		 do {
		 	System.out.print("Please enter the points earned for assignment: ");
		 	score_earned = keyboard.nextInt();

		 	System.out.print("Please enter overal points of assignment: ");
		 	overal_score = keyboard.nextInt();

		 	System.out.print("Would you like to add another assignment? ");
		 	input = keyboard.nextLine();
		 	char = input.charAt(0);

		} while (repeat == 'Y' || repeat == 'y');

	}
}