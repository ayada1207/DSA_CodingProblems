package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfTree {

	 static int maxLevel =0;
	 // Recursive Method
	static void printLeftView(Node root,int level) {
		
		if(root == null) return;
		if(maxLevel<level) {
			System.out.print(root.key + " ");
			maxLevel = level;
		}
		printLeftView(root.left, level+1);
		printLeftView(root.right, level+1);
	}
	
	// Iterative method
	
	static void printLeftIterativeMethod(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int count = q.size();
			
			for(int i=0;i<count;i++) {
				Node curr = q.poll();
				if(i==0)
					System.out.print(curr.key+ " ");
				if(curr.left != null)
					q.add(curr.left);
				if(curr.right != null)
					q.add(curr.right);
			}
		}
	}
}
