import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int index= 0;
		String prefix = "";
		System.out.print("Enter the first String: ");
		String string1 = input.nextLine();
		System.out.print("Enter the second String: ");
		String string2 = input.nextLine();
		int uppercase = 0;
		
		while(string1.charAt(index) == string2.charAt(index))
		{
			prefix += string1.charAt(index);
			index++;
		}
		
		if(prefix.length() > 0)
		{
			System.out.println("The common prefix is " + prefix);
		}
		else
		{
			System.out.println(string1 + " and " + string2+ " have no common prefix");
		}
	}
}

		

		
