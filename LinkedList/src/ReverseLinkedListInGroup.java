
public class ReverseLinkedListInGroup {

	// Recursive Approach 
	public static Node reverseIngroup(Node head, int k) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		int count=0;
		while(curr != null && count<k) {
			next = curr.next;
			curr.next=prev;
			prev=curr;
			curr= next;
		}
		if(next != null) {
			Node rest_head = reverseIngroup(next, k);
			head.next= rest_head;
		}
		return prev;
	}
	
	// Iterative Approach
	public static Node iterativeReverse(Node head,int k) {
		Node curr= head;
		Node preFirst = null;
		boolean isFirstPass = true;
		
		while(curr != null) {
			Node first = curr;
			Node prev = null;int count=0;
			while(curr != null && count<k) {
				Node next = curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
				count++;
			}
			if(isFirstPass) {
				head=prev;
				isFirstPass=false;
			}else {
				preFirst.next= prev;
			}
			preFirst = first;
		}
		return head;
	}
}
