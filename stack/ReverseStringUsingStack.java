package stack;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static String reverseString(String input) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}
		
		StringBuilder reversed = new StringBuilder();
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
	}
		return reversed.toString();
	}

	public static void main(String[] args) {
		
		String str = "Prashant";
		
		String reversed = reverseString(str);
		
		System.out.println(reversed);
		
//		String str = "Prashant";
//		
//		Stack<Character> stack = new Stack<>();
//		
//		for(char ch : str.toCharArray()) {
//			stack.push(ch);
//		}
//		
//		StringBuilder reversed = new StringBuilder();
//		while(!stack.isEmpty()) {
//			reversed.append(stack.pop());
//	}
//		System.out.println(reversed.toString());

}
}
