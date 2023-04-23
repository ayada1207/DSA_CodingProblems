
public class MergeLinkedList {
	
	public static Node mergeTwoList(Node a,Node b) {
		
		Node head = null;Node tail = null;
		if(a==null) return b;
		if(b==null) return a;
	if(a.data<=b.data) {
		head=a;tail=a;
		a= a.next;
	}else {
		head=b;tail=b;
		b= b.next;
	}
	while(a != null && b != null) {
		if(a.data >= b.data) {
			tail.next = b;
			tail=b;
			b= b.next;
		}else {
			tail.next = a;
			tail=a;
			a= a.next;
		}
	}
	if(a==null) tail.next=b;
	else {
		tail.next =a;
	}
	return head;
	}

}
