/*Sebas*/
/*(Display nonduplicate names in ascending order) Given one or more text files, each representing a day’s attendance in a course and containing the names of the students who attended the course on that particular day, write a program that dis- plays, in ascending order, the names of those students who have attended at least one day of the course. The text file(s) is/are passed as command-line argument(s).*/
import java.io.*;
import java.net.*;
import java.util.*;



class Exercice_02 {
	public static void main(String[] args) throws Exception {
		//Prompt user for file path input
		System.out.println("Enter txt file path: ");
		String filename = new Scanner(System.in).next();
		
		// Check if file exists
		File file = new File(filename);
		if(!file.exists())
			throw new FileNotFoundException(file.getName() + " does not exist");
			
		// Create a tree set to hold the words
		TreeSet<String> treeSet = new TreeSet<String>();

		try(
			Scanner input = new Scanner(file);
		){
			while (input.hasNext()) {
				String line = input.nextLine();
				String[] tokens = line.split("[ |\n|\t|\r|.|,|)|(|-|\"]");

				for(String word : tokens)
					treeSet.add(word);
			}
		}
		
		// Display mappings
		System.out.println("\nDisplay words in ascending order ");
		treeSet.forEach((name) -> System.out.println(name));
	}
}

		
