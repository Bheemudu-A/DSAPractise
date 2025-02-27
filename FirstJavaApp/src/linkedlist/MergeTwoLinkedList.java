package linkedlist;

public class MergeTwoLinkedList {
	
	Node head;
	
	protected void insertLL(int data) {	
		Node currNode = new Node(data);	
		
		if(head == null) {
			head = currNode;
		}else {			
			Node last = head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = currNode;
		}
	}
	
	protected void printLL() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.nodeValue +" ->");
			temp = temp.next;
		}
		System.out.println();
	}
	
	protected void mergeLL(MergeTwoLinkedList ll2) {
		
		if(head == null) {
			head = ll2.head;
		}else {
			
			Node last = head;
			
			while(last.next != null) {
				last = last.next;
			}
			last.next = ll2.head;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		MergeTwoLinkedList ll = new MergeTwoLinkedList();
		ll.insertLL(0);
		ll.insertLL(2);
		ll.insertLL(4);
		ll.insertLL(6);
		System.out.println("First LL");
		ll.printLL();
		MergeTwoLinkedList l2 = new MergeTwoLinkedList();
		l2.insertLL(1);
		l2.insertLL(3);
		l2.insertLL(5);
		l2.insertLL(7);
		System.out.println("Second LL");
		l2.printLL();
		
		ll.mergeLL(l2);
		System.out.println("Merged LL");
		ll.printLL();
		
		
		
	}

}
