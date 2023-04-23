
public class FindLengthOfLoop {

	static int findLength(Node head) {
		Node slow=head;
		Node fast= head;
		
		while(fast != null && fast.next != null){
		slow = slow.next;
		fast = fast.next.next;
			if(slow == fast)
				return countNode(slow);
			
		}
		return 0;
}
	
	static int countNode(Node head) {
		int res=1;
		Node slow = head;
		
		while(slow.next != head) {
			slow = slow.next;
			res++;
		}
		return res;
	}
}