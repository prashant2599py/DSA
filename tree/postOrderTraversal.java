package tree;

import java.util.ArrayList;
import java.util.Stack;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		left = right = null;
	}
	Node(){
		
	}
}

public class postOrderTraversal {
	
	//Iterative
	
	public static ArrayList<Integer> postOrderTrav(Node root){
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		if(root == null) return ans;
		
		Stack<Node> st = new Stack<Node>();
		while(root != null || !st.isEmpty()) {
			
			if(root != null) {
				st.push(root);
				root = root.left;
			}else {
				Node temp = st.peek().right;
				
				if(temp == null) {
					temp = st.peek();
					st.pop();
					ans.add(temp.data);
					
					while(!st.isEmpty() && temp == st.peek().right) {
						temp = st.peek();
						st.pop();
						ans.add(temp.data);
					}
				}else {
					temp = root;
				}
			}			
		}
		return ans;		
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
		
		ArrayList<Integer> postOrder = new ArrayList<>();
		postOrder = postOrderTrav(root);
//		postOrderTrav(root, postOrder);
		
		System.out.println("The post-Order Traversal is : ");
//		for(int i = 0; i < postOrder.size(); i++) {
//			System.out.print(postOrder.get(i)  + " ");
//		}		

	}
}
