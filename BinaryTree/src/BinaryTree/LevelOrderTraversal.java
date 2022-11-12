package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void levelOrderTraversal(Node root) {
		Queue<Node> qu = new LinkedList<Node>();
		if(root == null) return;
		qu.add(root);
		while(!qu.isEmpty()) {
			Node curr = qu.poll();
			System.out.print(curr.key +" ");
			if(curr.left != null)
				qu.add(curr.left);
			if(curr.right != null)
				qu.add(curr.right);
		}
	}
	
	// Level Order traversal Line By Line
	
	// Idea here is to add create a queue and add null after each level of tree
	// if q.poll() is null means that is last node of tree
	static void LineByLineTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		while(q.size()>1) {
			Node curr = q.poll();
			if(curr == null) {
			   q.add(null);
			 System.out.println( " ");
				continue;
			}
			System.out.print(curr.key + " ");
			
			if(curr.left != null)
				q.add(curr.left);
			if(curr.right != null)
				q.add(curr.right);
		}
	}
}