
public class SgregrateEvenOddNode {

	static Node segregrate(Node head) {
		Node es= null;
		Node ee= null;
		Node os= null;
		Node oe= null;
		for(Node curr = head;curr != null;curr=curr.next) {
			int x= curr.data;
			if(x%2==0) {
				if(es==null) {
					es=ee=curr;
				}else{
					ee.next=curr;
				}
			}else {
				if(os==null)
					os=oe=curr;
				else
					oe.next=curr;
			}
		}
		//end of for loop
		if(os==null || es ==null)
			return null;
		ee.next=os;
		oe.next= null;
		return es;
		
	}
}
