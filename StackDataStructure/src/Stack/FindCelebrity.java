package Stack;

import java.util.Stack;

/*
 * A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Note: Follow 0 based indexing.
Follow Up: Can you optimize it to O(N)

Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity. 

 */

public class FindCelebrity {

	static int celebrity(int[][] M,int n) {
		
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<n;i++) {
			s.push(i); 
		}
		while(s.size()>1) {
			int a=s.pop();
			int b=s.pop();
			if(knows(M,a,b)) {
				s.push(b);
			}else {
				s.push(a);
			}
		}
		if(s.isEmpty()) return -1;
		
			int c=s.pop();
			for(int i=0;i<n;i++) {
				if (i != c && (knows(M,c, i) || !knows(M,i, c)))
	                return -1;
			}
		return c;
	}
	
	static boolean knows(int[][]M, int a,int b) {
		return M[a][b]==1 ? true :false;
	}
}
