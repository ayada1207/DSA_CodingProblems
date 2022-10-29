package Queue;

 class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
	}
}

public class QueueUsingLinkedList {
	int size;
	Node front;
	Node rear;
	
	QueueUsingLinkedList(){
		front = null;
		rear= null;
		size=0;
	}
	
	void enque(int x) {
		Node temp = new Node(x);
		if(front == null) {
			front = rear= temp;
			return;
		}
		rear.next = temp;
		rear= temp;
		size++;
	}
	
	void deque() {
		if(front == null) {
			return;
		}
		front = front.next;
		if(front == null) {
			rear= null;
		}
		size--;
	}
}
