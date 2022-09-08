
public class PrintNodeFromLast {

	// usiing two pointer first and second
	public static void print(Node head,int n) {
		Node first =head;
		Node sec = head;
		for(int i=1;i<=n;i++) {
			first = first.next;
		}
		while(first != null) {
			first= first.next;
			sec=sec.next;
		}
		System.out.println(sec.data);
	}
}
