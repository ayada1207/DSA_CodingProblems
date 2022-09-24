package Stack;

import java.util.Stack;

public class NextGreaterElement {

	 public static long[] nextLargerElement(long[] arr, int n)
	    { 
	      long[] res = new long[n];
	        Stack<Integer> st = new Stack<>();
	        res[n-1]=-1;
			st.push((int) arr[n-1]);
			for(int i=n-2;i>=0;i--){
			    while(!st.isEmpty() && arr[i]>=st.peek()){
			        st.pop();
			    }
			    int prev = st.isEmpty()?-1:st.peek();
			    res[i]=prev;
			    st.push((int) arr[i]);
			}
			return res;
	    } 
}
