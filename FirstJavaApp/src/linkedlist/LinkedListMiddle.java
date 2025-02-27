package linkedlist;

public class LinkedListMiddle {
	
	public static void main(String[] args) {
		
		Node l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(3);
		l1.next.next.next = new Node(4);
		l1.next.next.next.next = new Node(5);
		l1.next.next.next.next.next = new Node(6);
		l1.next.next.next.next.next.next = new Node(7);
		
	System.out.println("Mid element : "+findMidElement(l1));
	}

	private static int findMidElement(Node l1) {
		
		if(l1 == null) {
			return -1;
		}
		
		Node slow = l1;
		Node fast = l1;
		
		while(fast != null && fast.next != null) {		
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.nodeValue;
	}

}
