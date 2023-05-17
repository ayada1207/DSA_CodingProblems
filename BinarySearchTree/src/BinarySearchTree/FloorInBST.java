package BinarySearchTree;


// nearest smaller root of given int x
public class FloorInBST {

	static Node floor(Node root,int x) {
		
		if(root == null) return null;
		Node curr = root;
		Node res= null;
		while(curr != null) {
			if(curr.key ==x) {
				return curr;
			}
			else if(curr.key >x) {
				curr = curr.left;
			}
			else if(curr.key<x) {
				res=curr;
				curr=curr.right;
			}
		}
		return res;
	}
}
