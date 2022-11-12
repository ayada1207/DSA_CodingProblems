package BinaryTree;

// Need to print all the nodes at K th distance from root
public class PrintNodeAtKthDistance {

	public static void printKthDistanceNodes(Node root,int k) {
		if(root == null) {
			return;}
			if(k==0) {
				System.out.println(root.key+ " ");
			}
		else {
			printKthDistanceNodes(root.left,k-1);
			printKthDistanceNodes(root.right,k-1);
		}
	}
}
