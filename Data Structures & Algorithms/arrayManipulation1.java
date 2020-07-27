/*Sebas*/
/*time Complexity of all Functions: O(N)
*/
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.stream.*;


class Demo {
	public static void main(String[] args) {
		int[]nums1 = {3,4,5,6,10};
		int[]nums2 = {2, 4, 5, 7, 12};
		int[]difference = findDiff(nums1, nums2);
		System.out.println("Difference:");
		System.out.println(Arrays.toString(difference));
		
		System.out.println("\n\nUnion:");
		int[]merged = union(nums1, nums1.length, nums2, nums2.length);
		System.out.println(Arrays.toString(merged));
		
		System.out.println("\n\nIntersection:");
		int[]intersect = intersection(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
		
		System.out.println("\n\nSum of nums2: ");
		System.out.println(sum(nums2, 3));
		
		System.out.println("\n\n.....Adding 6 to nums2 ");
		nums2 = insert(nums2, 6);
		System.out.println(Arrays.toString(nums2));
		System.out.println("\n\nIs nums2 sorted:  " + isSorted(nums2));
		
		//Find missing elements
		System.out.println("\n\n\nFinding missing elements in nums3...\n");
		int[]nums3 = {6, 7, 8, 9, 11, 12, 15, 16, 17, 18, 19};
		findMissing(nums3);
		System.out.println();
		findMissing2(nums3);
	}
	
	
	
	public static int[]findDiff(int[]nums1, int[]nums2){
		int i = 0, j = 0, k = 0;
		int[]temp = new int[7];
		while(i < nums1.length && j < nums2.length){
			if(nums1[i] < nums2[j]){
				temp[k++] = nums1[i++];
			}
			else if(nums1[i] > nums2[j]){
				temp[k++] = nums2[j++];
			}
			else{
				i++;
				j++;
			}
		}
		while(j < nums2.length)
			temp[k++] = nums2[j++];
		return temp;
	}
	public static int[]union(int[]nums1, int m, int[]nums2, int n){
			int[]merge = new int[m + n];
			int i = 0, j = 0, k = 0;
			
			while(i < m && j < m){
				if(nums1[i] < nums2[j]){
					merge[k++] = nums1[i++];
				}
				else if(nums1[i] == nums2[j]){
					merge[k++] = nums2[j++];
					i++;
				}
				else{
					merge[k++] = nums2[j++];
				}
			}
			while(j < m)
				merge[k++] = nums2[j++];
			return merge;
	}
	
	public static int[] intersection(int[]a, int[]b){
			int[]temp = new int[a.length - 3];
			int i = 0, j = 0, k = 0;
			while(i < a.length && j < b.length){
				if(a[i] == b[j]){
					temp[k++] = a[i++];
					j++;
				}
				else{
					i++;
					j++;
				}
			}
			return temp;
	}
	public static int[] insert(int[]a, int x){
			int[]b = new int[a.length + 1];
			System.arraycopy(a, 0, b, 0, a.length);
			
			int i = a.length - 1;
			while(b[i] > x){
				b[i + 1] = b[i];
				i--;
			}
			b[i + 1]  = x;
			return b;
		}
	public static boolean isSorted(int[]arr){
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
	public static void fix(int[]a){
		int i = 0;
		int j = a.length - 1;
		while(i < j){
			while(a[i] < 0)i++;
			while(a[j] >= 0)j--;
			if(i < j){
				swap(a[i], a[j]);
			}
		}
	}
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	public static int sum(int[]a, int length){
		if(length < 0)
			return 0;
		else
			return sum(a, length - 1) + a[length];
	}
	
	public static void findMissing(int[]a){
			System.out.println("(1st Version) Missing elements: ");
			int diff = a[0] - 0; //find difference of first value && index
			for(int i = 0; i < a.length; i++){
				if(a[i] - i != diff){ //if value - index does not equal diff, element is missing
					while(diff < a[i] - i){
						System.out.println(i + diff);
						diff++; //we Incresase diff everytime we encounter a missing element
					}
				}
			}
		}
		public static void findMissing2(int[]a){
			int low = a[0];
			int max = IntStream.of(a).max().getAsInt();//Find max in Array a
			
			//drawback of this method is the space it consumes as ensuing array has the size of the maximum value in array 'a'
			int[]H = new int[max + 1];
			
			
			for(int i = 0; i < a.length; i++){
				H[a[i]]++; //Increase index of H if exists in array 'a
			}//Missing elemetns will be the index with 0 values
			
			System.out.println("(2nd Version) Missing elements: ");
			for(int i = low ; i < H.length; i++){
				if(H[i] == 0)
					System.out.println(i);
			}
		}
		//Only works when dealing with natural numbers (1, 2, 3 ,4 ,... n)
		public static int missing(int[]a){
			
				int n = a.length + 1;
				int total = IntStream.of(a).reduce(Integer::sum).getAsInt();
				int actualTotal = n * (n + 1)/ 2;
				//we deduct the total values of array from natural number total n * (n + 1)/ 2;
				return (actualTotal - total);
		}
}