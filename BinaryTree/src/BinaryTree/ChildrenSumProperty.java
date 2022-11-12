 package BinaryTree;

public class ChildrenSumProperty {

	public static boolean isSumProperty(Node root) {
		if(root == null) return true;
        if(root.left == null && root.right == null) 
        	return true;
        int sum=0;
        if(root.left != null){
           sum += root.left.key; 
        }
        if(root.right != null){
            sum += root.right.key; 
        }
        return (sum==root.key) && isSumProperty(root.left) && isSumProperty(root.right); 
       // ;
	}
	
}
