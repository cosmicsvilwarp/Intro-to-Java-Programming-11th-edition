
/*
(Order three cities) Write a program that prompts the user to enter three cities and
displays them in ascending order.
*/
import java.util.Scanner;

public class City_alphabeticalch4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three cities
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();

		String temp;
		if (city1.charAt(0)>(city2.charAt(0)))
		{
			temp = city1;
			city1 = city2;
			city2 = temp;	
		}


		// Display cities in ascending order
		System.out.println("The three cities in alphabetical order are " +
			city1 + " " + city2 + " " + city3);
	}
}