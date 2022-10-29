package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxInSubarrays {

	// Naive Approach O(n2)
	public static void findMaxInSubArrays(int[] arr,int k) {
		for(int i=0;i<=arr.length-k;i++) {
			int[] res = new int[k];int m=0;
			for(int j=i;j<i+k;j++) {
			res[m]=arr[j];m++;
			}
			findMax(res);
		}
	}
	static void findMax(int[] arr) {
		int max = arr[0];int res=arr[0];
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max,arr[i]);
			res=Math.max(max, res);
		}
		System.out.println(res);
	}
	
	// Efficient Approach O(n)
	
	static void printMax(int[] arr,int k) {
		Deque<Integer> dq = new LinkedList<>();
		for(int i=0;i<k;i++) {
		while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) {
			dq.pollLast();
		}
		dq.addLast(i);
		}
		for(int i=k;i<arr.length;i++) {
			System.out.println(arr[dq.peek()]);
			while(!dq.isEmpty() && dq.peek() <=i-k) {
				dq.removeFirst();
			}
			while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		System.out.println(arr[dq.peek()]);
	} 
}
