
public class DoublyNode {
	int data;
	DoublyNode prev;
	DoublyNode next;
	
	DoublyNode(int data){
		this.data = data;
	}
	
	public static DoublyNode insertAtFirst(DoublyNode head,int data) {
		DoublyNode temp = new DoublyNode(data);
		temp.next = head;
		if(head != null) {
			head.prev=temp;
		}
		return temp;
	}
	
	public static DoublyNode insertLast(DoublyNode head,int data) {
		DoublyNode temp = new DoublyNode(data);
		DoublyNode curr = head;
		DoublyNode temp1 = curr;
		if(head == null) return temp;
		while(curr != null) {
			temp1= curr;
			curr= curr.next;
		}
		temp1.next = temp;
		 temp.next = null;
		 temp.prev = temp1;
		 return head;
	}
	
	public static void printList(DoublyNode head) {
		if (head==null) System.out.println("List is Empty");
		DoublyNode curr = head;
		while(curr != null) {
			System.out.println(curr.data + " ");
			curr = curr.next;
		}
	}
	
	public static DoublyNode deleteFirst(DoublyNode head) {
		if(head == null || head.next == null)
		return null;
		head= head.next;
		head.prev = null;
		return head;
	}
	public static DoublyNode deleteLast(DoublyNode head) {
		if(head == null || head.next == null)
		return null;
		DoublyNode curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.prev.next = null;
		return head;
	}
	
	public static DoublyNode reverseDll(DoublyNode head) {
		if(head==null || head.next == null) {
			return head;
		}
		DoublyNode curr = head;
		DoublyNode prev = null;
		while(curr != null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
	}
	
	static DoublyNode insertAtPosition(DoublyNode head,int x,int p) {
		DoublyNode temp = new DoublyNode(p);
		int count =-1;
		DoublyNode curr= head;
		while(curr!=null && count<p) {
			curr=curr.next;
			count++;
		}
		curr.next = temp;
		if(curr.next != null)
		temp.next=curr.next.next;
		
		return head;
	}

	public static void main(String[] args) {
		DoublyNode  head = null;
		head = insertAtFirst(head, 10);
		head = insertAtFirst(head, 20);
		 head = insertLast(head, 30);
		printList(head);
		head = reverseDll(head);
		printList(head);

	}

}
