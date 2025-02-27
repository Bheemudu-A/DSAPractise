package linkedlist;

public class IntersectionOfTwoLL {

	
	/*
	 * in this we are adding intersectNode to two nodes, which is intersect point, we need to print insert elements from both nodes, by skipping other elements
	 */
	
	//Not working as expected
public static void main(String[] args) {
		
	Node intersectNode = new Node(8);
    intersectNode.next = new Node(4);
    intersectNode.next.next = new Node(5);
	
		Node node1 = new Node(4);
		node1.next = new Node(1);
		node1.next.next = intersectNode;
		
		
		Node node2 = new Node(5);
		node2.next = new Node(6);
		node2.next.next = new Node(1);
		node2.next.next.next = intersectNode;
		
		Node intersected = intersectTwoLL(node1, node2);
		
		printLL(intersected);
	}

private static void printLL(Node intersected) {
	Node temp = intersected;
	
	while(temp != null) {
		System.out.print(temp.nodeValue+" ");
		temp = temp.next;
	}
	System.out.println();	
}

private static Node intersectTwoLL(Node node1, Node node2) {
	
	Node dummy1 = node1;
	Node dummy2 = node2;
	
	printLL(dummy1);
	printLL(dummy2);
	
	/*while(dummy1 != dummy2) {

		if(dummy1 == null) {
			dummy1 = node2;
		}else {
			dummy1 = dummy1.next;
		}

		if(dummy2 == null) {
			dummy2 = node1;
		}else {
			dummy2 = dummy2.next;
		}
	}*/
	return dummy1;
}
	
}
