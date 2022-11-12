package BinaryTree;

public class MaximumOfTree {

	private static int max=Integer.MIN_VALUE;
	private static int min= Integer.MIN_VALUE;
	public static int getMax(Node root) {
		if(root == null) return 0; 
			min= root.key;
		 max = Math.max(max, min);
		 getMax(root.left);
		 getMax(root.right);
		 return max;
	}
	
	//O(1) Aux space
	public static int getMaxOfTree(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		else {
			return Math.max(root.key, Math.max(getMaxOfTree(root.left), getMaxOfTree(root.right)));
		}
	}
}
