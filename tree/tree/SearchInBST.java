package tree;
class Node{
    int val;
    Node left;
    Node right;

    Node(int data){
        this.val = data;
        left = null;
        right = null;
    }

}
public class SearchInBST {

    public static Node searchBST(Node root, int val){
        while(root != null && root.val != val){
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        
        Node found = searchBST(root,10);

        if(found != null)
            System.out.println("Node with value found");
        else System.out.println("Node with value not found");

    }
    
}
