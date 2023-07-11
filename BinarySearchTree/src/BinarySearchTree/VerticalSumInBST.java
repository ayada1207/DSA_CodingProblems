package BinarySearchTree;

import java.util.Map;
import java.util.TreeMap;

public class VerticalSumInBST {

	static void vSum(Node root) {

		TreeMap<Integer,Integer> map = new TreeMap<>();
		vSumRecur(root,0,map);
		for(Map.Entry<Integer, Integer> mp : map.entrySet()) {
			System.out.print(mp.getValue() + " ");
		}
	}
	
	static void vSumRecur(Node root,int hd,TreeMap<Integer,Integer> map) {
		if(root != null) {
			vSumRecur(root.left,hd-1,map);
			
			if(map.containsKey(hd)) {
				map.put(hd, map.get(hd)+ root.key);
			}else {
				map.put(hd, root.key);
			}
			
			vSumRecur(root.right,hd+1,map);
		}
	}
}
