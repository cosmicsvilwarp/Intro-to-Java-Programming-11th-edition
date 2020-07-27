/*Sebas*/

//Chapter 11 Exercise 17:

/*(ArrayList of Character) Write a method that returns an array list of Charac-
ter from a string using the following header:
public static ArrayList<Character> toCharacterArray(String s)
For example, toCharacterArray("abc") returns an array list that contains characters 'a', 'b', and 'c'.*/

import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user for input 
		System.out.print("Enter a string: ");
		String str = input.next();
		
		//Display result
		System.out.println(toCharacterArray(str));
	}
	
	public static ArrayList<Character>toCharacterArray(String s){
		ArrayList<Character>list = new ArrayList<>();
		
		//Insert element from string to ArrayList
		for(int i = 0; i < s.length(); i++){
			list.add(s.charAt(i));
		}
		return list;
	}
}
		