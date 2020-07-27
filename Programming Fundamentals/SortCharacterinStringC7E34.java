
/*********************************************************************************
* (Sort characters in a string) Write a method that returns a sorted string      *
* using the following header:                                                    *
*                                                                                *
* public static String sort(String s)                                            *
*                                                                                *
* For example, sort("acb") returns abc.                                          *
* Write a test program that prompts the user to enter a string and displays the  *
* sorted string.                                                                 *
*********************************************************************************/

/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter word: ");
		String word = input.next();
		System.out.print(sort(word));
		
	}
	public static char[] sort(String s){
		char[]array = new char[s.length()];
		
		for(int i = 0; i < array.length; i++){
			array[i] = s.charAt(i);
		}
		
		
		for(int i = 0 ; i < array.length - 1; i++){
			char min = array[i];
			int minindex = i;
			for(int j = i+1; j < array.length; j++){
				if(min > array[j]){
					min = array[j];
					minindex = j;
				}
			}
				if(minindex != i){
				array[minindex] = array[i];
				array[i] = min;
			}
		}
		return array;
	}
}
