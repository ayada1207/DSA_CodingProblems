package BinaryTree;

public class MainRunner {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		//root.left.left = new Node(4);
		//root.left.right = new Node(5);
		//root.left.left.left = new Node(8);
		//root.left.left.right = new Node(9);
		
		//root.right.left = new Node(6);
		//root.right.right = new Node(7);
		//root.right.left.left = new Node(10);
		
		//System.out.println(MaximumWidthTree.maxWidth(root));
		MirrorTree.mirrorTree(root);
	}

}
