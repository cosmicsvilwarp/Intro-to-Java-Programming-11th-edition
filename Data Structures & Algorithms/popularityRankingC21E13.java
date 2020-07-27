/*Sebas*/
/*********************************************************************************
* (Baby name popularity ranking) Revise Programming Exercise 21.11 to prompt the *
* user to enter year, gender, and name and display the ranking for the name.     *
* Prompt the user to enter another inquiry or exit the program. Here is a sample *
* run:                                                                           *
*********************************************************************************/
import java.io.*;
import java.net.*;
import java.util.*;

class popularityRanking {
	
	static Map<String,Integer>boyMap = new HashMap<>();
	static Map<String,Integer>femaleMap = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean inquiry = true;
		
		do{
			// Prompt the user to enter year, gender and name
			System.out.print("Enter the year (2001-2010): ");
			int year = input.nextInt();
			String website = "http://liveexample.pearsoncmg.com/data/babynamesranking"+ year +".txt";
			System.out.print("\nEnter gender (M-F): ");
			String gender = input.next();
			System.out.print("\nEnter the name: ");
			String name = input.next().toLowerCase();
			
			getNames(website);//download Website data to HashMap
			
			// Display the ranking for the name
			if(getGender(gender) == 1){
				System.out.println((boyMap.containsKey(name)) ? name + " is ranked #" + boyMap.get(name) + " in year " + year : "No rank available, " + name + " is not in the list");
			}else if(getGender(gender) == 3){
				System.out.println((femaleMap.containsKey(name)) ? name + " is ranked #" + femaleMap.get(name) + " in year " + year : "No match was found, " + name + " is not in the list");
			} 
			
			// Prompt the user to enter another 
			// inquiry or exit the program
			System.out.println("\nEnter another inquiry:");
			String again = input.next();
			
			inquiry = (again.equalsIgnoreCase("No") || again.equalsIgnoreCase("N") ? false : true);
		}
		while(inquiry);
	}
	/*Stores names in keys index, Stores ranks in value index of HashMap*/
	public static void getNames(String website){
		try{
			Scanner in = new Scanner(new URL(website).openStream()); //Load data from website
			
			while(in.hasNext()){
				String line = in.nextLine().toLowerCase();
				String[]split = line.split("\\s+");
				boyMap.put(split[1], Integer.parseInt(split[0]));
				femaleMap.put(split[3], Integer.parseInt(split[0]));
			}
			}catch(MalformedURLException ux){
				System.out.println("Invalid URL");
			}catch(IOException ex){
				System.out.println("I/O Errors: no such file");
			}
	}
	/*Determines if gender is male or female*/
	public static int getGender(String gender){
			if(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("Male"))
				return 1;
			else if(gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("Female"))
				return 3;
			else 
				throw new InputMismatchException("Wrong input, Please enter M or F.");
		}
}