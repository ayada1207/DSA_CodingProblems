package Queue;

public class ImplementingQueueUsingArray {
	int[] arr;
	int size;
	int front;int cap;
	ImplementingQueueUsingArray(int c){
		arr = new int[c];
		this.cap =c;
		  size=0;
		  front=0;
		  }
	 boolean isEmpty(ImplementingQueueUsingArray queue) {
		return (queue.size==0);
	}
	 boolean isFull(ImplementingQueueUsingArray queue) {
		return (queue.size==queue.cap);
	}
	 int getRear() {
		if(isEmpty(this)) {
			return -1;
		}else {
			return (this.front+this.size-1)%this.cap;
		}
	}
	
	 int getFront() {
		if(isEmpty(this)) {
			return -1;
		}else {
			return this.front;
		}
	}
	
	void enque(int x) {
		if(isFull(this)) {
			return;
		}
		int rear = getRear();
		rear= (rear+1)%this.cap;
		this.arr[rear]=x;
		this.size++;
	}
	
	void deque() {
		if(isEmpty(this)) {
			return;
		}
		this.front = (this.front+1)% this.cap;
		this.size--;
	}
	
}
