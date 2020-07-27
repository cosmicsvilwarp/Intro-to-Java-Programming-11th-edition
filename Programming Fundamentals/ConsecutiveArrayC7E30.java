/*********************************************************************************
* (Pattern recognition: consecutive four equal numbers) Write the following      *
* method that tests whether the array has four consecutive numbers with the same *
* value.                                                                         *
*                                                                                *        
* public static boolean isConsecutiveFour(int[] values)                          *
*                                                                                *        
* Write a test program that prompts the user to enter a series of integers and   *
* displays if the series contains four consecutive numbers with the same value.  *
* Your program should first prompt the user to enter the input size—i.e., the    *
* number of values in the series.                                                *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input and fill arrays
		System.out.print("Enter the number of values: ");
		final int SIZE = input.nextInt();
		int[] values = new int[SIZE];
		fillArray(values);
		
		//Verifies wheter the user had enter 4 consecutive numbers
		System.out.println(((isConsecutiveFour(values) == true)? "The list has consecutive fours" : "The list has no consecutive fours"));
		}
		
	//Method to fill array
	public static int[] fillArray(int[]list){
		Scanner input = new Scanner(System.in);
		for(int i =0; i < list.length; i++){
			list[i] = input.nextInt();
		}
		return list;
		}
	
	//isConsecutiveFour tests whether has 4 consecutive array elements with the same values.
	public static boolean isConsecutiveFour(int[]list){
		int count = 1;
		System.out.print("Enter the values: ");
		for(int i = 0; i < list.length-1; i++){
			if(list[i] == list[i + 1])
				count++;
			if(count >= 4)
				return true;
			if(list[i]!= list[i+1])
				count = 1;
			}
				return false;
	}
}