package Queue;

import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q1;
	Queue<Integer> q2;
	
	int top() {
		return q1.peek();
	}
	int pop() {
		int top = q1.peek();
		q1.remove();
		return top;
	}
	
	void push(int x) {
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		q1.add(x);
		while(!q2.isEmpty()) {
			q1.add(q2.peek());
			q2.remove();
		}
	}
	
	int size() {
		return q1.size();
	}
}
