package BinarySearchTree;

public class InsertInBST {
	public static Node insert(Node root,int x) {
	if(root ==  null) root = new Node(x);
	
	 if(root.key > x) {
		insert(root.left,x);
	}
	else if(root.key < x)
		insert(root.right,x);
	
	return root;
	}
}
