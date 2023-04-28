import java.util.HashMap;
import java.util.Map;

public class LRUCacheDesign {

	Node head = new Node(0,0);
	Node tail = new Node(0,0);
	Map<Integer,Node> mp = new HashMap<>();
	int capacity;
	
	LRUCacheDesign(int _capacity){
		this.capacity=_capacity;
		head.next=tail;
		tail.prev=head;
	}
	
	public int get(int key) {
		if(mp.containsKey(key)) {
			Node node = mp.get(key);
			remove(node);
			insert(node);
			return node.value;
		}else {
			return -1;
		}
	}
	public void put(int key, int value) {
		if(mp.containsKey(key)) {
			remove(mp.get(key));
		}if(mp.size() == capacity) {
			remove(tail.prev);
		}
		insert(new Node(key,value));
	}
	
	void remove(Node node) {
		mp.remove(node.key, node);
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
	
	void insert(Node node) {
		mp.put(node.key, node);
		Node headNext = head.next;
		head.next=node;
		node.prev=head;
		node.next=headNext;
		headNext.prev = node;
		
	}
	
	class Node{
		int key;
		int value;
		Node next;Node prev;
		
		Node(int _key,int _value){
			this.key=_key;
			this.value=_value;
		}
	}
	
	public static void main(String[] args) {

		
	}
	
}
