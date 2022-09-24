package Stack;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class InfixToPostFix {

	public static String posfix(String s) {
		Deque<Character> st = new ArrayDeque<Character>();
		StringBuilder res = new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='(') st.push(c);
			else if(Character.isLetterOrDigit(c)) {
				res.append(c);
			}else if(c==')'){
				while(!st.isEmpty() && !(st.peek()=='(')) {
				res.append(st.peek());
				st.pop();
			}
				st.pop();
			}else {
				while(!st.isEmpty() && Prec(c)<=Prec(st.peek())) {
				res.append(st.peek());
				st.pop();
			}
				st.push(c);
			}
		}while(!st.isEmpty()) {
		res.append(st.peek());
		st.pop();
		}
		return res.toString();
	}
	
	static int Prec(char c) {
		switch (c) {
		case '-':
		case '+':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	public static void plusMinus(List<Integer> arr) {
        
		 long min = arr.stream().reduce(0, (a,b)->a+b)-
				   Collections.max(arr);
		   //int min = arr.stream().reduce(arr.get(0), (a,b)->a<b ?a :b);
		    long max =  arr.stream().reduce(0, (a,b)->a+b)-Collections.min(arr);
		    System.out.print(min + " " + max);
        int cP = arr.stream().filter(n->n>0).
        		collect(Collectors.toList()).size();
        int cN = arr.stream().filter(n->n<0).
        		collect(Collectors.toList()).size();
        int cZ = arr.stream().filter(n->n==0).
        		collect(Collectors.toList()).size();
        System.out.println((float)cP/arr.size());
        System.out.println((float)cZ/arr.size());
        System.out.println((float)cN/arr.size());
    }
}
