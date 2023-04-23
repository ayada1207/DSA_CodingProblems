
public class SwapKthNode {
	
	static Node swap(Node head,int k,int n) {
		if(n<k)return head;
		
		int pos=1;
		Node curr = head;int count=1;
		Node last = null;Node first =null;
		while(curr != null) {
			if(count == k) {
				first= curr;
			}
			if(count == n-k+1) {
				last = curr;
			}
			count++;
			curr = curr.next;
		}
		int temp = first.data;
		first.data=last.data;
		last.data =temp;
		
		return head;
	}

}
