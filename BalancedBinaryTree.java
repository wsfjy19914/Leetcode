

public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
       
        if(height(root) == -1)
            return false;
        else
            return true;        
    }
    
    private int height(TreeNode root)
    {
        if(root == null)
            return 0;
            
        int left = height(root.left);
        int right = height(root.right);
            
        if(Math.abs(left - right) > 1)
            return -1;
        else if(left == -1 || right == -1)
            return -1;
        else            
            return Math.max(left, right) + 1;        
    }

}
