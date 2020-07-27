/*Sebas*/
/*
(Phone keypads) The international standard letter/number mapping for telephones
is shown in Programming Exercise 4.15. Write a method that returns a number,
given an uppercase letter, as follows:
int getNumber(char uppercaseLetter)
Write a test program that prompts the user to enter a phone number as a string.
The input number may contain letters. The program translates a letter (uppercase
or lowercase) to a digit and leaves all other characters intact.
*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Takes Scanner input 
		
		//Prompts user to enter String
		System.out.print("Please enter a string: ");
		String s = input.nextLine();
		
		//Loop throughout the String 
		for(int i = 0; i < s.length(); i++)
		{
			//Translate a letter to a digit and leaves all other character intact
			if(Character.isLetter(s.charAt(i)))
				System.out.print(getNumber(Character.toUpperCase(s.charAt(i))));
			else
				System.out.print(s.charAt(i));
		}
	}
	
	/** Method getNumber returns a number, given an uppercase letter */
	public static int getNumber (char uppercaseLetter){
	// Return the character's number reference in the international 
			// standard letter/number mapping for telephones
			if (uppercaseLetter >= 'W')
				return 9;
			else if (uppercaseLetter >= 'T')
				return 8;
			else if (uppercaseLetter >= 'P')
				return 7;
			else if (uppercaseLetter >= 'M')
				return 6;
			else if (uppercaseLetter >= 'J')
				return 5;
			else if (uppercaseLetter >= 'G')
				return 4;
			else if (uppercaseLetter >= 'D')
				return 3;
			else  
				return 2;
	}
}
	

			