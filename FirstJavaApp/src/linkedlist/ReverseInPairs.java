package linkedlist;

public class ReverseInPairs {
	
	public static void main(String[] args) {
		
		Node  l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(3);
		l1.next.next.next = new Node(4);
		l1.next.next.next.next = new Node(5);
		l1.next.next.next.next.next = new Node(6);
		
		Node reversedpair = reverseInPair(l1);
		
		printLL(reversedpair);
		
	}

	private static void printLL(Node reversedpair) {
		
		while(reversedpair != null) {
		System.out.print(reversedpair.nodeValue+" ");
		reversedpair = reversedpair.next;
		}
		
	}

	private static Node reverseInPair(Node l1) {
		
		Node dummy = new Node(0);   // Step 1: Create dummy node with an arbitrary value
		dummy.next = l1;            // Step 2: Link the dummy node to the head of l1
		Node current = dummy;       // Step 3: Initialize current to the dummy node
		
		
		while(current.next != null && current.next.next != null) {
			
			Node first = current.next; //1st node in pair
			Node second = current.next.next; //2nd node in pair
			
			first.next = second.next;
			second.next = first;
			current.next = second;
			
			/*trace
			 * first.next = second.next (1.next = 3)
			   second.next = first (2.next = 1)
			   current.next = second (dummy.next = 2)
			 */
			
			current = first;//moving to next pair
					
		}
		return dummy.next;
	}

}
