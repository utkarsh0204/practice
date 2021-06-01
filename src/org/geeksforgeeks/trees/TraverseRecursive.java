package org.geeksforgeeks.trees;

public class TraverseRecursive {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		TraverseRecursive obj = new TraverseRecursive();
		System.out.println("Inorder-->");
		obj.printInOrder(root);
		System.out.println();
		System.out.println("Preorder-->");
		obj.printPreOrder(root);
		System.out.println();
		System.out.println("Postorder-->");
		obj.printPostOrder(root);
		System.out.println();
	}

	public void printInOrder(Node node) {
		if (node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}

	public void printPreOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.key + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

	public void printPostOrder(Node node) {
		if (node == null) {
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key + " ");
	}
}
