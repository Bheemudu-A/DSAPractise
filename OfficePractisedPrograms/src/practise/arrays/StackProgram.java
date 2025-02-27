package practise.arrays;

import java.util.Stack;

public class StackProgram {
	
	public static void main(String[] args) {
		
		String[] strArr = {"add:Hello", "add:World", "del", "add:!"};
		System.out.println("stack : "+usingStack(strArr));
		
		String[] strArr2 = {"add:Hi","del","del", "add:Hello"};
		System.out.println("stack : "+usingStack(strArr2));
	}

	private static String usingStack(String[] strArr) {
		
		Stack<String> stack = new Stack();
		
		for(String str: strArr) {
			if(str.startsWith("add:")) {
				stack.add(str.substring(4));
			}else if(str.equals("del")) {
				if(!stack.isEmpty()) {
				       stack.pop();
				} 
				
			}
		}
		
		StringBuffer buffer = new StringBuffer();
		for(String el : stack) {
			buffer.append(el);
		}
		
	return buffer.toString();	
	}

}
