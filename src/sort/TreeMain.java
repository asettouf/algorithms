package sort;

import datastructs.TreeNode;
import utils.TreeUtils;

public class TreeMain {

	public static void main(String[] args) {
		TreeNode root = initTree();
//		TreeUtils.inorderTreeWalk(root);
		System.out.println(TreeUtils.treeSearch(root, 0));
	}
	
	public static TreeNode initTree(){
		TreeNode parent = new TreeNode(null, null, null, 6);
		TreeNode node1 = new TreeNode(parent, null, null, 5);
		node1.setParent(parent);
		TreeNode node2 = new TreeNode(node1, null, null, 2);
		TreeNode node3 = new TreeNode(node1, null, null, 5);
		node1.setLeft(node2);
		node1.setRight(node3);
		TreeNode node4 = new TreeNode(parent, null, null, 7);
		TreeNode node5 = new TreeNode(node4, null, null, 8);
		node4.setRight(node5);
		parent.setLeft(node1);
		parent.setRight(node4);
		return parent;
	}

}
