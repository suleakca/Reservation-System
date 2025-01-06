package com.structures.tree;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree{

	private TreeNode root;

	public Tree(String rootData){
		root = new TreeNode();
		root.data = rootData;
		//root.Children = new ArrayList<TreeNode1>();


	}
	
	
	
	public TreeNode getRoot() {
		return root;
	}



	public void setRoot(TreeNode root) {
		this.root = root;
	}



	public Tree(){
		
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		TreeNode node = new TreeNode();
		node.setData("suite");
		tree.setRoot(node);
		tree.getRoot().getChildren().add(new TreeNode("Spa"));
		tree.getRoot().getChildren().add(new TreeNode("Double beds"));
		tree.getRoot().getChildren().add(new TreeNode("Internet"));

		

	}





































	/*	private TreeNode1 root;

	public Tree(){
		DefaultMutableTreeNode otel = new DefaultMutableTreeNode("Spa");
		DefaultMutableTreeNode otel1 = new DefaultMutableTreeNode("Sport");
		DefaultMutableTreeNode otel2 = new DefaultMutableTreeNode("Double Room");
		DefaultMutableTreeNode otel3 = new DefaultMutableTreeNode("Suite");		
		otel.add(otel1);
		otel.add(otel2);
		otel.add(otel3);

		DefaultMutableTreeNode model = new DefaultMutableTreeNode(otel);
		JTree tree = new JTree(model);
		getContentPane().add(tree);


	}

	public void insert(String newData){
		TreeNode1 newNode = new TreeNode1();
		newNode.data = newData;
		if(root == null)
			root = newNode;
		else{
			TreeNode1 current = root;
			TreeNode1 parent;
			while (true) {
				parent = current;
				current = current.getLeftChild();

			}
		}
	}*/



	/*public static void main(String[] args) {
		/*Tree thetree = new Tree();
		thetree.insert("Sport");
		thetree.insert("Suits");
		thetree.insert("Double Room");*/
}


