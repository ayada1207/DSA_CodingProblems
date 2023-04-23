import java.util.HashSet;

public class DetectLoop {

	// Using Hashing
	public static boolean isLoop(Node head) {
		HashSet<Node> set = new HashSet<Node>();
		for(Node curr = head;curr!=null;curr=curr.next) {
			if(set.contains(curr)) {
				return true;
			}else {
				set.add(curr);
			}
		}
		return false;
	}
	
	// Using Floyd Detection cycle
	public static boolean isLoopFloydCycle(Node head) {
		Node slow= head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast= fast.next.next;
			
			if(slow == fast) return true;
		}
		return false;
	}
	
	// Detect Loop and remove Loop from list
	
	public static void detectAndRemove(Node head) {
		Node slow= head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast= fast.next.next;
			
			if(slow == fast)break;
		}
		if(slow != fast) return;
		slow= head;
		while(slow != fast.next) {
			//slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
	}
}
