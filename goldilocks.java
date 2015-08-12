import java.util.Scanner;

public class goldilocks {
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a temperature: "); 
		int temp = keyboard.nextInt();

		if (temp < 70) {
			System.out.println("It is too cold!");
		} 
		else if (temp < 80){
			System.out.println("it's just right");
		}
		else if (temp > 81) {
			System.out.println("It's too hot!");
		}
	}
}