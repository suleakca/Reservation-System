package com.structures.tree;
import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	public String data;
	private TreeNode parent;
	//public ArrayList<TreeNode1> Children;
	private ArrayList<TreeNode> children;
	
	
	public TreeNode(String data){
		this.setData(data);
		children = new ArrayList<TreeNode>();
	}
	public TreeNode(){
		children = new ArrayList<TreeNode>();
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	public ArrayList<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<TreeNode> children) {
		this.children = children;
	}

	
	
	
	
	
	
	
	
	
	
	
	/*public TreeNode1 leftChild;
	public TreeNode1 rightChild;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public TreeNode1 getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode1 leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode1 getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode1 rightChild) {
		this.rightChild = rightChild;
	}*/
	
	
	
	
}
