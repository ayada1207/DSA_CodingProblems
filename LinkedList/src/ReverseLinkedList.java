
public class ReverseLinkedList {

	public static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr=next;
			
		}
		return prev;
	}
}
