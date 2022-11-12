package BinaryTree;

public class HeightOfTree {

	public static int getHeight(Node root) {
		if(root == null) return 0;
		else {
			return Math.max(getHeight(root.left), getHeight(root.right))+1;
		}
	}
}
