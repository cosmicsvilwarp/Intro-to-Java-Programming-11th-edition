class Queue {
	final static int CAPACITY = 5; 
	int[]arr = new int[CAPACITY];
	static int size = 0;
	static int front = -1;
	static int rear = -1;
	
	public void enqueue(int data){
		
		if(isFull()){
			System.out.println("Queue is full !");
			return;
		}
		else if(isEmpty()){
			front = rear = 0;
			arr[front] = data;
			size = 1;
		}
		else{
			arr[++rear] = data;
			size++;
		}
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return 0;
		}
		else if(front == rear){
			int e = arr[front];
			clear();
			return e;
		}
		else{
			size--;
			return arr[front++];
		}
	}
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return 0;
		}
		else{
			return arr[front];
		}
	}
	
	public boolean isFull(){
		return rear >= CAPACITY - 1;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void clear(){
		int[]temp = new int[CAPACITY];
		arr = temp;
		size = 0;
		front = 0;
		rear = 0;
	}
	@Override
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for(int i = front; i <= rear; i++){
			result.append(arr[i] + " ");
		}
		return result.toString() + "]";
	}
}
class Test{
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(3);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(22);
	
	

		System.out.println(q);
		
	}
}