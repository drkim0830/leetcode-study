package week1;

public class Leet617 {
	static boolean root = false;

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);

		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);

		TreeNode result = mergeTrees(t1, t2);
		print(result);
	}

	private static void print(TreeNode result) {
		if (result.left != null)
			print(result.left);
		System.out.println(result.val);
		if (result.right != null)
			print(result.right);
	}

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode result = null;

		if (t1 != null && t2 != null) {
			result = new TreeNode(t1.val + t2.val);
			result.left = mergeTrees(t1.left, t2.left);
			result.right = mergeTrees(t1.right, t2.right);
		} else if (t1 != null && t2 == null) {
			result = new TreeNode(t1.val);
			if (t1.left != null) {
				result.left = mergeTrees(t1.left, null);
			}
			if (t1.right != null) {
				result.right = mergeTrees(t1.right, null);
			}
		} else if (t1 == null && t2 != null) {
			result = new TreeNode(t2.val);
			if (t2.left != null) {
				result.left = mergeTrees(t2.left, null);
			}
			if (t2.right != null) {
				result.right = mergeTrees(t2.right, null);
			}
		} else {
			return result;
		}

		return result;
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
