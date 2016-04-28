Balanced Binary Tree 
/*
最大深度法判断是否为平衡二叉树，
任意两点的最大深度差小于1
*/

//Max Depth
public int MaxDepth(TreeNode root) {
	if (root == null) {
		return 0;
	}

	//divide 
	int leftDepth = MaxDepth(root.left);
	int rightDepth = MaxDepth(root.right);

	//conquer
	return Math.max(leftDepth, rightDepth) + 1;
}

//Max Depth; for every node, find the diff > 1
public boolean isBalanced(TreeNode root) {
	if (root == null) {
		return true;
	}

	int a = helper(root);
	if (a == -1) {
		return false;
	}
	return true;
}
public int helper(TreeNode root) {
	if (root == null) {
		return 0;
	}

	//divide 
	int leftDepth = helper(root.left);
	int rightDepth = helper(root.right);

	if (Math.abs(leftDepth - rightDepth) > 1 || leftDepth == -1 || rightDepth == -1) {
		return -1;
	}

	//conquer
	return Math.max(leftDepth, rightDepth) + 1;
}

/*
ResultType法
*/