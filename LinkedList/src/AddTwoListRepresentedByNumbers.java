import java.util.Stack;

public class AddTwoListRepresentedByNumbers {

	static Node addTwoList(Node a,Node b) {
		Node prev = null;
		 Stack<Node> s1 = new Stack<Node>();
	        Stack<Node> s2 = new Stack<Node>();
	        Stack<Node> s3 = new Stack<Node>();
		
		Node curr=a;
		while(a != null) {
			s1.push(a);
			a=a.next;
		}
		while(b != null) {
			s2.push(b);
			b=b.next;
		}
		  int carry = 0;
	        // Fill the third stack with the sum of first and
	        // second stack
	        while (!s1.isEmpty() && !s2.isEmpty()) {
	            int sum
	                = s1.peek().data + s2.peek().data + carry;
	            Node temp = new Node(sum % 10);
	            s3.add(temp);
	            if (sum > 9) {
	                carry = 1;
	            }
	            else {
	                carry = 0;
	            }
	            s1.pop();
	            s2.pop();
	        }
	        while (!s1.isEmpty()) {
	            int sum = carry + s1.peek().data;
	            Node temp = new Node(sum % 10);
	            s3.add(temp);
	            if (sum > 9) {
	                carry = 1;
	            }
	            else {
	                carry = 0;
	            }
	            s1.pop();
	        }
	        while (!s2.isEmpty()) {
	            int sum = carry + s2.peek().data;
	            Node temp = new Node(sum % 10);
	            s3.add(temp);
	            if (sum > 9) {
	                carry = 1;
	            }
	            else {
	                carry = 0;
	            }
	            s2.pop();
	        }
	        // If carry is still present create a new node with
	        // value 1 and push it to the third stack
	        if (carry == 1) {
	            Node temp = new Node(1);
	            s3.add(temp);
	        }
	        // Link all the elements inside third stack with
	        // each other
	        if (!s3.isEmpty())
	            prev = s3.peek();
	        while (!s3.isEmpty()) {
	            Node temp = s3.peek();
	            s3.pop();
	            if (s3.size() == 0) {
	                temp.next = null;
	            }
	            else {
	                temp.next = s3.peek();
	            }
	        }
	        return prev;
	}
}
