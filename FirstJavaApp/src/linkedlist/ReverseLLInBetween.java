package linkedlist;

public class ReverseLLInBetween {
	
	public static void main(String[] args) {
        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int m = 3, n = 5;
        System.out.println("Original list:");
        printList(head);
        
        // Reverse the list between positions m and n
        head = reverseBetween(head, m, n);
        
        System.out.println("List after reversing between " + m + " and " + n + ":");
        printList(head);
    }

	//need to check again
    public static Node reverseBetween(Node head, int m, int n) {
        if (head == null || m == n) {
            return head;  // No need to reverse if list is empty or m == n
        }

        Node dummy = new Node(0);  // Create a dummy node to handle edge cases
        dummy.next = head;
        Node pre = dummy;

        // Move `pre` to the node just before position `m`
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }

        // Start reversing from position `m`
        Node start = pre.next;  // The first node to reverse
        Node then = start.next; // The node after `start`

        // Reverse the sublist between `m` and `n`
        for (int i = 0; i < n - m; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return dummy.next;  // Return the new head
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.nodeValue + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
