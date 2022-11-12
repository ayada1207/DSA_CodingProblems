package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthTree {

	static int maxWidth(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int res=0;int count =0;
		q.add(null);
		while(q.size()>1) {
		
			Node curr = q.poll();
			if(curr != null)
				count++;
			else {
				q.add(null);
				count=0;
			continue;
			}
			if(curr.left != null)
				q.add(curr.left);
			if(curr.right != null)
				q.add(curr.right);
			res = Math.max(res, count);
		}
		return res; 
	}
}
