package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalRootBST {
	
	 static class Pair {
		Node root;
		int hd;
		
		Pair(Node root,int hd){
			this.root=root;
			this.hd=hd;
		}
	}
	static void verticalTravesral(Node root) {

		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root,0));
		TreeMap<Integer,ArrayList<Integer>> mp = new TreeMap<>();
		while(!q.isEmpty()) {
			Pair p = q.poll();
			Node curr = p.root;
			int hd = p.hd;
			
			if(mp.containsKey(hd)) {
				mp.get(hd).add(curr.key);
			}else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(curr.key);
				mp.put(hd,al);
			}
			if(curr.left != null) {
				q.add(new Pair(curr.left,hd-1));
			}
			if(curr.right != null) {
				q.add(new Pair(curr.right,hd+1));
			}
			
		}
		
		for(Map.Entry<Integer, ArrayList<Integer>> m : mp.entrySet()) {
			System.out.println(m.getValue());
		}
	}
}
