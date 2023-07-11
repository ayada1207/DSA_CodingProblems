package BinarySearchTree;

public class CheckForBST {

	static int prev =Integer.MIN_VALUE;
	public static boolean checkIfBST(Node root) {
		if(root== null) return true;
		if(checkIfBST(root.left)==false) {
			return false;
		}
		if(prev>=root.key)return false;
		prev=root.key;
		return checkIfBST(root.right);
	}
	//EFFICIENT APPROACH- 2
	boolean checkBST(Node root,int min,int max){
		if(root== null) return true;
		return (root.key>min && root.key<max && checkBST(root.left,min,root.key) &&
		checkBST(root.right,root.key,max));
		}
}
