package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given two binary trees with head reference as T and S having at most N nodes. 
 * The task is to check if S is present as subtree in T.
A subtree of a tree T1 is a tree T2 consisting of a node in T1 and all of its descendants in T1.
 * @author Arpit
 *
 */
public class CheckIfSubtree {

	public static boolean ifSubtree(Node t,Node s) {
		if(t==null && s==null) return true;
		if(t==null && s!=null) return false;
		if(s== null) return true;
		
		if(t.key == s.key) {
			return ifSubtree(t.left,s.left) && ifSubtree(t.right,s.right);
		}else {
			return ifSubtree(t.left,s) || ifSubtree(t.right,s);
		}
	}
	
	
}
