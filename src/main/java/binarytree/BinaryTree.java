/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Vihan De Silva
 */
public class BinaryTree {

	Node root;
	
	/**
	 * 
	 * Traverses the Binary Tree and adds a value to a new node.
	 * Traversal begins at the root node when root node is provided as parameter.
	 * @param Node current
	 * @param int value
	 * @return Node node
	 */
	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.data) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.data) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	/**
	 * 
	 * Returns true if a node with the given value exists in the tree.
	 * The root node of the tree is provided as the parameter and this is where traversal begins.
	 * @param Node current
	 * @param int value
	 * @return boolean containsNode
	 */
	private boolean containsNodeRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.data) {
			return true;
		}
		return value < current.data ? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}
		
	/**
	 * 
	 * Specifies whether the tree is height balanced. 
	 * Root node is provided as the parameter.
	 * Returns true if the tree is balanced
	 * @param Node node
	 * @return boolean isBalanced
	 */
	public boolean isBalanced(Node node) {
		int lh; /* for height of left subtree */

		int rh; /* for height of right subtree */

		/* If tree is empty then return true */
		if (node == null)
			return true;

		/* Get the height of left and right sub trees */
		lh = height(node.left);
		rh = height(node.right);

		if (Math.abs(lh - rh) <= 1 && isBalanced(node.left) && isBalanced(node.right))
			return true;

		/*
		 * If we reach here then tree is not height-balanced
		 */
		return false;
	}

	/**
	 * The function Compute the "height" of a tree. Height is the number of nodes
	 * along the longest path from the root node down to the farthest leaf node.
	 * @param Node node
	 * @return int height
	 */
	private int height(Node node) {
		/* base case tree is empty */
		if (node == null)
			return 0;

		/*
		 * If tree is not empty then height = 1 + max of left height and right heights
		 */
		return 1 + Math.max(height(node.left), height(node.right));
	}

}
