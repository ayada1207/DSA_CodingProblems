package Stack;

import java.util.ArrayList;
import java.util.Stack;

//Input: Stack = {1, 2, 3, 4, 5}
//Output: ModifiedStack = {1, 2, 4, 5}
//Explanation:
//As the number of elements is 5 ,hence the middle element will be the 3rd element which is deleted

public class DeleteMidOfStack {

	 public static void deleteMid(Stack<Integer> s,int n){
		 int mid=-1;
	       if(n%2==0) {
	    	   mid=n/2;
	       }else {
	    	   mid=n/2+1;
	       }
	       int N =s.size();
	       for(int i=0;i<N;i++) {
	           if(n%2 != 0){
	    	    if(i !=mid-1) {
	    	     System.out.print(s.peek() + " ");
	    	     s.pop();
	    	    }else{
	    	        s.pop();
	    	    }
	           }else{
	               if(i !=mid) {
	    	     System.out.print(s.peek()  + " ");
	    	      s.pop();
	    	    }
	    	    else{
	    	        s.pop();
	    	    }
	           }
	       }
	       
	    } 
	
}
