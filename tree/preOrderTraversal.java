package tree;

import java.util.*;

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

public class preOrderTraversal {
	
	
	
	//Iterative
	
//	public static ArrayList<Integer> preOrderTrav(Node root){
//		ArrayList<Integer> ans = new ArrayList<>();
//		if(root == null)
//			return ans;
//		
//		Stack<Node> st = new Stack<>();
//		st.push(root);
//		
//		while(!st.isEmpty()) {
//			Node topNode = st.peek();
//			ans.add(topNode.data);
//			st.pop();
//			
//			if(topNode.right != null)
//				st.push(topNode.right);
//			
//			if(topNode.left != null)
//				st.push(topNode.left);
//				
//		}
//		return ans;	
//		
//	}
	
	//Recursive Approach
	static void preOrderTrav(Node root, ArrayList<Integer> ans) {
		if(root == null)
			return;
		
		ans.add(root.data);
		preOrderTrav(root.left, ans);
		preOrderTrav(root.right, ans);
	}
	
	
	

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.right.left = new Node(7);
		root.right.right = new Node(8);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);
		
		ArrayList<Integer> preOrder = new ArrayList<>();
//		preOrder = preOrderTrav(root);
		preOrderTrav(root, preOrder);
		
		System.out.println("The Pre-Order Traversal is : ");
		for(int i = 0; i < preOrder.size(); i++) {
			System.out.print(preOrder.get(i)  + " ");
		}		

	}

}
