package datastructs;

public class TreeNode {
	
	private TreeNode parent;
	private TreeNode left;
	private TreeNode right;
	private int key;
	
	
	public TreeNode(TreeNode parent, TreeNode left, TreeNode right, int key) {
		super();
		this.parent = parent;
		this.left = left;
		this.right = right;
		this.key = key;
	}

	public TreeNode(TreeNode left, TreeNode right, int key) {
		super();
		this.left = left;
		this.right = right;
		this.key = key;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
	
		return "Key: " + this.getKey();
	}
	
	

}
