import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String postfix = "";
		System.out.print("Enter the first String: ");
		String string1 = input.nextLine();
		System.out.print("Enter the second String: ");
		String string2 = input.nextLine();
		int j = string1.length() - 1;
		int k = string2.length() - 1;
		String cd = "";
		
		while(string1.charAt(j) == string2.charAt(k))//Loop from the end to the beginning and look for equal characters
		{
			postfix += string1.charAt(j); //add equal characters to postfix
			j--;
			k--;//Result will be reversed
		}
		for (int i = postfix.length()-1; i >= 0; i--) //Put word back to it's original format by reversing
		{
			cd += postfix.charAt(i);
		}
		if(postfix.length() > 0)
		{
			System.out.println("The common postfix is " + cd);
		}
		else
		{
			System.out.println(string1 + " and " + string2+ " have no common postfix");
		}
	}
}