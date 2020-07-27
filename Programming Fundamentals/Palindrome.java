import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter word: ");
		String name = input.nextLine();
		
		int beg = 0; //index of first character
		int end = (name.length()-1); //index of last character
		boolean ispalindrome = true;
		 
		//If the two characters at these positions match, increase beg by 1 and decrease end by 1
		
		while(beg < end)
		{
			if (name.charAt(beg) != name.charAt(end))
			{
				ispalindrome = false;
				break;
			}
			beg++;
			end--;
		}
		if(ispalindrome)
		{
			System.out.print("It is a palindrome");
		}
		else {
			System.out.print("It is not a palindrome");
		}
}}