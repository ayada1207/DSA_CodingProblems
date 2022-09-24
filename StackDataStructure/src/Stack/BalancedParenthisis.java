package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class BalancedParenthisis {

	public static boolean isBalanced(String s) {
		Deque<Character> st = new ArrayDeque();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='[' || c=='{' || c=='(') {
				st.push(c);
				
			}else {
				if(st.isEmpty())return false;
				 else if(matching(st.peek(),c)==false)
		                return false;
				 else {
					 st.pop();
				 }
			}
			
		}
		return st.isEmpty();
	}
	 public static boolean matching(char a,char b){
	        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
	    }
	 
	
}
