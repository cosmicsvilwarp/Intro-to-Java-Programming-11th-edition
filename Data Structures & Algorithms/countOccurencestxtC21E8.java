/*Sebas*/
/*(Count the occurrences of words in a text file) Rewrite Listing 21.9 to read the text from a text file. The text file is passed as a command-line argument. Words are delimited by whitespace characters, punctuation marks (,;.:?), quotation marks ('"), and parentheses. Count words in case-insensitive fashion (e.g., consider Good and good to be the same word). The words must start with a let- ter. Display the output in alphabetical order of words, with each word preceded by its occurrence count.*/

import java.io.*;
import java.util.*;

class countWords {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter file path: ");
		String text = new Scanner(System.in).next();
		
		File file = new File(text);
		if(!file.exists())
			throw new FileNotFoundException(file.getName() + " is not a valid path");
			
		// Create a TreeMap to hold words as key and count as value	
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		
		try(
			Scanner input = new Scanner(file);
		){
			while(input.hasNext()){
				
				String line = input.nextLine().toLowerCase();
				String[]words = line.split("[,.-]");
				
				for(String word : words){
					if(word.length() > 0){
						if(!treeMap.containsKey(word))
							treeMap.put(word, 1);
						else 
							treeMap.put(word, treeMap.containsKey(word) ? treeMap.get(word) + 1 : 1);
					}
				}
			}
			treeMap.forEach((key, value) -> System.out.println(key + " " + value));
		}
	}
}
	
