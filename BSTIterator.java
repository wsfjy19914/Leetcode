import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
	private TreeNode current;
	private Stack<TreeNode> stack = new Stack<TreeNode>();
	
	public BSTIterator(TreeNode root) {
		current = root;
		if(current == null)
			return;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
    	return (!stack.isEmpty() || current != null);        
    }

    /** @return the next smallest number */
    public int next() {
        while(current != null)
        {
        	stack.push(current);
        	current = current.left;
        }
        
        TreeNode node = stack.pop();
        current = node.right;
        return node.val;      
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

