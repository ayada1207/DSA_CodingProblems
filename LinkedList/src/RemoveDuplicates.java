import java.util.HashSet;

public class RemoveDuplicates {

	// List is sorted
	public static Node removeDup(Node head) {
		Node curr = head;
		
			while(curr != null && curr.next!=null) {
				if(curr.data == curr.next.data)
				curr.next = curr.next.next;
				else {
					curr= curr.next;
				}
			}
		return head;
	}
	
	// List is not sorted
	
	static Node removeDuplicateNodes(Node head) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		Node curr= head;
		Node prev= null;
		while(curr != null) {
			int x= curr.data;
			if(hs.contains(x)) {
				prev.next=curr.next;
			}else {
				hs.add(x);
				prev= curr;
			}
			curr= curr.next;
		}
		return head;
	}
}
