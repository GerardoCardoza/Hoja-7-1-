// Hoja de Trabajo #7
// Grupo # 5 
// Luis Sierra, 131074
// Roberto Giron
// Gerardo Cardoza

import java.util.*;

public class BinaryTree<E> {

	Node root;

	public void addNode(E key, E name) {

		Node newNode = new Node(key, name);

		if (root == null) {

			root = newNode;

		} else {

			Node focusNode = root;

			Node parent;

			while (true) {

				parent = focusNode;

				if (key.toString().compareTo(focusNode.key.toString()) < 0) {

					focusNode = focusNode.leftChild;

					if (focusNode == null) {

						parent.leftChild = newNode;
						return; 

					}

				} else { 

					focusNode = focusNode.rightChild;

					if (focusNode == null) {

						parent.rightChild = newNode;
						return; 

					}

				}

			}
		}

	}

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			inOrderTraverseTree(focusNode.leftChild);

			System.out.println(focusNode);

			inOrderTraverseTree(focusNode.rightChild);

		}

	}

	public void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			System.out.println(focusNode);

			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);

		}

	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);

			System.out.println(focusNode);

		}

	}

	public Node findNode(E key) {

		Node focusNode = root;

		while (!focusNode.key.toString().equalsIgnoreCase(key.toString())) {

			if (key.toString().compareTo(focusNode.key.toString()) < 0) {

				focusNode = focusNode.leftChild;

			} else {

				focusNode = focusNode.rightChild;
			}

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}
        
        public String findName(String key) {

		Node focusNode = root;

		while (!focusNode.key.toString().equalsIgnoreCase(key)) {

			if (key.compareTo(focusNode.key.toString()) < 0) {
				focusNode = focusNode.leftChild;
			} else {

				focusNode = focusNode.rightChild;
			}
			if (focusNode == null)
				return null;

		}

		return focusNode.name.toString();

	}

}

class Node<G> {

	G key;
	G name;

	Node leftChild;
	Node rightChild;

	Node(G key, G name) {
            
		this.key = key;
		this.name = name;
                
	}

	public String toString() {

		return name + " has the key " + key;
	}
}
