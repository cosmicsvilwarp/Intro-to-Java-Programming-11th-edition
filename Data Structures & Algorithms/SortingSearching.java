import java.util.*;
import java.util.Arrays;
//Implement Selection Sort, BubbleSort, Insertion Sort, QuickSort, MergeSort, Count Sort, Radix Sort, Binary Search, Heap class 

class SortingSearching{
	public void selectionSort(int[]list){
		for(int i = 0; i < list.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < list.length; j++){
				if(list[j] < list[min]){
					min = j;
				}
			}
			if(min != i){
				int temp = list[i];
				list[i] = list[min];
			}
		}
	}
	public void bubbleSort(int[]list){
		boolean needNextPass = true;
		
		for(int i = 0; i < list.length - 1 && needNextPass; i++){
			needNextPass = false;
			for(int j = 0; j < list.length - i; j++){
				if(list[i] > list[i + 1]){
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}
	public void insertionSort(int[]list){
		for(int k = 1; k < list.length; k++){
			int element = list[k];
			int j = k - 1;
			while(j >= 0 && list[j] > element){
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = element;
		}
	}
	public void quickSort(int[]list){
		quickSort(list, 0, list.length - 1);
	}
	private void quickSort(int[]list, int low, int high){
		if(low < high){
			int pIndex = partition(list, low, high);
			quickSort(list, low, pIndex - 1);
			quickSort(list, pIndex + 1, high);
		}
	}
	private int partition(int[]list, int low, int high){
		int pivot = list[high];
		int i = low - 1;
		for(int j = low; j < high; j++){
			if(list[j] <= pivot){
				i++;
				swap(list, i, j);
			}
		}
		swap(list, i + 1, high);
		return i + 1;
	}
	private void swap(int[]list, int i1, int i2){
		int temp = list[i1];
		list[i1] = list[i2];
		list[i2] = temp;
	}
	
	public void mergeSort(int[]list){
		if(list.length > 1){
			int half = list.length / 2;
			int[]firstHalf = Arrays.copyOfRange(list, 0, half);
			mergeSort(firstHalf);
			
			int[]secondHalf = Arrays.copyOfRange(list, half, list.length);
			mergeSort(secondHalf);
			
			merge(firstHalf, secondHalf, list);
		}
	}
	private void merge(int[]a, int[]b, int[]list){
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length){
			list[k++] = a[i] < b[j] ? a[i++] : b[j++];
		}
		while(i < a.length){
			list[k++] = a[i++];
		}
		while(j < b.length){
			list[k++] = b[j++];
		}
	}
	public void countSort(int[]list){
		int max = Arrays.stream(list).max().getAsInt();
		int[]count = new int[max + 1];
		int[]b = new int[list.length];
		
		for(int i = 0; i < list.length; i++){
			count[list[i]]++;
		}
		for(int i = 1; i <= max; i++){
			count[i] += count[i - 1];
		}
		for(int i = 0; i < list.length; i++){
			b[--count[list[i]]] = list[i];
		}
		System.arraycopy(b, 0, list, 0, list.length);
	}
	public void radixSort(int[]list){
		int max = Arrays.stream(list).max().getAsInt();
		int place = 1;
		
		while(max/place > 0){
			int k = 9;
			int[]count = new int[k + 1];
			int[]b = new int[list.length];
			
			for(int i = 0; i < list.length; i++){
				count[(list[i]/ place) % 10]++;
			}
			for(int i = 1; i <= k; i++){
				count[i] += count[i - 1];
			}
			for(int i = 0; i < list.length; i++){
				b[--count[(list[i]/place) % 10]] = list[i];
			}
			place *= 10;
		}
	}
		
	public int binarySearch(int[]list, int key){
		int low = 0;
		int high = list.length - 1;
		int mid;
		
		while(low <= high){
			mid = low + (high - low) / 2;
			if(key < list[mid]){
				high = mid - 1;
			}
			else if(key > list[mid]){
				low = mid + 1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	public int binarySearchRecursive(int[]list, int key, int low, int high){
		if(low > high) return -1;
		
		int mid = low + (high - low) / 2;
		if(key < list[mid]){
			return binarySearchRecursive(list, key, low, mid - 1);
		}
		else if(key > list[mid]){
			return binarySearchRecursive(list, key, mid + 1, high);
		}
		else{
			return mid;
		}
	}
}
class MinHeap{
	private int capacity = 5;
	private int[]heap;
	private int size;
	
	public MinHeap(){
		heap = new int[capacity];
	}
	public void add(int element){
		ensureCapacity();
		
		heap[size++] = element;
		
		siftUp();
	}
	public void siftUp(){
		int index = size - 1;
		
		while(hasParent(index) && heap[index] < heap[getParentIndex(index)]){
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	public int remove(){
		int minElement = heap[0];
		
		heap[0] = heap[size - 1];
		
		heapify();
		return minElement;
	}
	public void heapify(){
		int index = 0;
		
		int smallestChild = getLeftChildIndex(index);
		while(hasLeftChild(index)){
			
			if(hasRightChild(index) && heap[getRightChildIndex(index)] < heap[smallestChild]){
				smallestChild = getRightChildIndex(index);
			}
			if(heap[index] < heap[smallestChild]){
				break;
			}
			else{
				swap(smallestChild, index);
			}
			index = smallestChild;
		} 
	}
	
	public void ensureCapacity(){
		if(size >= capacity){
			heap = Arrays.copyOf(heap, capacity *= 2);
		}
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public int peek(){
		if(isEmpty())
			throw new NoSuchElementException("Heap is empty!");
		return heap[0];
	}
	private void swap(int indexOne, int indexTwo){
		int temp = heap[indexOne];
		heap[indexOne] = heap[indexTwo];
		heap[indexTwo] = temp;
	}
	private int getLeftChildIndex(int parentIndex){
		return 2 * parentIndex + 1;
	}
	private int getRightChildIndex(int parentIndex){
		return 2 * parentIndex + 2;
	}
	private int getParentIndex(int childIndex){
		return (childIndex - 1) / 2;
	}
	private boolean hasLeftChild(int index){
		return getLeftChildIndex(index) < size;
	}
	private boolean hasRightChild(int index){
		return getRightChildIndex(index) < size;
	}
	private boolean hasParent(int index){
		return getParentIndex(index) > 0;
	}
	private int leftChild(int index){
		return heap[getLeftChildIndex(index)];
	}
	private int rightChild(int index){
		return heap[getRightChildIndex(index)];
	}
	private int parent(int index){
		return heap[getParentIndex(index)];
	}
}