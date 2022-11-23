package binarytree;

public class Main {
	
	 public static void main(String[] args) {
	        BinaryTree binaryTree = new BinaryTree();
	        binaryTree.add(1);
	        binaryTree.add(2);
	        binaryTree.add(3);
	        binaryTree.add(4);
	        
	        System.out.println(String.format("Is Binary Search Tree balanced: %b", binaryTree.isBalanced(binaryTree.root)));
	 }
}
