public class ValidBST {
    boolean isBST(Node root)
    {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    boolean isValidBST(Node root, long minValue, long maxValue){
        if(root == null){
            return true;
        }
        if(root.data <= minValue || root.data >= maxValue) return false;
        
        return isValidBST(root.left, minValue, root.data) && isValidBST(root.right, root.data, maxValue);
    }
}
