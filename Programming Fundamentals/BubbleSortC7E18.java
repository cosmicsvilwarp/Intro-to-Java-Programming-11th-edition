/*********************************************************************************
* (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The     *
* bubblesort algorithm makes several passes through the array. On each pass,     *
* successive neighboring pairs are compared. If a pair is not in order, its      *
* values are swapped; otherwise, the values remain unchanged. The technique is   *
* called a bubble sort or sinking sort because the smaller values gradually      *
* “bubble” their way to the top and the larger values “sink” to the bottom.      *
* Write a test program that reads in ten double numbers, invokes the method,     *
* and displays the sorted numbers.                                               *
*********************************************************************************/
/*Sebas*/
//Bubble Sort 
import java.util.*;


class Untitled {
	public static void main(String[] args) {
		final int SIZE = 10;
		System.out.println("Please enter "+SIZE+" numbers: " );
		double[]numbers = new double[SIZE];
		
		fillArray(numbers);
		System.out.print(Arrays.toString(numbers));
		
		//Sort the numbers 
		bubbleSort(numbers); 
		System.out.println("\n\n****Sorted****");
		System.out.print(Arrays.toString(numbers));
		
	}
	//Randomly fills array with numbers between 0 and 100
	public static double[] fillArray(double[] array){
		for(int i =0; i < array.length; i++){
			array[i] = (int)(Math.random()* 100);
		}
		return array;
	}
	/** bubbleSort */
	public static double[] bubbleSort(double[] array){
		boolean swapped;
		for(int i = 0 ; i < array.length -1; i++){
			swapped = false;
			double temp;
			for(int j = 0; j < array.length-i-1; j++){
				if(array[j] > array[j + 1]){
					temp = array [j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		return array;
	}
}