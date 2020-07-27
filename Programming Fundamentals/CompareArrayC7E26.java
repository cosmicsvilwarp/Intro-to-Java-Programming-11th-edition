/*********************************************************************************
* (Strictly identical arrays) The arrays list1 and list2 are strictly identical  *
* if their corresponding elements are equal. Write a method that returns true if *
* list1 and list2 are strictly identical, using the following header:            *
*                                                                                *
* public static boolean equals(int[] list1, int[] list2)                         *
*                                                                                *
* Write a test program that prompts the user to enter two lists of integers and  *
* displays whether the two are strictly identical. Here are the sample runs.     *
* Note that the first number in the input indicates the number of the elements   *
* in the list. This number is not part of the list.                              *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user for input for list1 and list2
		System.out.println("Enter list 1: ");
		int[] number1 = new int[input.nextInt()];
		number1 = fillArray(number1);
		System.out.println("Enter list 2: ");
		int[] number2 = new int[input.nextInt()];
		number2 = fillArray(number2);
	
		//Display results of whether lists were identical or not
		System.out.print((equals(number1,number2) == true)? "Two lists are strictly identical" : "Two lists are not strictly identical");
	}
	/**Method to fill array with inputs**/
	public static int[] fillArray(int[]list){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < list.length; i++){
			list[i] = input.nextInt(); 
		}
		return list;
		}
	
	/**Method that determines if arrays are identical **/
	public static boolean equals(int[]list1, int[] list2){
		//Check if both Arrays are same length
		if(list1.length != list2.length)
			return false;
		//Compare each element of each array to each other 
		for(int i = 0; i < list1.length; i++){
				if(list1[i] != list2[i])
					return false;
					}
					return true;
	}
}