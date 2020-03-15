package myPackge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLevelOrderTraversalTwo107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		
		BinaryTreeLevelOrderTraversalTwo107 main = new BinaryTreeLevelOrderTraversalTwo107();
//		
//		main.levelOrderBottom2(root);
		
		main.levelOrderBottom5(root); 
		
	}

	//my first approach
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			int count = queue.size();
			List<Integer> listOfInteger = new ArrayList<Integer>();
			for(int i=0;i<count;i++) {
				TreeNode node = queue.poll();
				listOfInteger.add(node.val);
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!=null) {
					queue.offer(node.right);
				}
			}
			list.add(listOfInteger);
		}
		
		List<List<Integer>> reversedList = new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--) {
			reversedList.add(list.get(list.size()-i));
		}
		
		return reversedList;
	}
	
	//my second approach
	public List<List<Integer>> levelOrderBottom2(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		if(root==null) {
			return result;
		}
		
		levelOrderBottom2Recursive(root, result, list);
		
		return result;
	}
	
	public void levelOrderBottom2Recursive(TreeNode root, List<List<Integer>> result, List<Integer> list) {
		List<Integer> list2 = new ArrayList<Integer>();
		
		list.add(root.val);
		
		if(root.left!=null) {
			levelOrderBottom2Recursive(root.left, result, list2);
		}
		if(root.right!=null) {
			levelOrderBottom2Recursive(root.right, result, list2);
		}
		
		result.add(list);
	}
	
	//my third approach
//	public List<List<Integer>> levelOrderBottom3(TreeNode root) {
//		
//	}
	
	//my fourth approach : leetcode discuss
	List<List<Integer>> result = new LinkedList();
	public List<List<Integer>> levelOrderBottom4(TreeNode root) {
		if(root==null) {
			return result;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		recurse(queue);
		
		return result;
	}
	
	public void recurse(Queue<TreeNode> queue) {
		List<Integer> list = new LinkedList<Integer>();
		Queue<TreeNode> newQueue = new LinkedList<TreeNode>();
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.remove();
			list.add(node.val);
			
			if(node.left!=null) {
				newQueue.add(node.left);
			}
			if(node.right!=null) {
				newQueue.add(node.right);
			}
		}
		
		if(!newQueue.isEmpty()) {
			recurse(newQueue);
		}
		
		result.add(list);
	}

	//my second approach and second try
	public List<List<Integer>> levelOrderBottom5(TreeNode root) {
		List<List<Integer>> result2 = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		if(root == null) {
			return result2;
		}
		
		queue.add(root);
		
		recurse2(queue, result2);
		
		return result2;
	}
	
	public void recurse2(Queue<TreeNode> queue, List<List<Integer>> result2) {
		List<Integer> list = new LinkedList<Integer>();
		Queue<TreeNode> newQueue = new LinkedList<TreeNode>();
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.remove();
			list.add(node.val);
			
			if(node.left!=null) {
				newQueue.add(node.left);
			}
			if(node.right!=null) {
				newQueue.add(node.right);
			}
		}
		
		if(!newQueue.isEmpty()) {
			recurse2(newQueue, result2);
		}
		
		result2.add(list);
	}
}
