package myPackge;

public class BalancedBinaryTree110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBalanced(TreeNode root) {
		if(root==null) {
			return true;
		}
		
		return returnHeight(root) != -1;
	}
	
	public int returnHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int left = returnHeight(root.left);
		int right = returnHeight(root.right);
		
		if(left ==-1 || right==-1 || Math.abs(left-right)>1) {
			return -1;
		}
		
		if(left< right) {
			return right+1;
		}
		else {
			return left+1;
		}
	}
}
