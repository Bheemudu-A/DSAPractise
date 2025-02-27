package linkedlist;

public class SinglyLLDeleteByIndex extends LinkedList {

	
public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll = insertLL(ll, 1);
		ll = insertLL(ll, 2);
		ll = insertLL(ll, 3);
		ll = insertLL(ll, 4);
		ll = insertLL(ll, 5);
		ll = insertLL(ll, 6);
		printLL(ll);
		
		
		deleteByIndex(ll, 1);
		deleteByIndex(ll, 5);
		
		printLL(ll);
	}
	
       // issue in deleting last index
		private static LinkedList deleteByIndex(LinkedList ll, int index) {
		
			Node currNode = ll.head;
			Node prev = null;
		
			//case 1: if key found at 1st node
			if(currNode != null && index ==0) {
				ll.head = currNode.next;
				System.out.println("Key found at head & deleted "+currNode.nodeValue);
				return ll;
			}
		
			int count =0;
			while(currNode != null) {
				System.out.println("index : "+count);
				if(count == index) {
					prev.next = currNode.next;
					System.out.println("Key found and deleted at "+prev.nodeValue);
					break;
				}else {   			
					prev = currNode;
					currNode = currNode.next;
					count++;
				}
		
			}
		
			if(currNode == null) {
				System.out.println("Key not found");
			}
		
			return ll;
		}
}
