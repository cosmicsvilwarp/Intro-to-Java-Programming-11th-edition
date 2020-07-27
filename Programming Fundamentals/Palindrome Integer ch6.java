import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int number = input.nextInt();
		System.out.print(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
	}
	public static int reverse (int number){
			int reversed = 0;
			 while(number != 0) 
			{
				int digit = number % 10;
				reversed = reversed * 10 + digit;
				number /= 10;
			}
			return reversed;
		}

	public static boolean isPalindrome(int number){
			return ((reverse(number) == number) ? true : false);
	}
}
