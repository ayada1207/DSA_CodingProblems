package Queue;

import java.util.LinkedList;
import java.util.Queue;

// Given a number (n), print Numbers up to n, using 5 and 6 in increasing order

// i/p: n=4
// o/p: 5 6 55 56
public class GenerateNumberUsingDigits {

	
	public static void printNumbers(int n) {
		Queue<String> q1 = new LinkedList<String>();
		q1.add("5");
		q1.add("6");
		
		for(int count =0;count<n;count++) {
			String curr = q1.peek();
			System.out.println(curr);
			q1.poll();
			q1.add(curr+"5");
			q1.add(curr+"6");
		}
		
	}
}
