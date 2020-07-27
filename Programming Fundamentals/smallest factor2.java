import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int n = input.nextInt();
		int k = 2 ;
		
		while(k <= n && n % k != 0) //Increase k as long you have not found factor
		{ 
			k++;
		}
		System.out.println("The smallest factor other than 1 for " + n + " is " + k);
	}
}