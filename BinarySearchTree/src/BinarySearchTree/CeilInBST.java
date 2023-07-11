package BinarySearchTree;


// Nearest greater Node in BST
public class CeilInBST {

	static Node ceil(Node root,int x) {
		if(root == null) return null;
		Node curr = root;
		Node res= null;
		while(curr != null) {
			if(curr.key == x)
				return curr;
			else if(root.key >x) {
				curr =curr.right;
			}else if(root.key <x) {
				res=curr;
				curr=curr.left;
			}
		}
		return res ;
	}
}
