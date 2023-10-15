package tree;

public class LCA {

    static Node lowestCommonAncestor(Node root, Node p, Node q){
        if(root == null) return null;
        int curr = root.val;
        if(curr < p.val && curr < q.val){
            return lowestCommonAncestor(root.right, p , q);
        }
        if(curr > p.val && curr > q.val){
            return lowestCommonAncestor(root.left, p, q)
        }
        return root;
    }
    
}
