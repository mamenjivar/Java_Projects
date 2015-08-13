import java.util.Scanner; 

public class goldilocks {
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter a temperature: "); //enter temperature
		int temp = keyboard.nextInt(); //stores input

		if (temp < 70) { //if less than 70, cold
			System.out.println("It is too cold!");
		} 
		else if (temp < 80){ //if less than 80, just right
			System.out.println("it's just right");
		}
		else if (temp > 81) { //if greater than 81, too hot
			System.out.println("It's too hot!");
		}
	}
}