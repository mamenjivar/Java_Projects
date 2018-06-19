package sorting;

import java.util.Scanner;

/**
 * Name: Miguel Menjivar 
 * Date: 6/18/2018
 * 
 * Description: 
 * Left-rotation array
 *
 */
public class LeftRotation {

	/**
	 * [ 1 | 2 | 3 | 4 | 5 ] = 0
	 * [ 2 | 3 | 4 | 5 | 1 ] = 1 rotation
	 * [ 3 | 4 | 5 | 1 | 2 ] = 2 rotations
	 * [ 4 | 5 | 1 | 2 | 3 ] = 3 rotations
	 * [ 5 | 1 | 2 | 3 | 4 ] = 4 rotations
	 * 
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int temp;

		int[] array = { 1, 2, 3, 4, 5};  

		// prints original array
		printArray(array);
		System.out.println();

		 System.out.print("Rotate: ");
		 int rotate = kb.nextInt();
		 kb.nextLine();

		for (int j = 0; j < rotate; j++) {
			temp = array[0];
			for (int i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array[array.length - 1] = temp;
		}

		// prints contents of new array
		printArray(array);
		
		kb.close();
	}

	/**
	 * Prints out the contents of the array
	 * 
	 * @param print array
	 */
	static void printArray(int[] print) {
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i] + " ");
		}
	}

}
