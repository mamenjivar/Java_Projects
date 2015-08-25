//grade checker for point based systems

import java.util.Scanner;
import java.text.DecimalFormat;

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
		/*declares the for loop reiterations*/
		int taco;
		int number;

		DecimalFormat formatter = new DecimalFormat("#.00");

		System.out.print("How many scores do you want to input? ");
		taco = keyboard.nextInt();
		keyboard.nextLine();


		for (number = 1;  number <= taco; number++) {
			//asks user to input scores
		 	System.out.print("Please enter the points earned for assignment: ");
		 	score_earned = keyboard.nextDouble();

		 	//asks user to enter maximum points allowed on assignment
		 	System.out.print("Please enter overal points of assignment: ");
		 	overal_score = keyboard.nextDouble();
		 	keyboard.nextLine();

		 	/*adds up all points earned from all assignments together*/
		 	score_earned1 += score_earned;
		 	/*adds up total points you can get from all assigments together*/
		 	overal_score1 += overal_score;
		 	/*calculates the current grade together*/
		 	grade_score = score_earned1 / overal_score1 * 100;
		}
		//shows results onto the terminal screen
		System.out.println();
		System.out.println("total points earned from all assignment: " + score_earned1);
		System.out.println("overall points from all assignments: " + overal_score1);
		System.out.println("Overall grade: " + formatter.format(grade_score));
	}
}
