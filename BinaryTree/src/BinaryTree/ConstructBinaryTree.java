package BinaryTree;

public class ConstructBinaryTree {
	
	static int preIndex=0;
	// To construct a binary tree there should be in-order traverse along with with
	// pre-order / post-order
	public static Node constructBinaryTree(int[] in,int[] pre,int is,int ie) {
		
		// make a root from pre order array 
		Node root = new Node(pre[preIndex++]);
		
		//for loop for this root.key inside in-order array if find then 
		//left of this root.key will be on left side of root and same for right of root
		int inIndex=0;
		for(int i=is;i<=ie;i++) {
			if(in[i]==root.key) {
				inIndex=i;
				break;
			}
		}
		root.left = constructBinaryTree(in, pre, is, inIndex-1);
		root.right = constructBinaryTree(in, pre, inIndex-1, ie);
		return root;
	}

}
