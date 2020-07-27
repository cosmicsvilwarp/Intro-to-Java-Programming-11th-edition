import java.util.Scanner;
//prompts the user to enter two integers and displays their greatest common divisor
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/**Prompts user for two integers */
		System.out.println("What is the first integer : ");
		int n1 = input.nextInt();
		System.out.println("What is the second integer : ");
		int n2 = input.nextInt();
		
		System.out.println("The common divisor for " + n1  + " and " + n2 + " is " + gcd(n1, n2));
		}
		
		/**Return the gcd of two integers */
		public static int gcd(int n1, int n2) {
			int k = 1; 
			int gcd = 2;
			
			while(k <= n1 && k <=n2)
			{
				if(n1 % k == 0 && n2 % k == 0)
				{
					gcd = k; //Update gcd
				}
				k++;
			}
			return gcd;
		}
}