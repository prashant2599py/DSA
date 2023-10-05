import java.util.ArrayList;

class RootToNodePath{
    

    private boolean getPath(TreeNode root, ArrayList<Integer>, int x){
        if(root == null){
            return false;
        }
        arr.add(root.val);
        if(root.val == x){
            return true;
        }
        if(getPath(root.left, arr, x) || getPath(root.right, arr, x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }

    public ArrayList<Integer> solve(TreeNode A, int B){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(A==null) return arr;
        getPath(A, arr, B);
        return arr;
    }
}