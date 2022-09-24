package Stack;

import java.util.Stack;

public class PreviousGreaterElement {
	
	// I/p: [ 12,15,32,5,11,7,81]
	// Op:    -1,-1,-1,32,32,32,-1
	public static void prevGreater(int[] arr,int n) {
		Stack<Integer> s = new Stack<>();
		s.push(arr[0]);
		System.out.println(-1 + " ");
		for(int i=1;i<n;i++) {
			while(!s.isEmpty() && s.peek() <=arr[i]) {
				s.pop();
			}
			
			int prev = s.isEmpty() ? -1 : s.peek();
			System.out.println(prev);
			if(s.isEmpty())s.push(arr[i]);
			//s.push(arr[i]);
		}
		
	}

}
