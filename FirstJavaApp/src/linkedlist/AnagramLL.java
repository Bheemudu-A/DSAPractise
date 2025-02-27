package linkedlist;

import java.util.ArrayList;
import java.util.List;

/*
 * check whether given node is palindrome or not
 * [1,2,2,1] true, 2nd, [1,2] false
 */
public class AnagramLL {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(2);
		node1.next.next.next = new Node(1);
		
		printLL(node1);
		System.out.println("Is LL is palindrome : "+convertLLtoList(node1));
	}
	
	protected static boolean convertLLtoList(Node node) {
		List<Integer> list = new ArrayList<>();
		
		Node temp = node;
		
		while(temp != null) {
			list.add(temp.nodeValue);
			temp = temp.next;
		}
		
		return isPalindrome(list);
	}
	
	
	
	
	private static boolean isPalindrome(List<Integer> list) {
		
		int start =0;
		int end = list.size()-1;
		
		//below both conditions are working
		//!list.get(start).equals(list.get(end))
		while(list.get(start) != list.get(end)) {
			start++;
			end--;
			return false;
		}	
		return true;
	}

	protected static void printLL(Node ll) {	
		
		Node temp = ll;
		while(temp != null) {
			System.out.print(temp.nodeValue+" ");
			temp = temp.next;
		}
	}

}
