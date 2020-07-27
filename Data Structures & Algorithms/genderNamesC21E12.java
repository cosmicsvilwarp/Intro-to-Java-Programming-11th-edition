/*Sebas*/
/*(Name for both genders) Write a program that prompts the user to enter one of the filenames described in Programming Exercise 12.31 and displays the names that are used for both genders in the file. Use sets to store names and find common names in two sets. Here is a sample run:*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input 
		System.out.println("Enter the year for baby name rankings (2001-2010): ");
		String website = "http://liveexample.pearsoncmg.com/data/babynamesranking"+ input.next() +".txt";
		
		//Sets to store each gender names 
		Set<String>maleSet = new HashSet<>();
		Set<String>femaleSet = new HashSet<>();
		
		try{
			URL url = new URL(website);
			input = new Scanner(url.openStream());
			
			while(input.hasNext()){
				String line = input.nextLine();
				String[]split = line.split("\\s+");
				maleSet.add(split[1]);
				femaleSet.add(split[3]);
			}
			//Union of the sets
			maleSet.retainAll(femaleSet);
			
			System.out.println(maleSet.size() + " names used for both genders" + "\n\nThey are the following: ");
			maleSet.forEach((e) -> System.out.println(e));
		}catch(MalformedURLException ux){
			System.out.println("Invalid URL");
		}catch(IOException ex){
			System.out.println("I/O: no such file");
		}
	}
}