package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodeInRange {

	static int count=0;
	public static int getCount(Node root,int l,int h) {
		
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		int c=0;
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if((curr.key <= h && curr.key>=l)) {c++;}
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
			
		}
		return c;
		}
}
