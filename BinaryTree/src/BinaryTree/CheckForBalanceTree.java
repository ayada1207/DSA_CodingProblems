package BinaryTree;

public class CheckForBalanceTree {
	
	// O(n2)
	public static boolean isBalanced(Node root) {
		
		if(root == null) return true;
		int lh = HeightOfTree.getHeight(root.left);
		int rh = HeightOfTree.getHeight(root.right);
		
	return (Math.abs(rh-lh)<=1 && isBalanced(root.left) && 
			isBalanced(root.right));
	}
	
	public static int isBalncedEfficient(Node root) {
		if(root == null) return 0;
		int lh = isBalncedEfficient(root.left);
		if(lh==-1) return -1;
		int rh = isBalncedEfficient(root.left);
		if(rh==-1) return -1;
		if(Math.abs(lh-rh)>1) return -1;
		else {
			return Math.max(lh, rh)+1;
		}
	}
	
	

}
