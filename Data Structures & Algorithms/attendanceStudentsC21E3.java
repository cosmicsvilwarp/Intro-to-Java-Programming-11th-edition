/*Sebas*/
/*(Checking whether a key exists in a set) Given a problem that is identical to the previ- ous Programming Exercise 21.2, write a program that displays, in ascending order, the first names of those students who have attended more than one day of the course. If there are students with the same first name, display their first and last names.*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter file path: ");
		String text = new Scanner(System.in).next();
		
		//Check if file exists
		File file = new File(text);
		if(!file.exists())
			throw new FileNotFoundException(file + " does not exist");
			
		Map<String,Integer> treeMap = new TreeMap<>();
		
		try(
			Scanner input = new Scanner(file);
		){
			while(input.hasNext()){
				
				String line = input.nextLine();
				String[]token = line.split("[ |\n|\t|\r|.|,|)|(|-|\"]");
				
				for(String word : token){
					if(!treeMap.containsKey(word))
						treeMap.put(word, 1);
					else
						treeMap.put(word, treeMap.containsKey(word) ? treeMap.get(word) + 1 : 1);
				}
			}
			//Display students who have attended more than one day of the course
			treeMap.forEach((name, count) -> { if(count > 1) System.out.println(name + " " + count);});
		}
	}
}