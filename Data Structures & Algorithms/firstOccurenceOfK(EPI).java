/*Sebas*/
//Search a Sorted Array for first Occurence of K
//Binary Search
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class EPI11E1 {
	public static void main(String[] args) {
		System.out.println("First occurence of k: ");
		int[]nums = {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
		int k1 = nums[3]; //nums[3] = 108
		int k2 = nums[6]; //nums[3] = 285
		System.out.println(k1 + ":    " + binarySearch(nums, k1));
		System.out.println(k2 + ":    " + binarySearch(nums, k2));
		
		System.out.println("\nLast occurence of k: ");
		System.out.println(k1 + ":    " + binarySearch2(nums, k1));
		System.out.println(k2 + ":    " + binarySearch2(nums, k2));
		
		System.out.println("\nOccurence of element greater than that key: ");
		System.out.println(k1 + ":    " + binarySearch3(nums, k1));
		System.out.println(k2 + ":    " + binarySearch3(nums, k2));
		
		System.out.println("\nOccurence of element smaller than that key: ");
		System.out.println(k1 + ":    " + binarySearch4(nums, k1));
		System.out.println(k2 + ":    " + binarySearch4(nums, k2));
		
	}
	public static int binarySearch(int[]list, int key){
		int low = 0, high = list.length - 1;
		int result = -1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if(list[mid] > key){
				high = mid - 1;
			}
			else if(list[mid] == key){
				result = mid;
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return result;
	}
	
	public static int binarySearch2(int[]list, int key){
		int low = 0, high = list.length - 1;
		int result = -1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if(list[mid] < key){
				low = mid + 1;
			}
			else if(list[mid] == key){
				result = mid;
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return result;
	}
	
	public static int binarySearch3(int[]list, int key){
		int low = 0, high = list.length - 1;
		int mid = 0;
		while(low != high){
			mid = low + (high - low)/2;
			if(list[mid] <= key){
				low = mid + 1;
			}
			else{
				high = mid;
			}
		}
		return high;	
	}
	
	public static int binarySearch4(int[]list, int key){
		int low = 0, high = list.length - 1;
		int mid = 0;
		while(low != high){
			mid = low + (high - low)/2;
			if(list[mid] >= key){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return mid;
	}
}
