import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;

//Sort 10 random numbers of an array using bucket sort  (20 < n < 200)
class BucketSort {
	public void bucketSort(int[] list, int n) {
		if (n <= 0)
			return;
		ArrayList<Integer>[] bucket = new ArrayList[n];

		// Create empty buckets
		for (int i = 0; i < n; i++)
			bucket[i] = new ArrayList<Integer>();

		// Add elements into the buckets
		for (int i = 0; i < n; i++) {
			bucket[hash(list[i])].add(list[i]);
		}

		// Sort the elements of each bucket
		for (int i = 0; i < n; i++) {
			Collections.sort((bucket[i]));
		}

		// Get the sorted array
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0, size = bucket[i].size(); j < size; j++) {
				list[index++] = bucket[i].get(j);
			}
		}
	}
	private int hash(int num){
		return num / 10;
	}
	
	public static void main(String[]args){
		BucketSort b = new BucketSort();
		int[] list = {2, 3, 2, 5, 6, 1, 3, 14, 12};
		System.out.println("Before the sorting: ");
		System.out.println(Arrays.toString(list));
		
		System.out.println("\n\nAfter the sorting: ");
		b.bucketSort(list, list.length);
		System.out.println(Arrays.toString(list));
		
	}
}