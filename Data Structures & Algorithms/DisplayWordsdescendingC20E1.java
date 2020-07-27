/*Sebas*/
/*********************************************************************************
* (Display words in ascending alphabetical order) Write a program that reads     *
* words from a text file and displays all the words (duplicates allowed) in      *
* ascending alphabetical order. The words must start with a letter. The text     *
* file is passed as a command-line argument.                                     *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class Untitled {
	public static void main(String[] args) throws FileNotFoundException {
		LinkedList<String> list = new LinkedList<>();
		File file = new File("/Users/sebastienstvil/Movies/Test/Chapter1/Exercise2_5.txt");
		if(!file.exists()){
			System.out.println(file.getName() + "does exist");
			throw new FileNotFoundException("Please enter correct file path");
		}
		
		try(
			Scanner input = new Scanner(file);
		){
			while(input.hasNext()){
				String line = input.next().toLowerCase();
				if(Character.isLetter(line.charAt(0)))
					list.add(0, line);
			}
		}
		Collections.sort(list, Comparator.comparing((e) -> e.charAt(0)));
		list.forEach(e -> System.out.println(e));
	}
}