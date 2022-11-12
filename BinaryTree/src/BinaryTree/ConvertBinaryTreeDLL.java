package BinaryTree;

//in-order approach left-root-right 
public class ConvertBinaryTreeDLL {
	
	static Node prev = null;
	
	static Node BtTDll(Node root) {
		if(root == null) return root;
		Node head = BtTDll(root.left);
		if(prev == null) {
			head=root;
		}else {
			root.left = prev;
			prev.right=root;
		}
		prev=root;
		BtTDll(root.right);
		return head;
	}
}
