import java.util.Scanner;

//(Find the factors of an integer) Write a program that reads an integer and displays all its smallest factors in increasing order. For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int n1 = input.nextInt();
		int k = 2 ; 
		
		while(k <= n1) //loop starts from 2 to n1
		{ k++;
			if(n1 % k == 0) //Finds all the 
			{
				System.out.print(k + " ");
			}
		}
}
}