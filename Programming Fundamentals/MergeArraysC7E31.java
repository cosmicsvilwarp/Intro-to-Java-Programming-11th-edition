/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompts user for array inout 
		System.out.print("Enter list1: ");
		int[]list1 = new int[input.nextInt()];
		fillArray(list1);
		System.out.print("Enter list2: ");
		int[]list2 = new int[input.nextInt()];
		fillArray(list2);
		
		//Merged both of the Arrays
		int[] list3 = merge(list1, list2);
		
		//Displays sorted merged array
		System.out.print(Arrays.toString(list3));
}
	//Method for user input 
	public static int[] fillArray(int[]array){
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}
		return array;
	}
	
	//Merged both of the arrays
	public static int[] merge(int[]list1, int[]list2){
		//Merged array will be the combined size of both arrays
		int length3 = list1.length + list2.length;
		int[] list3 = new int[length3];
		
		//Adding the first array to the merged array
		for(int i = 0; i < list1.length; i++){
			list3[i] = list1[i];
		}
		//Adding the second array to the merged array
		for(int i = 0, j = list1.length; i < list2.length; i++, j++){
				list3[j] = list2[i];
			}
				
			//Calls sort method to sort the merged array
			sort(list3);
			
			//returns the merged array
			return list3;
	}
	
	//Selection sort (Ascending)
	public static void sort(int[]array){
		int min = array[0];
		int minindex = 0;
		
		for(int i = 0; i < array.length; i++){
			min = array[i];
			minindex = i;
			for(int j = i + 1; j < array.length; j++){
				if(min > array[j]){
					min = array[j];
					minindex = j;
				}
			}
			if(minindex != i)
			{
				array[minindex] = array[i];
				array[i] = min;
			}
		}
	}
}