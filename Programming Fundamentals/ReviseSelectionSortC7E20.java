/*********************************************************************************
* (Revise selection sort) In Section 7.11, you used selection sort to sort an    *
* array. The selection-sort method repeatedly finds the smallest number in the   *
* current array and swaps it with the first. Rewrite this program by finding the *
* largest number and swapping it with the last. Write a test program that reads  *
* in ten double numbers, invokes the method, and displays the sorted numbers.    *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		double[] list = new double[10];
		
		//Fill array with random integers
		for(int i = 0; i < list.length; i++){
			list[i] = (int)(Math.random()*100);
		}
	//Prints results
		System.out.print(Arrays.toString(isSorted(list)));
	}
	
	/** selsctionSort sorts array in accending order */
	public static double[] isSorted(double[] array){
		
		for(int i = array.length -1 ; i >= 0; i--){
			double max = array[i];
			int maxindex = i;
			for(int j = i - 1 ; j >= 0; j--){
				if(max < array[j]){
					max = array[j];
					maxindex = j;
				}
			}
			if(maxindex != i){
				double temp = array[maxindex];
				array[maxindex] = array[i];
				array[i] = temp;
			}
		}
		return array;
	}
}