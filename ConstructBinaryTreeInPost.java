import java.util.Arrays;


public class ConstructBinaryTreeInPost {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n = inorder.length;
        if(n == 0)
            return null;
        
        if(n == 1)
        {
            return (new TreeNode(inorder[0]));
        }
        
        int rootIndex = searchIndex(inorder, 0, n - 1, postorder[n - 1]);
        TreeNode root = new TreeNode(postorder[n - 1]);
              
        root.left = buildSubTree(inorder, postorder, 0, rootIndex - 1, 0, rootIndex - 1);
        root.right = buildSubTree(inorder, postorder, rootIndex + 1, n - 1, rootIndex, n - 2 );
        
        return root;
    }
    
    private TreeNode buildSubTree(int[] inorder, int[] postorder, int startIn, int endIn, int startPost, int endPost)
    {
        if(startIn > endIn)
            return null;
        if(startIn == endIn)
        {
            return (new TreeNode(inorder[startIn]));
        }
        
        int subRootIndex = searchIndex(inorder, startIn, endIn, postorder[endPost]);
        TreeNode subRoot = new TreeNode(postorder[endPost]);
        
        subRoot.left = buildSubTree(inorder, postorder, startIn, subRootIndex - 1, startPost, startPost + (subRootIndex - 1));
        subRoot.right = buildSubTree(inorder, postorder, subRootIndex + 1, endIn, endPost - (endIn - subRootIndex), endPost - 1);
        
        return subRoot;
    }
    
    private int searchIndex(int[] A, int start, int end, int num)
    {
        for(int i = start; i <= end; i ++)
            if(A[i] == num)
                return i;
        return -1;
    }

}
