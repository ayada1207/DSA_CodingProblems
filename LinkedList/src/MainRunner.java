
public class MainRunner {

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = new Node(35);
		DeleteNodewithoutHeadGiven.deleteNode(head);
		//MiddleOfLinkedList.findMiddle(head);
		Node.printList(head);
	}

}
