import java.util.Scanner;
//Biggest factor aside from the number itself
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an iteger");
		int n = input.nextInt();
		int k = n-1;
		
		while(n > k && n % k != 0) //decrease k as long as it's not a factor 
			{
				k--;
			}
		System.out.print(k);
	}
}