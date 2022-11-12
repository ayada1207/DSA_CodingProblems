package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorTree {

	public static Node mirrorTree(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node curr = q.poll();
			Node temp = curr.left;
			curr.left = curr.right;
			curr.right = temp;
			
			if(curr.left != null)
				q.add(curr.left);
			if(curr.right != null)
				q.add(curr.right);
		}
		return root;
		
	}
}
