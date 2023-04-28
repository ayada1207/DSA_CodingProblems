import java.util.HashMap;

public class CloneLinkedListRandomReference {

	static Node clone(Node head) {
		HashMap<Node,Node> mp = new HashMap<>();
		for(Node curr= head;curr != null;curr=curr.next) {
			mp.put(curr,new Node(curr.data));
		}
		for(Node curr= head;curr != null;curr=curr.next) {
			
			Node clone = mp.get(curr);
			clone.next = mp.get(curr.next);
			clone.random = mp.get(curr.random);
		}
		
		return mp.get(head);
	}
}
