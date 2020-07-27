class CircularLinkedList {
	Node tail;
	static int size = 0;
	
	protected class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	public void insertFirst(int data){
		Node newNode = new Node(data);
		if(tail == null){
			tail = newNode;
			tail.next = newNode;
		}
		else{
			newNode.next = tail.next;
			tail.next = newNode;
		}
		size++;
	}
	public void insertAtPos(int index, int data){
		if(index == 0){
			insertFirst(data);
		}
		else{
			Node newNode = new Node(data);
			Node current = tail.next;
			int i = 1;
			while(i < index - 1){
				current = current.next;
				i++;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		size++;
	}
	
	public void insert(int data){
			Node newNode = new Node(data);
			if(tail == null){
				tail = newNode;
				tail.next = newNode;
			}
			else{
				newNode.next = tail.next;
				tail.next = newNode;
				tail = newNode;
			}
			size++;
		}
	
	public void insertLast(int data){
		Node newNode = new Node(data);
		if(tail == null){
			tail = newNode;
			tail.next = newNode;
		}
		else{
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	
	public void print(){
		Node current = tail.next;
		do{
			System.out.print(current.data + " ");
			current = current.next;
		}
		while(current != tail.next);
	}
	
	public void deleteFirst(){
		if(tail.next == tail)
			tail = null;
		else
			tail.next = tail.next.next;
		size--;
	}
	
	public void deleteLast(){
		Node current = tail.next;
		Node previous = current;
		while(current.next != tail.next){
			previous = current;
			current = current.next;
		}
		previous.next = tail.next;
		tail = previous;
	}
	public void deleteAt(int index){
		if(index < 0 || index >= size)
			return;
		else if(index == 1)
			deleteFirst();
		else if(index == size - 1)
			deleteLast();
		else{
			Node current = tail.next;
			int i = 1;
			while(i < index - 1){
				current = current.next;
				i++;
			}
			current.next = current.next.next;
		}
		size--;
	}
	public void reverse(){
		Node current = tail.next;
		Node nextNode = tail.next;
		Node previousNode = tail;
		while(current != tail){
			previousNode = current;
			current = nextNode;
			nextNode = nextNode.next;
			current.next = previousNode;
		}
		nextNode.next = tail;
		tail = nextNode;
	}
}
class Demo{
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insert(22);
		list.insert(34);
		list.insert(74);
		list.deleteFirst();
		list.insert(9);
		list.insert(88);
		list.insertFirst(1);
		list.insertAtPos(2, 2);
		list.insertLast(99);
		list.deleteLast();
		list.deleteAt(2);
		list.print();
		
		System.out.println();
		list.reverse();
		list.print();
	}
}