
/*********************************************************************************
* (Guessing the capitals) Rewrite Programming Exercise 8.37 to store the pairs   *
* of states and capitals so that the questions are displayed randomly.           *
*********************************************************************************/
import java.util.*;

class Exercise_20_03 {
	protected static Stack<String> states = new Stack<>();
	protected static Stack<String> capitals = new Stack<>();

	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Store 50 states and their capitals in two lists
		getData();

		int count = 0;	// Correct answer					
		// Repeatedly prompt the user to enter the capital of a state
		while(!states.isEmpty()){
			String popped = capitals.pop();
			System.out.print("What is the capital of "
				+ states.pop() + "? ");

			if (input.next().equalsIgnoreCase(popped)) {
				System.out.println("Your answer is correct");
				count++;
			}
			else {
				System.out.println("The correct answer should be " + popped + "\n");
			}
		}

		// Display the total correct count
		System.out.println("\nThe correct count is " + count);
	}

	/** getData initializes the array with the 50 states and their capitals */
	public static void getData() {
		String[][] d = {
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
			{"Nevada	", "Carson City"}, {"New Hampshire", "Concord"}, 
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

		// Seperate the states and capitals into two lists
		for (int i = 0; i < d.length; i++) {
			states.add(d[i][0]);
			capitals.add(d[i][1]);
		}
		
		// Shuffles both lists using an identical randam sequence
		long seed = System.currentTimeMillis();
		Collections.shuffle(states, new Random(seed));
		Collections.shuffle(capitals, new Random(seed));
	}
}

//2nd method
/*LinkedList<String[]> list = new LinkedList<>();

		Collections.addAll(list, stateCapitals);

		Scanner input = new Scanner(System.in);
		int correctCount = 0;
		while (list.size() > 0) {
			Collections.shuffle(list);
			String[] s = list.pollFirst();
			System.out.print("What is the capital of " + s[0] +"? ");
			if (input.nextLine().equalsIgnoreCase(s[1])) {
				correctCount++;
				System.out.println("Your answer is correct!");
			} else {
				System.out.println("WRONG - The correct answer is " + s[1]);
			}
		}
		System.out.println("The correct count is " + correctCount);
	}*/