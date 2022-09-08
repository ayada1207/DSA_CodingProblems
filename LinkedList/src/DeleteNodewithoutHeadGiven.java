
public class DeleteNodewithoutHeadGiven {

	public static void deleteNode(Node n) {
		n.data = n.next.data;
		n.next=n.next.next;
	}
}
