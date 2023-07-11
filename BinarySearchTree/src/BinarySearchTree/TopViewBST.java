package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewBST {
	
	 static class Pair {
	        Node root;
	        int hd;
	        Pair(Node root,int hd)
	        {
	            this.root=root;
	            this.hd=hd;
	        }
	    }
	
	public static ArrayList <Integer> topView(Node root) {
		 Queue<Pair> q = new LinkedList<>();
	        TreeMap<Integer, Integer> map = new TreeMap<>();
	        q.add(new Pair(root,0));
	        while(!q.isEmpty()){
	            Pair p = q.poll();
				Node curr = p.root;
				int hd = p.hd;
				
				if(!map.containsKey(hd)) {
						map.put(hd,curr.key);
				}
				if(curr.left != null) {
					q.add(new Pair(curr.left,hd-1));
				}
				if(curr.right != null) {
					q.add(new Pair(curr.right,hd+1));
				}
				
	        }
	          ArrayList<Integer> al = new  ArrayList<Integer>();
	        for(Map.Entry<Integer,Integer> m:map.entrySet()){
	            al.add(m.getValue());
	        }
	        return al;
	}

}
