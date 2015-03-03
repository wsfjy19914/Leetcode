import java.util.ArrayList;
import java.util.List;

public class PathSum {

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();

        pathCalculator(root, sum, list, current);
        return list;
    }

	private void pathCalculator(TreeNode root, int sum, List<List<Integer>> list, List<Integer> current)
	{
		if(root == null)
			return;

		int currentVal = root.val;
		current.add(currentVal);
		if(root.left == null && root.right == null)
		{
			if(sum == currentVal)
			{
				List<Integer> temp = new ArrayList<Integer>(current);
				list.add(temp);
			}
		}

		pathCalculator(root.left, sum - currentVal, list, current);
		pathCalculator(root.right, sum - currentVal, list, current);

		current.remove(current.size() - 1);
	}

}
