package linkedlist;

public class MergeTwoLLAfterSorting {
	
	
	public static void main(String[] args) {
		
		Node l1 = new Node(1);
		l1.next = new Node(3);
		l1.next.next = new Node(5);
		l1.next.next.next = new Node(10);
		l1.next.next.next.next = new Node(9);
		printLL(l1);
		
		Node l2 = new Node(2);
		l2.next = new Node(4);
		l2.next.next = new Node(6);
		l2.next.next.next = new Node(8);
		l2.next.next.next.next = new Node(11);
		printLL(l2);
		
		Node mergedList = mergeLL(l1, l2);
		
		System.out.println("Merged List : ");
		printLL(mergedList);
		
	}
	
	protected static void printLL(Node l1) {
		Node temp = l1;
		while(temp != null) {
			System.out.print(temp.nodeValue +" ->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	protected static Node mergeLL(Node l1, Node l2) {
		
		 Node dummy = new Node(0);
		 Node current = dummy;		
		
		while(l1 != null && l2 != null) {
		//	System.out.println(l1.nodeValue+" : "+l2.nodeValue);
			if(l1.nodeValue <= l2.nodeValue) {
				current.next = l1;				
				l1 = l1.next;
			}else {
				current.next = l2;
				l2 = l2.next;				
			}
			current = current.next;		
		}
		
		while(l1 != null) {
			current.next = l1;
			l1 = l1.next;
		}
		
		while(l2 !=null) {
			current.next = l2;
			l2 = l2.next;
		}
		
		return dummy.next;
	}
	
}


