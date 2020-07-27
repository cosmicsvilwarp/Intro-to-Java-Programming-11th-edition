/*
(Format an integer) Write a method with the following header to format the integer
with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size
of the string is the width. For example, format(34, 4) returns 0034 and format(
34, 5) returns 00034. If the number is longer than the width, the method
returns the string representation for the number. For example, format(34, 1)
returns 34.
Write a test program that prompts the user to enter a number and its width and
displays a string returned by invoking format(number, width).
*/
/*Sebas*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int number = input.nextInt();
		System.out.print("Please enter width: ");
		int width = input.nextInt();
		System.out.print(format(number, width));
		
	}
	public static String format(int number, int width){
		String num = number + "";
		
		if (num.length() < width) {
					for (int i = width - num.length(); i > 0; i--) {
						num = 0 + num ;
					}
				}
				return num;
		}
}