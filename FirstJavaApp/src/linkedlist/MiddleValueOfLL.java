package linkedlist;

public class MiddleValueOfLL {
	
	 Node head;
	
	public static void main(String[] args) {
		
		MiddleValueOfLL ll = new MiddleValueOfLL();
		ll.insertLL(1);
		ll.insertLL(2);
		ll.insertLL(3);
		ll.insertLL(4);
		ll.insertLL(5);
		ll.insertLL(6);
		
		ll.printLL();
		System.out.println("middle element : "+ll.middleElement(ll));
		
	}

	private void printLL() {		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.nodeValue+" ");
			temp = temp.next;
		}
		
	}

	private void insertLL(int data) {
		
	Node currNode = new Node(data);
	
	if(head ==null) {
		head = currNode;	
	}else {		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = currNode;
	}
		
	}
	
	private int middleElement(MiddleValueOfLL ll) {
		
		Node temp = ll.head;
		int length =0;
		while(temp != null) {
			length++;
			temp = temp.next;
		}
		
		temp = ll.head;
		
		for(int i=0;i<length/2;i++) {
			temp = temp.next;
		}
		System.out.println();
	//	System.out.println(temp.nodeValue);
		return temp.nodeValue;
	}

}
