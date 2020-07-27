/*Sebas*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user for String and Character (Delimited by ", "
		System.out.print("Enter a string followed by a character e.g. Welcome, e : ");
		String string = input.nextLine();
		
		//Extract character and substring
		int k = string.indexOf(", ");
		String str = string.substring(0, k);
		char a = string.charAt(k + 2);
		System.out.print(count(str, a));
	}
	
	public static int count(String str, char a){
		int counter = 0;
		// Count the number of occurrences of the character a in the string str
		for (int i = 0; i < str.length(); i ++){
			if(str.charAt(i) == a)
				counter++;
		}
		return counter;
	}
}
		