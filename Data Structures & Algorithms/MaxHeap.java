import java.util.*;
import java.util.Arrays;

class MaxHeap{
	private int capacity = 5;
	private int[]heap;
	private int size;
	
	public MaxHeap(){
		heap = new int[capacity];
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public int peek(){
		if(isEmpty())
			throw new NoSuchElementException("Heap is empty !");
		return heap[0];
	}
	public void add(int element){
		ensureCapacity();
		
		heap[size++] = element;
		
		siftUp();
	}
	private void siftUp(){
		int index = size - 1;
		
		while(hasParent(index) && heap[index] > heap[getParentIndex(index)]){
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	public int remove(){
		int maxElement = heap[0];
		
		heap[0] = heap[size - 1];
		
		size--;
		
		heapify();
		
		return maxElement;
	}
	private void heapify(){
		int index = 0;
		
		int bigIndex = getLeftChildIndex(index);
		while(hasLeftChild(index)){
			
			if(hasRightChild(index) && heap[bigIndex] < heap[getRightChildIndex(index)]){
				bigIndex = getRightChildIndex(index);
			}
			if(heap[index] > heap[bigIndex]){
				break;
			}
			else{
				swap(index, bigIndex);
			}
			index = bigIndex;
		}
	}
		
	private void ensureCapacity(){
		if(size >= capacity){
			heap = Arrays.copyOf(heap, capacity *= 2);
		}
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
		return index != 0 && getParentIndex(index) > 0;
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
	public int size(){
		return size;
	}
	@Override
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i < size; i++){
			result.append(heap[i] + " ");
		}
		return result.toString() + "]";
	}
}
