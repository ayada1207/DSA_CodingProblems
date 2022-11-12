package BinaryTree;

import java.util.Stack;

// Depth traversal : Inorder > left Root Right
//					 Preorder - Root Left Right
//					Post Order- Left Right Root

public class DepthTraversal {
	
	public void inOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			System.out.println(root.key + " ");
			inOrder(root.right);
		}
	}
	
	// Without using recursive approach in-order traversal 
	public static void inOrderIterative(Node root) {
		Stack<Node> st = new Stack<>();
		Node curr = root;
		while(curr != null || !st.isEmpty()) {
			while(curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.pop();
			System.out.println(curr.key);
			curr=curr.right;
		}
	}
	
	//recursive Approach pre-order
	public void preOrder(Node root) {
 		if(root != null) {
			System.out.println(root.key + " ");
			inOrder(root.left);
			inOrder(root.right);
		}
	}
	
	// Without using recursive approach pre-order traversal 
	static void preOrderIterative(Node root) {
		Stack<Node> st = new Stack<>();
		if(root == null) return;
		st.push(root);
		while(!st.isEmpty()) {
			Node curr=st.pop();
			System.out.println(curr.key + " ");
			if(curr.right!= null) st.push(curr.right);
			if(curr.left!= null) st.push(curr.left);
		} 
	}
	
	public void postOrder(Node root) {
		if(root != null) {
			inOrder(root.left);
			inOrder(root.right);
			System.out.println(root.key + " ");
		}
	}

}
