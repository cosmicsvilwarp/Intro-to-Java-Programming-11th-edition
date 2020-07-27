class Queue{
	Node front, rear;
	static int size;
	
	protected class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public void enqueue(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			front = rear = newNode;
		}
		else{
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}
	
	public int dequeue(){
		size--;
		if(isEmpty()){
			System.out.println("Queue is empty");
			size = 0;
			rear = null;
			return 0;
		}
		else{
			int e = front.data;
			front = front.next;
			return e;
		}
	}
	
	public int peek(){
		return front.data;
	}
	
	public boolean isEmpty(){
		return size == 0 && front == null;
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public String toString(){
		if(isEmpty())
			return "Queue is empty";
		
		StringBuilder result = new StringBuilder("[");
		Node current = front;
		while(current != null){
			result.append(current.data + " ");
			current = current.next;
		}
		return result.toString() + "]";
	}
}

class Test{
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(33);
		q.enqueue(13);
		q.enqueue(77);
		q.enqueue(20);
		System.out.println(q);
		q.dequeue();
		q.dequeue();

		
		System.out.println(q);
		
	}
}