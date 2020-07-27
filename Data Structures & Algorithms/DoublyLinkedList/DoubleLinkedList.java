import java.util.*;

class DoublyLinkedList<E> implements Iterable<E> {
	Node<E>head, tail;
	static int size = 0;
	
	protected class Node<E> {
		E data;
		Node<E>next;
		Node<E>prev;
		
		public Node(){
		}
		public Node(E data){
			this.data = data;
		}
	}
	public DoublyLinkedList(){
	}
	
	public DoublyLinkedList(E[]objects){
		for(int i = 0; i < objects.length; i++){
			addLast(objects[i]);
		}
	}
	
	public E getFirst(){
		if(head == null)
			return null;
		else
			return head.data;
	}
	
	public E getLast(){
		if(size == 0)
			return null;
		else
			return tail.data;
	}
	public void clear(){
		head = tail = null;
		size = 0;
	}
	public E get(int index){
		if(index < 0 || index >= size)
			return null;
		
		if(index == 0)
			return getFirst();
		else if(index == size - 1)
			return getLast();
		else{
			
			Node<E>current = head.next;
			for(int i = 1; i < index; i++){
				current = current.next;
			}
			return current.data;
		}
	}
	
	public int indexOf(E e){
		if(head.data == e)
			return 1;
		if(tail.data == e)
			return size - 1;
		else{
			Node<E>current = head;
			for(int i = 0; i < size - 1; i++){
				if(current.data == e)
					return i;
				current = current.next;
			}
		}
		return -1;
	}
	
	public int lastIndexof(E e){
		if(tail.data == e)
			return size - 1;
		else {
			int i = 0;
			Node<E>current = tail;
			while(i < size - 2){ 
				if(current.data == e)
					return i;
				current = current.prev;
				i++;
			}
		}
		return -1;
	}
	public E set(int index, E e){
		if(index < 0 || index >= size)
			return null;
			
		if(index == 0)
			head.data = e;
		else if(index == size - 1)
			tail.data = e;
		else{
			Node<E>current = head.next;
			for(int i = 1; i < index; i++)
				current = current.next;
			E oldValue = current.data;
			current.data = e;
			return oldValue;
		}
		return null;
	}
	
	public void addFirst(E data){
		Node<E> newNode = new Node<>(data);
		if(head == null){
			head = newNode;
		}
		else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			
			if(tail == null)
				tail = newNode;
		}	
		size++;
	}
	
	public void addLast(E data){
		Node<E> newNode = new Node<>(data);
		if(tail == null){
			tail = head = newNode;
		}
		else{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}
	public void add(int index, E data){
		if(index < 0 || index > size){
			return;
		}
		else if(index == 0){
			addFirst(data);
		}
		else if(index == size - 1){
			addLast(data);  
		}
		else{
			Node<E> newNode = new Node<>(data);
			Node<E> current = head;
			for(int i = 0; i < index - 1; i++){
				current = current.next;
			}
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
			
		}
		size++;
	}
	
	public E removeFirst(){
		E e = head.data;
		head = head.next;
		head.prev = null;
		if(head == null) tail = null;
		size--;
		return e;
	}
	
	public E removeLast(){
		E e = tail.data;
		tail.prev.next = null;
		tail = tail.prev;  
		return e;
	}
	public boolean contains(E e){
		if(head == e)
			return true;
		if (tail == e)
			return true;
		else {
			Node<E>current = head;
			while(current != null){
				if(current.data == e)
					return true;
				current = current.next;
			}
		}
		return false;
	}
	
	public E remove(int index){
		if (index < 0 || index >= size) {
			return null;
		}
		else if (index == 0) {
			return removeFirst();
		}
		else if (index == size - 1) {
			return removeLast();
		}
		else{
			if(index < size / 2){
				Node<E> current = head;
				for(int i = 0; i < index; i++){
					current = current.next;
				}
				E e = current.data;
				current.prev.next = current.next;
				current.next.prev = current.prev;
				return e;
			}
			else if(index >= size/2){
				Node<E>rcurrent = tail;
				for(int i = 0; i < index; i++){
					rcurrent = rcurrent.prev;
				}
				E o = rcurrent.data;
				rcurrent.prev.next = rcurrent.next;
				rcurrent.next.prev = rcurrent.prev;
				return o;
			}
		}
		size--;
		return null;
	}
	
	@Override
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		Node<E>current = head;
		while(current != null){
			result.append(current.data + " ");
			current = current.next;
		}
		return result.append("]").toString();
	}
	public void print(){
		StringBuilder result = new StringBuilder("[");
		Node<E>current = tail;
		while(current != null){
			result.append(current.data + " ");
			current = current.prev;
		}
		System.out.println(result.toString() + "]");
	}
	
	public void reverse(){
		Node temp = null; 
		Node current = head; 
		
			/* swap next and prev for all nodes of  
			 doubly linked list */
		while (current != null) { 
			temp = current.prev; 
			current.prev = current.next; 
			current.next = temp; 
			current = current.prev; 
			if (current != null) { 
			head = current;
			}
		}
	}
	
	public java.util.Iterator<E> iterator(){
		return new DoublyLinkedListIterator();
	}
	private class DoublyLinkedListIterator 
							implements java.util.Iterator<E> {
		Node<E> current = head;
		
		@Override
		public boolean hasNext(){
			return (current != null);
		}
		@Override
		public E next(){
			E e = current.data;
			current = current.next;
			return e;
		}
		@Override
		public void remove(){
			current = current.next;
		}
	}
}
class demo {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		list.addFirst(22);
		list.addFirst(33);
		list.addFirst(88);
		list.addFirst(66);
		
		list.forEach(e -> System.out.print(e + " "));
		list.reverse();
		System.out.println();
		list.forEach(e -> System.out.print(e + " "));

	}
}
