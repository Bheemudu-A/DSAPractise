package linkedlist;

public class LinkedListDelete {
	
	
	public static void main(String[] args) {
		
		Node  l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(3);
		l1.next.next.next = new Node(4);
		l1.next.next.next.next = new Node(5);
		l1.next.next.next.next.next = new Node(6);
		
		Node newNode = deleteLL(l1, 2);
		
		printLL(newNode);
		
	}

	private static void printLL(Node newNode) {
		
		if(newNode == null) {
			return;
		}
		
		while(newNode != null) {
			System.out.print(newNode.nodeValue+" ");
			newNode = newNode.next;
		}
	}

	private static Node deleteLL(Node l1, int index) {
		
		if(l1 == null) {
			return null;
		}
		
		if(index ==0) {
			return l1.next;
		}
		
		Node current = l1;
		Node previuos = null;
		int currIndex =0;
		
		while(current != null && currIndex < index) {
			previuos = current;
			current = current.next;
			currIndex++;
		}
		
		//if index is greater than LL size return not found
		if(current == null) {
			System.out.println("Element not found in LL");
			return l1;
		}
		
		//unlink the node from LL
		previuos.next = current.next;
		
		
		return l1;
	}

}
