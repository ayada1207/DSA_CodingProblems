package BinaryTree;

public class CountOfTree {

	// O(n) time 
	static int count(Node root) {
		if(root == null) return 0;
		else {
			return count(root.left)+ count(root.right)+1;
			
		}
	}
	
	//O(logn * log n)
	static int countNode(Node root) {
		int lh=0;int rh=0;
		Node curr = root;
		while(curr != null) {
			lh++;
			curr = curr.left;
		}
		curr = root;
		while(curr != null) {
			rh++;
			curr = curr.right;
		}
		if(lh==rh) return (int) (Math.pow(2, rh)-1);
		return 1+countNode(root.left)+countNode(root.right);
	}
}
