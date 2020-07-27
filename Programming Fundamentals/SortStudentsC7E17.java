/*********************************************************************************
* (Sort students) Write a program that prompts the user to enter the number of  *
* students, the students’ names, and their scores, and prints student names in  *
* decreasing order of their scores.                                             *
*********************************************************************************/
/*Sebas*/
//selectionsort
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students:  ");
		int SIZE = input.nextInt();
		int[] scores = new int[SIZE];
		String[] students = new String[SIZE];
		
		//Prompts user to enter each students' name and their scores
		for(int i = 0; i < SIZE; i++){
			System.out.print("Student " +(i+1)+": ");
			students[i] = input.next();
			System.out.print("Score: ");
			scores[i]= input.nextInt();
		}
		
		System.out.print(Arrays.toString(scores));
		System.out.println();
		
		//Sorts students name in decreasing order of their scores
		sortDecreasing(scores, students);
		
		System.out.print(Arrays.toString(scores));
		
		//Prints results
		System.out.println();
		for (int i = 0 ; i < SIZE ; i++){
			System.out.println("In number "+ (i+1)+" "+students[i]+" had " + scores[i]+ " points");
		}
	}
		/** sorts a string and integer array in decreasing order */
		public static int[] sortDecreasing(int[] array, String[]str){
			for(int i = 0; i < array.length; i++){
				int max = array[i];
				int maxindex = i;
				String temp;
				
				// Find the max in the list[i..nums.length - 1]
				for(int j = i + 1; j < array.length; j++){
					if(max < array[j]){
						max = array[j];
						maxindex = j;
					}
				}
				if(maxindex !=i){
					//swap string array
					temp = str[i];
					str[i] = str[maxindex];
					str[maxindex] = temp;
					
					//swap int array
					array[maxindex] = array[i];
					array[i] = max;		
				}
			}
			return array;
		}
}
