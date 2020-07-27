/*Sebas*/

//(Remove duplicates) Write a method that removes the duplicate elements from an array of integers 
//and returns an array with the non-dups only
//Testing
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[]array = new int[6];
		System.out.println("Please enter 6 integers: ");
		for(int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}
		//returns non duplicate Array
		int[] result = removeDuplicates(array);
		
		//Display results 
		System.out.println(Arrays.toString(result));
	}
	//removeDuplicates rempves duplicates from array
	public static int[] removeDuplicates(int[]array){
		int count = 0; //keeps count of distinct numbers 
		
		//Array temporarily stores the non dups
		int[] temp = new int[array.length];
		
		for(int i = 0 ; i < array.length; i++){
			if(!contains(temp, array[i])){
				count++;
				temp[i] = array[i];
			}
		}
		//Create array of the size of non dups
		//and copy elements as long as they are not 0;
		
		int[] finalarray = new int[count];
		
		for(int i = 0, j = 0; i < temp.length; i++){
			//index with 0's were initially the dups
			if(temp[i] > 0){
				
				j++;
				finalarray[j-1] = temp[i];
			}
		}
		return finalarray;
	}
	
	//Function returns true if Array contains element, false otherwise
	public static boolean contains(int[]array, int num){
		for(int i = 0 ; i < array.length; i++){
			if(num == array[i])
				return true;
		}
		return false;
	}
}