/*Sebas*/
//Selection sort finds the smallest number in the list and swaps it with the first element. It then finds the smallest number remaining and swaps it with the second element, and so on, until only a single number remains.
/*For binary search to work, the elements in the array must already be ordered. Assume that the array is in ascending order.*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		
		//Create an integer array of size n
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the size of your array: ");
		int n = input.nextInt();
		int[] list = new int[n];
		
		//Assign random unsorted integers to Array list
		//then use SelectionSort to sort list
		list = putRandom(list);//function for random integers
		System.out.println("\n****Array will be assigned sorted integers****\n");
		System.out.print(Arrays.toString(list));
		SelectionSort(list);//Function to sort list
		System.out.println("\n****Sorted Arrays (after selection sort)****\n");
		System.out.print(Arrays.toString(list));
		
		System.out.println("\n\nPlease enter the number you are looking for: \n");
		int key = input.nextInt();//Variable that stores numbers Binary search will lokk for
		
		
		int k = BinarySearch(list, key);//contains index at which the number was found 
		
		//Prints the index at which number was found
		System.out.println((k >= 0) ? "\nThe key was found in element " + k : "\nThe key was not found");
		}
		
	public static int[] putRandom (int[] list){
		
		for (int i = 0 ; i < list.length ; i ++){
			list[i] = (int)(Math.random() *1000);
		}
		return list;
	}
	
	/** Use binary search to find the key in the list */
	public static int BinarySearch(int[] list, int key){
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low){
			int mid = (high + low)/ 2;
			if(key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
			return -low - 1;
	}
	
	/** The method for sorting the numbers */
	public static void SelectionSort (int[] list){
		for (int i = 0; i < list.length - 1; i++) {
		// Find the minimum in the list[i..list.length-1]
		int currentMin = list[i]; 
		int currentMinIndex = i;
		
			for (int j = i + 1; j < list.length; j++){ 
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
	// Swap list[i] with list[currentMinIndex] if necessary
			if(currentMinIndex != i){
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
}