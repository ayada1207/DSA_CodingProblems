import java.util.Currency;

public class MiddleOfLinkedList {

	public static void findMiddle(Node head) {
		if(head == null) return;
		Node curr = head;int count=0;
		while(curr != null) {
			curr = curr.next;
			count++;
		}
		curr = head;
		if(count%2==0) {
			for(int i=1;i<count/2;i++) {
				curr = curr.next;
			}
			if(curr.data>curr.next.data) {
				System.out.println(curr.next.data + " ");
			}else {
				System.out.println(curr.data + " ");
			}
		}else {
			for(int i=1;i<=count/2;i++) {
				curr = curr.next;
			}
			System.out.println(curr.data + " ");
		}
	}
	
	// In one traversal Solution
	public static void findMidElement(Node head) {
		if(head == null) return;
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow =slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
	}
}
