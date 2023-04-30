package CacheTechniques;

import java.util.HashMap;

public class LruCache {
	
	HashMap<Integer,Node> map = new HashMap<>();
	int capacity;
	Node head = new Node(0,0);
	Node tail = new Node(0,0);
	public LruCache(int capacity) {
		this.capacity=capacity;
		head.next=tail;
		tail.prev=head;
	}
	public void put(int key,int value) {
		Node node = new Node(key,value);
		if(map.containsKey(key)) {
			//map.remove(key);
			remove(map.get(key));
		}
		if(map.size()==capacity) {
			remove(tail.prev);
		}
		insert(node);
	}
	public int get(int key) {
		if(map.containsKey(key)) {
			Node node = map.get(key);
			remove(node);
			insert(node);
			return node.value;
		}else
		return -1;
	}

	public void insert(Node node) {
		map.put(node.key, node);
		Node headNext= head.next;
		head.next=node;
		node.prev=head;
		node.next=headNext;
		headNext.prev=node;
	}
	public void remove(Node node) {
		map.remove(node.key);
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
	public static void main(String[] args) {
		LruCache lru= new LruCache(2);
		lru.put(1, 1);
		lru.put(2, 2);
		System.out.println(lru.get(1));
		lru.put(3, 3);
		System.out.println(lru.get(2));
	}
	
	class Node{
		Node prev,next;
		int key,value;
		public Node(int key,int value) {
			this.key=key;this.value=value;
		}
	}

}
