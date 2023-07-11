package BinarySearchTree;

import java.util.HashSet;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,8,30,15,25,12};
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(50);
		
		root.left.left = new Node(1);
	//	root.left.right = new Node(9);
		//root.left.left.left = new Node(8);
		//root.left.left.right = new Node(9);
		
		root.right.left = new Node(40);
		root.right.right = new Node(100);
		//root.right.left.left = new Node(60);
		//root.right.left.right = new Node(80);
		//CeilingOnLeftInArray.printCeiling(arr, 6);
		HashSet<Integer> set = new HashSet<>();
		System.out.println(CountNodeInRange.getCount(root,5,45));
	}

}
