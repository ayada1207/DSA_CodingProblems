package BinarySearchTree;

public class KthSmallestInBST {

	//Naive Approach: follow in-order traversal
	static int count =0;
	public static void findKthSmallest(Node root,int k) {
		
		if(root != null) {
			findKthSmallest(root.left,k);
			count++;
			if(count == k) {
				System.out.println(root.key);
				return;
			}
			findKthSmallest(root.right,k);
		}
	}
	
	//Efficient Approach, 
	//Lcount: count number of Nodes, in the left subtree
	//compare Lcount+1 with k
	// if same return root,
	// if greater the recursive call for left subtree,else recursive call for right subtree
	// but with k as ---> k-lcount-1
	public static Node KthSmallestNode(Node root,int k) {
		
	}
}
