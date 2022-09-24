package Stack;

import java.util.Stack;

public class SpanOfArray {
	
	public static void span(int[] arr,int n) {
		for(int i=0;i<n;i++) {
				int span =1;
		for(int j=i-1;j>=0&&arr[i]>arr[j];j--) {
			 span++;;
		}
		System.out.println(span + " ");
		}
	}
	
	// Efficient Approach
	
	public static void spanProblem(int[] arr,int n) {
		Stack<Integer> st = new Stack<>();
		st.push(0);
		System.out.println(1+ " ");
		
		for(int i=1;i<n;i++) {
			
			while(!st.isEmpty() && arr[st.peek()]<=arr[i]) {
				st.pop();
			}
			int span = st.isEmpty() ? i+1 :i-st.peek();
			System.out.println(span + " ");
			st.push(i);
		}
	}

}
