//simple game of rock paper and scissors

import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors{
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();

		int roshambo;
		int rand_num;
		//rock(1);
		//paper(2);
		//scissors(3);

		System.out.println("Welcome to the game of rock, paper scissors!");
		System.out.print("1 = rock, 2 = paper, 3 = scissors");
		roshambo = keyboard.nextInt();

		rand_num = randomNumbers.nextInt(3) + 1;

		switch (roshambo) {
			case 1:
				System.out.println("you entered 1");
				break;
			case 2:
				System.out.println("You entered 2");
				break;
			case 3:
				System.out.println("You entered 3");
				break;
			default:
				System.out.print("choose rock, paper, or scissors");
		}
		/*
		rock = 1
		paper = 2
		scissors = 3
		use switch statements
		*/
		
		/*public static void rock(){
			int rock = 1;
			System.out.print("Computer chose rock");
		}
		public static void paper(){
			int paper = 2;
			System.out.print("Computer chose paper");
		}
		public static void scissors(){
			int scissors = 3;
			System.out.print("Computer chose scissors");
		}*/


	}
}