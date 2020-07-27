/*Sebas*/
/*(Implement MyLinkedList) The implementations of the methods contains(E e), get(int index), indexOf(E e), lastIndexOf(E e), and set(int index, E e)areomittedintheMyLinkedListclass.Implementthesemethods.*/

class MyLinkedList<E> implements MyList<E> {
	protected Node<E> head, tail;
	protected int size = 0; // Number of elements in the list
	
	protected static class Node<E> {
		E element;
		Node<E> next;

		public Node(E element) {
			this.element = element;
		}
	}
	/** Create an empty list */
	public MyLinkedList() {
	}

	/** Create a list from an array of objects */
	public MyLinkedList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]); 
	}

	/** Return the head element in the list */
	public E getFirst() {
		if (size == 0) {
			return null;
		}
		else {
			return head.element;
		}
	}

	/** Return the last element in the list */
	public E getLast() {
		if (size == 0) {
			return null;
		}
		else {
			return tail.element;
		}
	}

	/** Add an element to the beginning of the list */
	public void addFirst(E e) {
		Node<E> newNode = new Node<>(e); // Create a new node
		newNode.next = head; // link the new node with the head
		head = newNode; // head points to the new node
		size++; // Increase list size

		if (tail == null) // the new node is the only node in list
			tail = head;
	}

	/** Add an element to the end of the list */
	public void addLast(E e) {
		Node<E> newNode = new Node<>(e); // Create a new for element e

		if (tail == null) {
			head = tail = newNode; // The new node is the only node in list
		}
		else {
			tail.next = newNode; // Link the new with the last node
			tail = newNode; // tail now points to the last node
		}

		size++; // Increase size
	}

	@Override /** Add a new element at the specified index 
	 * in this list. The index of the head element is 0 */
	public void add(int index, E e) {
		if (index == 0) {
			addFirst(e);
		}
		else if (index >= size) {
			addLast(e);
		}
		else {
			Node<E> current = head;
			for (int i = 1; i < index; i++) {
				current = current.next;
			}
			Node<E> temp = current.next;
			current.next = new Node<>(e);
			(current.next).next = temp;
			size++;
		}
	}

	/** Remove the head node and
	 *  return the object that is contained in the removed node. */
	public E removeFirst() {
		if (size == 0) {
			return null;
		}
		else {
			E temp = head.element;
			head = head.next;
			size--;
			if (head == null) {
				tail = null;
			}
			return temp;
		}
	}

	/** Remove the last node and
	 * return the object that is contained in the removed node. */
	public E removeLast() {
		if (size == 0) {
			return null;
		}
		else if (size == 1) {
			E temp = head.element;
			head = tail = null;
			size = 0;
			return temp;
		}
		else {
			Node<E> current = head;

			for (int i = 0; i < size - 2; i++) {
				current = current.next;
			}

			E temp = tail.element;
			tail = current;
			tail.next = null;
			size--;
			return temp;
		}
	}

	@Override /** Remove the element at the specified position in this 
	 *  list. Return the element that was removed from the list. */
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
		else {
			Node<E> previous = head;

			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}

			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}

	@Override /** Override toString() to return elements in the list */
	public String toString() {
		StringBuilder result = new StringBuilder("[");

		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			if (current != null) {
				result.append(", "); // Separate two elements with a comma
			}
			else {
				result.append("]"); // Insert the closing ] in the string
			}
		}

		return result.toString();
	}

	@Override /** Clear the list */
	public void clear() {
		size = 0;
		head = tail = null;
	}

	@Override /** Return true if this list contains the element e */
	public boolean contains(Object e) {
		if(head.element == e){
			return true;
		}
		else{
			Node<E>current = head;
			while(current.next != null){
				if(current.element == e){
					return true;
				}
			}
		}
		return false;
	}

	@Override /** Return the element at the specified index */
	public E get(int index) {
		if(index < 0 || index >= size)
			return null;
			
		if(index == 0) return getFirst();

		else if(index == size - 1) return getLast();
		else{
			
			Node<E>current = head.next;
			for(int i = 1; i < index; i++){
				current = current.next;
			}
			return current.element;
		}
	}

	@Override /** Return the index of the first matching element in 
	 *  this list. Return -1 if no match. */
	public int indexOf(Object e) {
		if(head.element == e) return 0;
		else if(tail.element == e) return size - 1;
		else{
			
			int i = 1; //already checked index 0;
			Node<E>current = head;
			while(current.next != null){
				if(get(i) == e)
					return i;
				current = current.next;
				i++;
			}
		}
		return -1;
	}

	@Override /** Return the index of the last matching element in 
	 *  this list. Return -1 if no match. */
	public int lastIndexOf(E e) {
		Node<E> current = head;
		int lastIndex = -1;
		for (int i = 0; i < size; i++) {
			if (current.element.equals(e))
				lastIndex = i;
			current = current.next;
		}
		return lastIndex;
	}

	@Override /** Replace the element at the specified position 
	 *  in this list with the specified element. */
	public E set(int index, E e) {
		if(index < 0 || index >= size)
			return null;
			
		Node<E> current = head;
		for(int i = 0; i < index; i++)
			current = current.next;
			
		E oldValue = current.element;
		current.element = e;
		return oldValue;
	}
		
	@Override /** Override iterator() defined in Iterable */
	public java.util.Iterator<E> iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator 
			implements java.util.Iterator<E> {
		private Node<E> current = head; // Current index 
		
		@Override
		public boolean hasNext() {
			return (current != null);
		}

		@Override
		public E next() {
			E e = current.element;
			current = current.next;
			return e;
		}

		@Override
		public void remove() {
			// Left as an exercise
		}
	}
	
	@Override /** Return the number of elements in this list */
	public int size() {
		return size;
	}
}