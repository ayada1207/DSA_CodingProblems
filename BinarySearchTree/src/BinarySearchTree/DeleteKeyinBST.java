package BinarySearchTree;

public class DeleteKeyinBST {

	static Node delete(Node root,int x) {
		if(root == null) return root;
		
		if(root.key>x) {
			root.left = delete(root.left,x);
		}
		else if(root.key<x) {
			root.right = delete(root.right,x);
		}
		else {
			if(root.left == null )return root.right;
			else if(root.right == null ) return root.left;
			Node succ = getSuccessor(root);
			succ.key = root.key;
			
		}
		return root;
	}
	static Node getSuccessor(Node root) {
		Node curr = root.right;
		while(curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
}
