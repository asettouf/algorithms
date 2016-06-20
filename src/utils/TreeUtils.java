package utils;

import datastructs.TreeNode;

public class TreeUtils {

	private TreeUtils(){
		
	}
	
	public static void inorderTreeWalk(TreeNode x){
		if (x != null){
			inorderTreeWalk(x.getLeft());
			System.out.println(x.getKey());
			inorderTreeWalk(x.getRight());
		}
	}
	
	public static TreeNode treeSearch(TreeNode x, int k){
		if (x == null || k == x.getKey()){
			return x;
		}
		if (k < x.getKey()){
			return treeSearch(x.getLeft(), k);
		} else{
			return treeSearch(x.getRight(), k);
		}
	}
	
	public static TreeNode treeMin(TreeNode root){
		while(root.getLeft() != null){
			root = root.getLeft();
		}
		return root;
	}
	
	public static TreeNode treeMax(TreeNode root){
		while(root.getRight() != null){
			root = root.getRight();
		}
		return root;
	}
	
	public static TreeNode treeSuccessor(TreeNode x){
		if(x.getRight() != null){
			return treeMin(x.getRight());
		}
		TreeNode y = x.getParent();
		while (y != null && x == y.getRight()){
			x = y;
			y = y.getParent();
		}
		return y;
	}
}
