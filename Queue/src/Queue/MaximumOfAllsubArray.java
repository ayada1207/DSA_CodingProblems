package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*
 * Given an array arr[] of size N and an integer K. Find the 
 * maximum for each and every contiguous subarray of size K.
 * 
 */
public class MaximumOfAllsubArray {

	
	public static ArrayList <Integer> findMaxOfAllSubArray(int[] arr,int k,int n) {
		
		ArrayList <Integer> al = new ArrayList <Integer>();
		Deque<Integer> dq = new LinkedList<Integer>();
		
		
		// creating a deque of size k and storing the max element
		for(int i=0;i<k;i++) {
			while( !dq.isEmpty() && arr[i]>=arr[dq.peek()]) {
				dq.removeLast();
				dq.addLast(i);
			}
			dq.addLast(i);
		}
		
		for(int i=k;i<n;i++) {
			
			al.add(arr[dq.peek()]);
			// remove element that is out of window size
			while( !dq.isEmpty() && dq.peek()<=i-k) {
				dq.removeFirst();
			}
			
			while( !dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		al.add(arr[dq.peek()]);
		return al;
	}
}
