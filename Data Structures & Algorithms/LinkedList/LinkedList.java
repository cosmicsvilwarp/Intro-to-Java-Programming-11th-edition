class LinkedList<E> {
	Node<E> head, tail;
	protected static int size = 0;
	
	protected class Node<E> {
		E data;
		Node<E>next;
		
		public Node(E data){
			this.data = data;
		}
	}
	
	public void addFirst(E e){
		Node<E> newNode = new Node<>(e);
		newNode.next = head;
		head = newNode;
		
		if(tail == null)
			tail = head;
			
		size++;
	}
	
	public void addLast(E e){
		Node<E>newNode = new Node<>(e);
		if(tail == null){
			head = tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	/** Add a new element at the specified index 
	* in this list. The index of the head element is 0 */
	public void add(int index, E e) {
		if (index == 0) {
			addFirst(e);
		}
		else if (index >= size) {
			addLast(e);
		}
		else {
			Node<E>newNode = new Node<>(e);
			Node<E> current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			size++;
		}
	}
	public E removeFirst(){
		if(size == 0) return null;
		E e = head.data;
		head = head.next;
		if(head == null) tail = null;
		size--;
		return e;
	}
	public E removeLast(){
		if(size <= 1){
			return removeFirst();
		}
		else{
			Node<E> current = head;
			for(int i = 0; i < size - 2; i++){
				current = current.next;
			}
			E e = tail.data;
			tail = current;
			tail.next = null;
			size--;
			return e;
		}
	}
	public E remove(int index) {   
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
			Node<E> current = head;
			for(int i = 0; i < index - 1; i++){
				current = current.next;
			}
			E e = current.next.data;
			current.next = current.next.next;
			size--;
			return e;
		}
	}
	
	@Override
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		Node<E> current = head;
		while(current.next != null){
			result.append(current.data);
			result.append(", ");
			current = current.next;
		}
		return result.append(current.data).toString() + "]";
	}
	public void removeDuplicates(){
			Node current = head.next;
			Node prev = head;
			while(current != null){
				if(current.data != prev.data){
					prev = current;
					current = current.next;
				}
				else{
					prev.next = current.next;
					current = prev.next;
				}
			}
		}
	
	public void reverse(){
		Node<E> current = head;
		Node<E> prev = null;
		while(current != null){
			Node<E> nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		head = prev;
	}
}
class Test {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(24);
		list.addFirst(12);
		list.addFirst(33);
		list.addLast(78);
		list.addLast(99);
		System.out.println(list);
		
		System.out.println();
		list.reverse();
		System.out.println(list);	

	}
}