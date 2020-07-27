/*Sebas*/
/*(Guess the capitals using maps) Rewrite Programming Exercise 8.37 to store pairs of each state and its capital in a map. Your program should prompt the user to enter a state, and should display the capital for the state.*/
import java.io.*;
import java.net.*;
import java.util.*;



class guessCapitals {
	public static void main(String[] args) {
		//Store 50 states and their capitals
		Map<String, String> linkedMap = addData();
		
		//Display the capital for the state
		linkedMap.forEach((capital, state) -> {
			System.out.println("\nWhat is the capital of " + capital + " ?");
			
			String response = new Scanner(System.in).next();
			System.out.println((response.equalsIgnoreCase(state)? "Your answer is correct" : "WRONG - The correct answer should be " + state));});
	}
	
	public static Map<String, String> addData(){
		Map<String, String> map = new HashMap<>();
		
		for(String[]pair : data)
			map.put(pair[0], pair[1]);
			
		return map;
	}
	private static String[][] data = {
					{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
					{"Arkansas", "Little Rock"}, {"California", "Sacramento"},
					{"Colorado", "Denver"}, {"Connecticut", "Hartford"}, 
					{"Delaware", "Dover"}, {"Florida", "Tallahassee"}, 
					{"Georgia", "Atlanta"},{"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
					{"Illinois", "Springfield"}, {"Indiana", "Indianapolis"},
					{"Iowa Des", "Moines"}, {"Kansas", "Topeka"}, {"Kentucky","Frankfort"}, 
					{"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, 
					{"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, 
					{"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, 
					{"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, 
					{"Montana", "Helena"}, {"Nebraska", "Lincoln"}, 
					{"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, 
					{"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, 
					{"New York", "Albany"}, {"North Carolina", "Raleigh"}, 
					{"North Dakota", "Bismarck"},{"Ohio", "Columbus"},
					{"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, 
					{"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, 
					{"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, 
					{"Tennessee", "Nashville"}, {"Texas", "Austin"}, 
					{"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, 
					{"Virginia", "Richmond"}, {"Washington", "Olympia"}, 
					{"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, 
					{"Wyoming", "Cheyenne"}};
}