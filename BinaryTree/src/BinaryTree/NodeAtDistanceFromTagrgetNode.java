package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Given a Binary Tree and a positive integer k. The task is to count all distinct
 *  nodes that are distance k from a leaf node. A node is at k distance from a leaf
 *if it is present k levels above the leaf and also, is a direct ancestor of this leaf node.
 *  If k is more than the height of Binary Tree, then nothing should be counted.
 *
 *
 *Input:
        1
      /   \
     2     3
   /  \   /  \
  4   5  6    7
          \ 
          8
K = 2
Output: 2
Explanation: There are only two unique nodes that are at a distance of 2 units
from the leaf node. (node 3 for leaf with value 8 and node 1 for leaves with values 4, 5 and 7)
Note that node 2 isn't considered for leaf with value 8 because it isn't a direct ancestor
of node 8.

 */
public class NodeAtDistanceFromTagrgetNode {

	public static int countNodeAtDistanceK(Node root,int k,Node target) {
		
		Map<Node,Node> parent = new HashMap<>();
		Map<Node,Boolean> visited = new HashMap<Node, Boolean>();
		
		Queue<Node> q = new LinkedList<Node>();
		markParents(root,parent);
		q.add(target);
		visited.put(target, true);
		int curr_level=0;
		while(!q.isEmpty()) {
			int size = q.size();
			if(curr_level== k) break;
			curr_level++;
			
			for(int i=0;i<size;i++) {
				Node curr = q.poll();
				
				if(curr.left != null && visited.get(curr) == null)
				{
					q.add(curr.left);
					visited.put(curr.left,true);
				}
				if(curr.right != null && visited.get(curr) == null)
				{
					q.add(curr.right);
					visited.put(curr.right,true);
				}
				if(parent.get(curr) != null && visited.get(parent.get(curr)) == null) {
					q.add(parent.get(curr));
					visited.put(parent.get(curr), true);
				}
			}
		}
		return q.size();
	}
	
	static void markParents(Node root,Map<Node,Node> map) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node curr = q.poll();
			if(curr.left != null)
			{
				q.add(curr.left);
				map.put(curr.left,curr);
			}
			if(curr.right != null)
			{
				q.add(curr.right);
				map.put(curr.right,curr);
			}
		}
		
	}
	
}
