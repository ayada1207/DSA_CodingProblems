package BinarySearchTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PairWithSumInBST {

	// naive approach: in-order traversal of BST will give, 
	//sorted array then use two pointer approach, tree should be BST only
	public static boolean pairSum(Node root,int sum) {
		List<Integer> list = new ArrayList<>();
		list = inorder(root,list);
		
		int l=0;int h =list.size()-1;
		
		while(l<h) {
			if(list.get(l)+list.get(h)==sum) {
				return true;
			}
			else if(list.get(l)+list.get(h) > sum) {
				h--;
			}
			else {
				l++;
			}
		}
		return false;
	}
	
	static List<Integer> inorder(Node root,List<Integer> list){
		if(root != null) {
			inorder(root.left,list);
			list.add(root.key);
			inorder(root.right,list);
		}
		return list;
	}
	
	// Efficient Approach using hashing, for normal tree also it will work
	public static boolean pairSumWithHashing(Node root,int sum,HashSet<Integer> set) {
		if(root == null) return false;
		if(pairSumWithHashing(root.left,sum,set)== true) {
			return true;
		}
		if(set.contains(sum-root.key)) {
			return true;
		}else {
			set.add(root.key);
		}
		return pairSumWithHashing(root.right,sum,set);
	}
}
