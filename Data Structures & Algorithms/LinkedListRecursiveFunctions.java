class LinkedList{
	public Node head;
	
	public class Node {
		int data;
		Node next;
		
		Node(){}
		
		Node(int data){this.data = data;}
		
		Node(int data, Node next) { 
				this.data = data; 
				this.next = next;
		}
	}
	public Node mergeTwoLists(Node l1, Node l2){
		Node dummyHead = new Node(0);
		Node current = dummyHead;
		Node p1 = l1; Node p2 = l2;
		while(p1 != null && p2 != null){
			if(p1.data <= p2.data){
				current.next = p1;
				p1 = p1.next;
			}
			else{
				current.next = p2;
				p2 = p2.next;
			}
			current = current.next;
		}
		current.next = p1 != null ? p1 : p2;
		return dummyHead.next;
	}
	
	public void insert(int data){
		if(head == null){
			head = new Node(data);
		}
		else{
			head = new Node(data, head.next);
		}
	}
	
	public void print(Node node){
		Node current = node;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public Node recursiveReverse(Node head){
		if(head == null || head.next == null){
			this.head = head;
			return head;
		}
		else{
			Node t = recursiveReverse(head.next);
			head.next.next = head;
			head.next = null;
			return t;
		}
	}
	public int recursiveCount(Node node){
			int x = 0;
			if(node != null){
				x = recursiveCount(node.next);
				return x + 1;
			}
			return x;
		}
		
	public int sum(Node node){
		if(node == null)
			return 0;
		else
			return sum(node.next) + node.data;
	}
		
	public int max(Node node){
		int max = Integer.MIN_VALUE;
		while(node != null){
			if(node.data > max)
				max = node.data;
			node = node.next;
		}
		return max;
	}
	
	public int recursiveMax(Node node){
		if(node == null)
			return Integer.MIN_VALUE;
		int x = recursiveMax(node.next);
		return x > node.data ? x : node.data;
	}
		
	public Node search(Node node, int key) {
		Node q = null;
		while(node != null){
			if(key == node.data){
				q.next = node.next;
				node.next = head;
				head = node;
			}
			q = node;
			node = node.next;
		}
		return node;
	}
	
	public Node recursiveSearch(Node node, int key) {
		if(node == null)
			return null;
		else if(key == node.data)
			return node;
		return recursiveSearch(node.next, key);
	}
}
class demo{
	public static void main(String[] args) {
			LinkedList list = new LinkedList();
			list.insert(3);
			list.insert(22);
			list.insert(77);
			list.insert(55);
			list.print(list.head);
	}
}