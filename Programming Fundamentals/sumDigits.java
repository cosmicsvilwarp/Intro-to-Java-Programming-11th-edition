import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int n = input.nextInt();
		
		System.out.print(sumDigits(n));
}
	
	public static int sumDigits(long n)
	{
		int sum = 0;
		
		for(int i = 0; i <= n ; i++)
		{
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}