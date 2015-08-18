//grade checker for point based systems

import java.util.Scanner;

public class point_gradechecker{
	public static void main(String[] args) {
		 
		Scanner keyboard = new Scanner(System.in);
		/*variables for points earned in assignment*/
		double score_earned;
		double score_earned1 = 0;
		/*variables for maximum points in assignments*/
		double overal_score;
		double overal_score1 = 0;
		/*variable to display grade*/
		double grade_score = 0;
		/*variables to ask user if wanting to input more scores*/
		char repeat;
		String input;

		do {
			//asks user to input scores
		 	System.out.print("Please enter the points earned for assignment: ");
		 	score_earned = keyboard.nextDouble();

		 	//asks user to enter maximum points allowed on assignment
		 	System.out.print("Please enter overal points of assignment: ");
		 	overal_score = keyboard.nextDouble();
		 	keyboard.nextLine();

		 	//asks user if they need to enter more assingments
		 	System.out.print("Would you like to add another assignment? ");
		 	input = keyboard.nextLine();
		 	repeat = input.charAt(0);

		 	/*adds up all points earned from all assignments together*/
		 	score_earned1 += score_earned;
		 	/*adds up total points you can get from all assigments together*/
		 	overal_score1 += overal_score;
		 	/*calculates the current grade together*/
		 	grade_score = score_earned1 / overal_score1 * 100;


		} while (repeat == 'Y' || repeat == 'y');
		//shows results onto the terminal screen
		System.out.println("total points earned from points assignment: " + score_earned1);
		System.out.println("overal points from all assignments: " + overal_score1);
		System.out.println("Overall grade: " + grade_score);
	}
}