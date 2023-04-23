import java.util.Stack;

public class PalindromLinkedList {
	
	//Naive approach
	static boolean isPalindrom(Node head) {
		
		Stack<Character> st = new Stack<>() ;
		for(Node curr = head;curr != null;curr=curr.next) {
			st.push(null);
		}
		for(Node curr = head;curr != null;curr=curr.next) {
			if(st.peek() != curr.data)
				return false;
			st.pop();
		}
		return true;
		
	}

}
