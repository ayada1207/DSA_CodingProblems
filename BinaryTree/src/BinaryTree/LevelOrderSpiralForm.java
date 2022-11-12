package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderSpiralForm {

	// Method 1
	public static void printSprialTree(Node root) {
		Queue<Node> q = new LinkedList<>();
		Stack<Integer> s= new Stack<>();
		boolean flag = false;
		q.add(root);
		while(!q.isEmpty()) {
			int n = q.size();
			for(int i=0;i<n;i++) {
				Node curr = q.poll();
				if(flag) 
					s.add(curr.key);
				else {
					System.out.print(curr.key +" ");	
				}
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
				}
		if(flag) {
			while(!s.isEmpty()) {
				System.out.print(s.pop()+ " ");
			}
			
			System.out.println(" ");
		}
		flag = !flag;
		}
	}
	
	// Method 2: maintain 2 stack such that
	
	public static void printSprialNodes(Node root) {
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.add(root);
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node curr = s1.pop();
				System.out.print(curr.key + " ");
				if(curr.left != null)
					s2.add(curr.left);
				if(curr.right != null)
					s2.add(curr.right);
			}
			System.out.println( " ");
			while(!s2.isEmpty()) {
				Node curr = s2.pop();
				System.out.print(curr.key + " ");
				if(curr.right != null)
					s1.add(curr.right);
				if(curr.left != null)
					s1.add(curr.left);
			}
			System.out.println( " ");
		}
	}
}
