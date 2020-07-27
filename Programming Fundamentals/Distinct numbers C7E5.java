/*Sebas*/
//(Print distinct numbers) Write a program that reads in ten numbers and displays the number of distinct numbers and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once). (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.) After the input, the array contains the distinct numbers. Here is the sample run of the program:
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 10 numbers: ");
		int[] numbers = new int[10];
		int num;
		int count = 0; 
		
		//Takes only inputs if number is distinct
		for(int i =0; i < numbers.length; i++){
			num = input.nextInt();
			if(isDistinct(numbers, num)){
				numbers[i] = num;
				count++;
				}
		}
		
			System.out.println("The number of distinct number is " + count);
			System.out.println("The distinct numbers are: ");
			
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > 0)//Only display numbers 
					System.out.print(" " + numbers[i]);
					}
					System.out.println();
		}
			
	
	//***Function returns true if number is distinct, returns false otherwise.***/
	public static boolean isDistinct(int[]numbers, int num){
		for(int i =0 ; i < numbers.length; i++){
			if(num == numbers[i])
				return false;
		}
		return true;
	}
}