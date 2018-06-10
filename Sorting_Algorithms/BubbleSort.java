/**
 * Name: Miguel Menjivar
 * Date: 6/9/18
 * 
 * Description:
 * Bubble Sort Algorithm
 */
public class BubbleSort {

	/**
	 * Main
	 */
	public static void main(String[] args) {
		// fixed sized array with unsorted values
		int unsorted[] = {3, 4, 5, 2, 1, 7, 8, 9, 6};
		
		System.out.println("Bubble Sort\n");
		
		// prints out the unsorted numbers in array
		System.out.print("Unsorted Array: ");
		printArray(unsorted);
		
		bubbleSort(unsorted, unsorted.length);
		
		// prints out sorted array
		System.out.print("Sorted Array:   ");
		printArray(unsorted);
	}
	
	/**
	 * bubble sort algorithm to rearrange unsorted array into a sorted array
	 * 
	 * @param sort
	 * @return sort will return the sorted array 
	 */
	static int[] bubbleSort(int[] sort, int arrayLength){
		// loops 
		Boolean loop = false;
		while(!loop){
			loop = true;
			for(int i = 0; i < arrayLength - 1; i++){
				if(sort[i] > sort[i + 1]){
					swap(sort, i, i + 1);
					loop = false;
				}
			}
		}
		
		return sort;
	}
	
	/**
	 * This function will swap two values within array
	 * a <=> b
	 * 
	 * @param array holds the array
	 * @param a holds the first value of array to be swapped
	 * @param b holds second value of array to be swapped
	 */
	static int[] swap(int[] swapped, int a, int b){
		int temp;
		temp = swapped[a];
		swapped[a] = swapped[b];
		swapped[b] = temp;
		return swapped;
	}
	
	/**
	 * prints out the array to console
	 * 
	 * @param printArray holds the array information
	 */
	static void printArray(int[] printArray){
		for(int i = 0; i < printArray.length; i++){
			System.out.print(printArray[i] + " ");
		}
		
		System.out.println();
	}
}
