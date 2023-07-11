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
			
			// case where root is parent
			Node succ = getSuccessor(root);
			 root.key=succ.key;
			 root.right = delete(root,succ.key);	
		}
		return root;
	}
	static Node getSuccessor(Node root) {
		// selecting nearest greater of deleted node. 
		Node curr = root.right;
		while(curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
}
