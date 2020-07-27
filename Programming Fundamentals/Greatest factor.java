import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter integer: ");
		int n = input.nextInt(); //User input
		boolean found = false; 
		int factor = 2;
		while (factor <= n && n % factor != 0)
		factor++;
		}
		System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
	}
}