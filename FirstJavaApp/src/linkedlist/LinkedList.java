package linkedlist;


public class LinkedList {
	
	 Node head = null;
	
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll = insertLL(ll, 1);
		ll = insertLL(ll, 2);
		ll = insertLL(ll, 3);
		ll = insertLL(ll, 4);
		ll = insertLL(ll, 5);
		ll = insertLL(ll, 6);
		printLL(ll);
		
		deleteByKey(ll, 1);
		deleteByKey(ll, 3);
		deleteByKey(ll, 6);
		
		
		
		printLL(ll);
	}

	
	//insertion
	protected static LinkedList insertLL(LinkedList ll, int data) {	
		Node new_Node = new Node(data);		
		if(ll.head == null) {
			ll.head = new_Node;
		}else {
			Node last = ll.head;
			while(last.next != null) {
				last = last.next;
			}			
			last.next = new_Node;	
		}
		return ll;
	}
	
	
    protected static void printLL(LinkedList ll) {    	
    	Node curr_Node = ll.head;
    	System.out.println("LinkedList");
    	while(curr_Node != null) {
    		System.out.print(curr_Node.nodeValue + " ");
    		curr_Node = curr_Node.next;
    	}
    }
    
    
    private static LinkedList deleteByKey(LinkedList ll, int key) {
    	
    	Node currNode = ll.head;
    	Node prev = null;
    	
    	//case 1: if key found at 1st node
    	if(currNode != null && currNode.nodeValue == key) {
    		ll.head = currNode.next;
    		System.out.println("Key found at head & deleted "+key);
    		return ll;
    	}
    	
    	//case 2: if key not at 1st node, iterating till key found
    	while(currNode != null && currNode.nodeValue != key) {
    		prev = currNode;
    		currNode = currNode.next;
    	}
    	
    	//case 2: key found then map next node refernce to  previous node, which deletes current Node
    	if(currNode != null) {
    		prev.next = currNode.next;
    		System.out.println("Key found and deleted at "+key);
    	}
    	
    	
    	if(currNode == null) {
    		System.out.println("Key not found");
    	}
    	
    	return ll;
    }

}
