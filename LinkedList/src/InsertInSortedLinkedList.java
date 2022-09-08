
public class InsertInSortedLinkedList {
	
	public static Node insert(Node head,int x)
	{
		Node temp = new Node(x);
		if(head==null) return temp;
		
		if(head.data>x) {
			temp.next = head;
			head=temp;
			return temp;
		}
		Node curr = head;
		while(curr.next!= null && curr.next.data<x) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		
		return head;
	}

}
