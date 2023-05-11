package Stack;

import java.util.Stack;

public class MinAtPop {
	 public static void push(int arr[],int n)
	    {
	        Stack<Integer>s = new Stack<Integer>();
	        for(int i=0;i<n;i++){
	            s.push(arr[i]);
	        }
	        while(!s.isEmpty()){
	            s.pop();
	            Stack<Integer> st = (Stack<Integer>) s.clone();
	            _getMinAtPop(st);
	        }
	        
	    }
	    
	    //Function to print minimum value in stack each time while popping.
	    static void _getMinAtPop(Stack<Integer>s)
	    {
	        int min = 100;
	        boolean isEmpty=false;
	        while(!s.isEmpty()){
	        	isEmpty=true;
	            min = min<s.peek() ? min : s.peek();
	            s.pop();
	        }
	        if(isEmpty)
	        System.out.print(min + " ");
	        
	    }
}
