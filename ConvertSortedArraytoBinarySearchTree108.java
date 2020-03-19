
public class ConvertSortedArraytoBinarySearchTree108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null || nums.length==0) {
			return null;
		}
		
		return convertedBST(nums, 0, nums.length-1);
	}
	
	public TreeNode convertedBST(int[] nums, int left, int right) {
		if(right<left) {
			return null;
		}
		
		int mid = (left) + (right-left)/2;
		
		TreeNode node = new TreeNode(nums[mid]);
		
		node.left = convertedBST(nums, left, mid-1);
		node.right = convertedBST(nums, mid+1, right);
		
		return node;
	}
}
