/*Sebas*/
import java.util.*;
/*(Addition quiz) Rewrite Listing 5.1, RepeatAdditionQuiz.java, to alert the user if an answer is entered again. (Hint: use an array list to store answers.) Here is a sample run:
			What is 5 + 9? 12
			Wrong answer. Try again. What is 5 + 9? 34 Wrong answer. Try again. What is 5 + 9? 12 You already entered 12
			Wrong answer. Try again. What is 5 + 9? 14 You got it!
			
			Created by Sebastien on 05/08/20.
*/
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> store = new ArrayList<>();
		
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		
		int choice;
		int answer;
		
		
		do{
			
			System.out.print("What is " + number1 +" + " +number2 +" ?  ");
			
			answer = number1 + number2;
			choice = input.nextInt();
			
			if(choice != answer && store.contains(choice)){
				System.out.println("You already entered "+ choice);	
			}
			else if (choice != answer){
				store.add(choice);
				System.out.println("Wrong answer. Try again.");
			}
			else {
				System.out.println("You got it!");
			}
		}
		while(choice != answer);
	}
}