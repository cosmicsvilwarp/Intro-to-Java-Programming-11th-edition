import java.util.*;
class DoublyCircularLinkedList<E> {
	Node<E> head, tail;
	static int size = 0;
	
	protected class Node<E> {
		E data;
		Node<E> next;
		Node<E>prev;
		
		public Node(E data){
			this.data = data;
		}
	}
	
	public void insertFirst(E data){
		Node<E> newNode = new Node<>(data);
		if(head == null){
			head = tail = newNode;
			head.next = head;
			head.prev = head ;
		}
		else{
			newNode.next = head;
			head.prev = newNode;
			newNode.prev = tail;
			tail.next = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void insertLast(E data){
		Node<E> newNode = new Node<>(data);
		if(head == null){
			head = tail = newNode;
			tail.next = newNode;
			tail.prev = newNode;
		}
		else{
			tail.next = newNode;
			newNode.prev = tail;
			newNode.next = head;
			tail = newNode;
			head.prev = newNode;
		}
		size++;
	}
	public void insertAtPos(int index, E data){
		if(index < 0 || index >= size)
			return;
		else if(index == 1)
			insertFirst(data);
		else if(index == size - 1)
			insertLast(data);
		else{
			Node<E> newNode = new Node<>(data);
			Node<E>current = head;
			int i = 1;
			while(i < index - 1){
				current = current.next;
				i++;
			}
			newNode.next = current.next;
			current.next.prev = newNode;
			newNode.prev = current;
			current.next = newNode;
		}
		size++;
	}
	public E removeFirst(){
		E e;
		if(head == null){
			return null;
		}
		else if(head.next == head){
			e = head.data; 
			head = tail = null;
			return e;
		}
		else{
			e = head.data;
			head = head.next;
			head.prev = tail;
			tail.next = head;
			size--;
			return e;
		} 
	}
	
	public E removeLast(){
		E e;
		if(tail == null){
			return null;
		}
		else if(head.next == head){
			e = head.data; 
			head = tail = null;
			return e;
		}
		else{
			e = tail.data;
			tail = tail.prev;
			tail.next = head;
			head.prev = tail;
			size--;
			return e;
		}
	}
	
	public E removeAt(int index){
		if(index < 0 || index >= size) return null;
		if(index == 1){
			return removeFirst();
		}
		else if(index == size - 1){
			return removeLast();
		}
		else{
			Node<E>current = head;
			int i = 0;
			while(i < index){
				current = current.next;
				i++;
			}
			E e = current.data;
			current.prev.next = current.next;
			current.next.prev = current.prev;
			tail = current.next == head ? current.prev : tail; //Last node if next pointer of selected node is head
			size--;
			return e;
		}
	}
	public void reverse(){
		Node<E>currentNode = head;
		Node<E>nextNode = head;
		while(currentNode != tail){
			currentNode.prev = nextNode;
			currentNode = nextNode;
			nextNode = nextNode.next;
			currentNode.next = currentNode.prev;
		}
		currentNode = tail;
		tail = head;
		head = currentNode;
	}
	
	@Override
		public String toString(){
		StringBuilder result = new StringBuilder("[");
		Node<E> current = head;
		while(current != tail){
			result.append(current.data);
			result.append(", ");
			current = current.next;
		}
		return result.append(current.data).toString() + "]";
	}
}
class Test{
	public static void main(String[] args) {
		DoublyCircularLinkedList<Integer> list = new DoublyCircularLinkedList<>();
		list.insertFirst(22);
		list.insertFirst(33);
		list.insertFirst(10);
		list.insertFirst(56);
		list.insertLast(230);
		list.insertFirst(2);
		list.insertAtPos(4, 44);
		list.removeFirst();
		list.removeLast();
		list.removeAt(3);
		System.out.println(list);
		System.out.println();
		list.reverse();
		System.out.println(list);
	}
}