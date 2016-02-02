//rolling the dice

import java.util.Random;
import java.util.Scanner;

public class rolling_dice {
  public static void main(String[] args) {

    Random random_numbers = new Random();
    Scanner keyboard = new Scanner(System.in);

    /*variables for random dice*/
    int dice1;
    int dice2;
    int answer;
    int roll;

    /*loop variables*/
    String result;
    char first_letter;

    /*System.out.print("Would like to roll one or two dice?: ");
    roll = keyboard.nextLine();

    if else statement with void main classes

    if (roll =)*/
    do{
      /*gives dice 1 & 2 a random value from 1-6*/
      dice1 = random_numbers.nextInt(6) + 1;
      dice2 = random_numbers.nextInt(6) + 1;

      /*total value from dice 1 & 2*/
      answer = dice2 + dice1;

      /*displays the values of dice 1 & 2 with the total*/
      System.out.println("dice 1: " + dice1);
      System.out.println("dice 2: " + dice2);
      System.out.println("total: " + answer);

      /*prompts user if they want to repeat the program again*/
      System.out.print("Would you like to roll the dice? ");
      result = keyboard.nextLine();
      first_letter = result.charAt(0);

    } while (first_letter == 'Y' || first_letter == 'y');
  }
  /*public static void one_roll(){

  }*/
}
