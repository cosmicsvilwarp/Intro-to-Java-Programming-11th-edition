/*Sebas*/
/*This case study writes a program that counts the occurrences of words in a text and displays the words in ascending order of occurrence counts.*/

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
			//Transfer to map in order to use collections for sorting 
			List<Map.Entry<String,Integer>>entries = new ArrayList<>(treeMap.entrySet());
			Collections.sort(entries, (e1, e2) -> { return -e1.getValue().compareTo(e2.getValue());});
			
			//Display results
			for(Map.Entry<String, Integer> e : entries)
				System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
	
