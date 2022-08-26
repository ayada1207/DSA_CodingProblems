
 class Node {
	 int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	
	public static void printList(Node head) {
		Node current = head;
		
		while(current != null) {
			System.out.println(current.data +  "  ");
			current = current.next;
		}
	}
	
	public static Node insertFirst(int d, Node head) {
		Node temp = new Node(d);
		temp.next = head;
		head = temp;
		return head;
	}
	
	public static Node insertLast(int d,Node head) {
		Node n = new Node(d);
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = n;
		return head;
	}
	
	public static Node deleteFirstNode(Node head) {
		if(head == null) {
			return null;
		}else {
			return head.next;
		}
	}
	
	public static Node deleteLast(Node head) {
		if(head==null) return null;
		if(head.next==null) return null;
		Node current = head;
		Node temp = current;
		while(current.next != null) {
			 temp = current;
			current = current.next;
			
		}
		temp.next = null;
		return head;
	}
	
	public static Node insertAtPosition(Node head,int pos,int d) {
		Node temp = new Node(d);
		Node curr = head;
		if(pos==1) {
			temp.next = head;
			return head;
			}
		
		for(int i=1;i<pos-2 && curr != null;i++) 
			curr = curr.next;
			if(curr== null )return null;
			temp.next = curr.next;
		curr.next = temp;
		
		return head;
	}
	
	public static int serachElement(Node head, int data) {
		int pos=1;
		Node curr = head;
		while(curr != null) {
			if(curr.data == data) {
				return pos;
			}else { 
				pos++;
				curr = curr.next;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//Node head = new Node(10);
		//Node temp = new Node(20);
		//Node temp1 = new Node(30);
		//Node temp2 = new Node(40);
		
		//head.next = temp;
		//temp.next = temp1;
		//temp1.next = temp2;
		
		Node head = null;
		head = insertFirst(2, head);
		head = insertFirst(1, head);
		head= insertLast(3, head);
		
		// head=insertLast(1000, head);
		 //head =insertLast(403, head);
		// head = deleteFirstNode(head);
		// head = deleteLast(head);
		// head = deleteLast(head);
		 head = insertAtPosition(head, 4, 90);
		printList(head);
		
		 System.out.println("Element Found at : " + serachElement(head, 3));

	}

}
