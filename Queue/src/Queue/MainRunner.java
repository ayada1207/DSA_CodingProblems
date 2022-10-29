package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ImplementingQueueUsingArray queue = new ImplementingQueueUsingArray(1000); 
			Queue<Integer> queue = new LinkedList<>(); 
		queue.add(10); 
		queue.add(20); 
		queue.add(30); 
		queue.add(40); 
		int[] arr= {20,5,3,8,6,15};
		//System.out.println(queue.peek());
		MaxInSubarrays.findMaxInSubArrays(arr,4);
	}

}
