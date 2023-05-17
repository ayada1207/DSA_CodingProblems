package BinarySearchTree;

public class SearchKey {

	static boolean search(Node root,int x) {
		if(root ==  null) return false;
		if(root.key == x) {
			return true;
		}
		else if(root.key > x) {
			search(root.left,x);
		}
		else if(root.key < x)
			search(root.right,x);
		
		return false;
	}
}
