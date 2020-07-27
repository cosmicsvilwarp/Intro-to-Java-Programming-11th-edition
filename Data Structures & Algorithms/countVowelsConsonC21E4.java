/*Sebas*/
/*(Count consonants and vowels) Write a program that prompts the user to enter a text file name and displays the number of vowels and consonants in the file. Use a set to store the vowels A, E, I, O, and U.*/
import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args)throws FileNotFoundException {
		System.out.println("Enter txt file path: ");
		String text = new Scanner(System.in).next();
				
		//Check if file exists
		File file = new File(text);
		if(!file.exists())
			throw new FileNotFoundException(file.getName() + " is not valid");
		
		HashSet<Character> set = new HashSet<>(List.of('A', 'E', 'I', 'O', 'U'));
		int vowelCount = 0; //Counts the number of vowels 
		int consonantCount = 0; //Counts the number of consonnants
		
		// Count the number of vowels and consonants in the file
		try(
			Scanner input = new Scanner(file)
		){
			while(input.hasNext()){
				String line = input.nextLine().toUpperCase();
				
				for(char ch : line.toCharArray()){
					if(Character.isLetter(ch)){
						if(set.contains(ch))
							vowelCount++;
						else
							consonantCount++;
					}
				}
			}
		}// Display the number of vowels and consonants in the file
		System.out.println("\nVowels: " + vowelCount + "\nConsonants: " +
		consonantCount);
	}
}