/*Sebas*/
import java.util.Scanner;
/*Write a method that checks whether a string is a valid password. Suppose the password rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed or Invalid Password otherwise.*/

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Creates a Scanner
		
		//Prompts the user to enter a password
		System.out.print("Enter password: ");
		String password = input.next();
		
		// Display Valid Password if rules are followed, Invalid Password otherwise
		System.out.print((isPassword(password) ? "Valid Password" : "Invalid Password"));
		}
	
	public static boolean isPassword (String password){
		boolean specialcharacter = false;//flag variable 
		int countdigit = 0;//Counts numnbers of digits
		int countletter = 0;//Counts number of letters
		
		//Iterate through string
		for(int i = 0 ; i <= password.length()-1 ; i++)
		{
			//Counts the digits
			if(Character.isDigit(password.charAt(i)))
				countdigit ++;

			//Counts the letters
			else if(Character.isLetter(password.charAt(i)))
				countletter ++;

			//Turns Boolean flag to true if Character is neither a digit nor letter
			if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i)))
				specialcharacter = true;
		}
				
		//returs true if Password consists of only letters and digits of at least 8 characters and with a minimum of 2 digits, otherwise returns false.
		return ((password.length() >= 8 && countdigit >= 2 && countletter >= 1 && !specialcharacter) ? true : false) ;
		}
}
		
		
