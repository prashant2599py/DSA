package stack;


public class StackUsingArray {
	
	//Properties
	int[] arr;
	int size;
	int top;
	
	//Behavior
	public StackUsingArray(int size) {
		this.size = size;
		top = -1;
		arr = new int[size];
	}
	
	void push(int element) {
		if(size - top > 1) {
			top++;
			arr[top] = element;
		}else {
			System.out.println("Stack Overflow");
		}
	}
	
	void pop() {
		if(top >= 0) {
			top--;
			
		}else {
			System.out.println("Stack UnderFlow");
		}		
	}
	
	int peek() {
		if( top >= 0) {
			return arr[top];
		}else {
			return -1;
		}
	}
	
	
	boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		

		StackUsingArray st = new StackUsingArray(5);
		
		st.push(22);
		st.push(45);
		st.push(56);
		st.push(90);
		st.push(89);
//		st.push(56);
		
		// Print the contents of the stack
	    for (int i = 0; i <= st.top; i++) {
	        System.out.print(st.arr[i] + " ");
	    }
		
	    System.out.println();
	    
		st.pop();
		
		for (int i = 0; i <= st.top; i++) {
	        System.out.print(st.arr[i] + " ");
	    }
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		System.out.println();
		
		
		System.out.println(st.peek());
		
		if(st.isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println("Stack is not empty");
		}
		
		
		
//		Stack<Integer> s = new Stack<Integer>();
//		
//		s.push(22);
//		s.push(23);
//		System.out.println(s);
//		
//		s.pop();
//				
//		System.out.println(s.peek());
//		
//		System.out.println(s.empty());
		
		

	}

}
