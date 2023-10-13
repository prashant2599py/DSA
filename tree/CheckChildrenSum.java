
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class CheckChildrenSum {

    static void reOrder(Node root){
        if(root == null) return;
        int child = 0;
        if(root.left != null){
            child += root.left.data;
        }
        if(root.right != null){
            child += root.right.data;
        }
        if(child >= root.data) root.data = child;
        else{
            if(root.left != null) root.left.data = root.data;
            else if(root.right != null) root.right.data = root.data;
        }

        reOrder(root.left);
        reOrder(root.right);

        int total = 0;
        if(root.left != null) total += root.left.data;
        if(root.right != null) total += root.right.data;
        if((root.left != null) || (root.right != null) )root.data = total;
    }

    static void changeTree(Node  root) {
        reOrder(root);
      }
      public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        // Print the left subtree
        printTree(root.left);
        
        // Print the current node's data
        System.out.print(root.data + " ");
        
        // Print the right subtree
        printTree(root.right);
    }
    
    public static void main(String[] args) {
        Node  root = new Node(40);
        root.left = new Node(10);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        changeTree(root);
        printTree(root);
        
    }

}