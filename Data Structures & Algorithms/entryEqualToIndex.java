/*Sebas*/
//Search a sorted array entry equal to its index
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class EPI11E2 {
	public static void main(String[] args) {
		int[]value = {-2, -3, 0, 3, 2, 2, 2, 3, 3, 10, 10, 10, 9};
		System.out.println("Entry equal to its Index: ");
	//	System.out.println(linear(value));
		System.out.println(binarySearch(value));
	}
	public static int linear(int[]list){
		for(int i = 0; i < list.length; i++){
			if(list[i] == i){
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[]list){
		Arrays.sort(list);
		int low = 0, high = list.length - 1;
		while(low <= high){
			int mid = low + (high - low)/2;
			int difference = list[mid] - mid;
			if(difference == 0){
				return list[mid];
			}
			else if(difference > 0){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return -1;
	}
}