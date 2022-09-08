class CircularNode{
	int data;
	CircularNode next;
	CircularNode(int d){
		this.data = d;
	}
}
public class CircularLinkedList {

	// Method 1 using forLoop
	public static void traverseCircularList(CircularNode head) {
		if(head == null) return;
		System.out.print(head.data + " ");
		for(CircularNode r = head.next;r!=head;r=r.next) {
			System.out.print(r.data + " ");
		}
	}
	// Method 2 using while Loop
	public static void traverseCircularListWhile(CircularNode head) {
		if(head == null) return;
		System.out.print(head.data + " ");
		CircularNode r = head.next;
		while(r!=head) {
			System.out.print(r.data + " ");
			r=r.next;
		}
	}
	
	public static CircularNode insertFirst(CircularNode head,int d) {
		CircularNode temp = new CircularNode(d);
		if(head==null) {
			temp.next =temp;
			return temp;
		}else {
			CircularNode curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
				curr.next = temp;
				temp.next = head;
		}
		return head;
	}
	
	public static CircularNode insertLast(CircularNode head,int d) {
		CircularNode temp = new CircularNode(d);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		CircularNode curr = head;
		while(curr.next != null) {
			curr = curr.next;
 		}
		curr.next = temp;
		temp.next = head;
		return head;
	}
	
	// Efficient Approach with O(1) time
	public static CircularNode deleteHead(CircularNode head) {
		if(head == null) return null;
		if(head.next == head) return null;
		
		head.data = head.next.data;
		head.next =head.next.next;
		return head;
	}
	
	public static CircularNode deleteKthNode(CircularNode head, int k) {
		if(head == null || head.next == head)return null;
		if(k==1) {
			head.data = head.next.data;
			head.next=head.next.next;
			return head;
		}
		for(int i=1;i<=k-2;i++) {
			head = head.next;
		}
		head.next = head.next.next;
		return head;
	}
	
	
	
	
	
	public static void main(String[] args) {
		CircularNode  head = new CircularNode(12);
		head.next = new CircularNode(21);
		head.next.next = new CircularNode(29);
		head.next.next.next = new CircularNode(27);
		head.next.next.next.next = head;
		
		deleteKthNode(head, 4);
		traverseCircularList(head);
		
	}
}

