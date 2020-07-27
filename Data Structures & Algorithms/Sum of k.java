/*Sebas*/
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		int[]values = {6, 3, 8, 10, 16, 7, 5, 12, 9, 14};
		int target = 10;
		int[] result = findPair(values, target);
		int[] result2 = findPair2(values, target);
		
		//(Brute force) Time: O(N2).   Space:O(1)
		System.out.println("Brute force:");
		System.out.println(Arrays.toString(result2));
		//(Efficient) Time: O(N).   Space:O(N)
		System.out.println("Using Hashtable:");
		System.out.println(Arrays.toString(result));
		
		
		//In a sorted array
		int[]sortedValues = {1, 3, 4, 5, 6, 8, 9, 10, 12, 14};
		//int[]result3 = findPair3(sortedValues, target);
		findPair3(sortedValues, target);
	}
	//Brute force solution
	public static int[] findPair(int[]values, int target){
		for(int i = 0; i < values.length - 1; i++){
			for(int j = i + 1; j < values.length; j++){
				if(values[i] + values[j] == target)
					return new int[]{i, j};
			}
		}
		throw new IllegalArgumentException("No solution");
	}
	public static int[] findPair2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		return new int[2];
	}
	
	public static void findPair3(int[]nums, int k){
		System.out.println("\n\nPairs equalling sum of k in a sorted array: ");
		int i = 0;
		int j = nums.length - 1;
		while(i < j){
			//Move both pointers if equal
			if(nums[i] + nums[j] == k){
				System.out.println(i + " " + j);
				i++;
				j--;
			}
			else if(nums[i] + nums[j] > k){//if result is more decrease j in order to get snaller number
				j--;
			}
			else{ //otherwise if lesser, increase i to get bigger value since list is sorted
				i++;
			}
		}
	} 
}