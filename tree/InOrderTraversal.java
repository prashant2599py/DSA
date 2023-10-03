package tree;
import java.util.*;
import java.util.ArrayList;
	
	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			this.data = data;
			left = right = null;
		}
		TreeNode(){
			
		}
	}

	public class InOrderTraversal {
		
		
		
		//Iterative
		
//		public static ArrayList<Integer> inOrderTrav(Node root){
//			ArrayList<Integer> ans = new ArrayList<>();
//			Stack<Node> st = new Stack<>();
//			
//			while(true) {
//				if(root != null) {
//					st.push(root);
//					root = root.left;
//				}else {
//					if(st.isEmpty())break;
//					
//					root = st.peek();
//					ans.add(root.data);
//					st.pop();
//					root = root.right;
//				}
//			}
//			return ans;
//			
//		}
		
		//Recursive Approach
		static void inOrderTrav(TreeNode root, ArrayList<Integer> ans) {
			if(root == null)
				return;
		
			inOrderTrav(root.left, ans);
			ans.add(root.data);
			inOrderTrav(root.right, ans);
		}
		
		
		

		public static void main(String[] args) {
			
			TreeNode root = new TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			root.left.left = new TreeNode(4);
			root.left.right = new TreeNode(5);
			root.left.right.left = new TreeNode(6);
			root.right.left = new TreeNode(7);
			root.right.right = new TreeNode(8);
			root.right.right.left = new TreeNode(9);
			root.right.right.right = new TreeNode(10);
			
			ArrayList<Integer> inOrder = new ArrayList<>();
//			inOrder = inOrderTrav(root);
			inOrderTrav(root, inOrder);
			
			System.out.println("The Pre-Order Traversal is : ");
			for(int i = 0; i < inOrder.size(); i++) {
				System.out.print(inOrder.get(i)  + " ");
			}		

		}

}
