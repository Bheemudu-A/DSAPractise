package linkedlist;

public class LinkedListCycle {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(3);
		node1.next.next.next = new Node(4);
		node1.next.next.next.next = node1.next.next; // Creating a cycle (4 -> 3)
		
	System.out.println(hasCycle(node1));
	}

	
	public static boolean hasCycle(Node head) {
		if (head == null || head.next == null) {
			return false; // No cycle possible in an empty or single-node list
		}

		Node slow = head; // Slow pointer moves one step at a time
		Node fast = head; // Fast pointer moves two steps at a time

		while (fast != null && fast.next != null) {
			slow = slow.next; // Move slow pointer by one step
			fast = fast.next.next; // Move fast pointer by two steps

			if (slow == fast) { // If slow and fast meet, a cycle exists
				return true;
			}
		}

		return false; // No cycle found
	}

}
