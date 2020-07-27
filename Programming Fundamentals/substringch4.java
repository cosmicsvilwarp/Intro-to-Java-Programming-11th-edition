/*
(Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.
*/
import java.util.Scanner;

public class substringch4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first string:");
		String string1 = input.nextLine();
		System.out.println("What is the second string: ");
		String string2 = input.nextLine();
		
		System.out.println(string2 + ((string1.contains(string2)) ? " is " : " is not ") + "a substring of " + string1);
	}
}