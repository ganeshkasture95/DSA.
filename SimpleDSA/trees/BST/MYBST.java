
package SimpleDSA.trees.BST;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// Class for Binary Search Tree operations
class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Function to insert a node into the BST
    public Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);
        if (value < node.data)
            node.left = insert(node.left, value);
        else if (value > node.data)
            node.right = insert(node.right, value);
        return node;
    }

    // Function to perform inorder traversal of the BST
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Function to perform preorder traversal of the BST
    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Function to perform postorder traversal of the BST
    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Function to search for a key in the BST
    public boolean search(Node node, int key) {
        if (node == null)
            return false;
        if (node.data == key)
            return true;
        else if (key < node.data)
            return search(node.left, key);
        else
            return search(node.right, key);
    }
}

public class MYBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Creating a BST of N Integers
        int[] elements = { 6, 9, 5, 2, 8, 15, 24, 14, 7, 8, 5, 2 };
        int n = elements.length;
        for (int i = 0; i < n; i++)
            bst.root = bst.insert(bst.root, elements[i]);

        // Traversing the BST in Inorder, Preorder, and Postorder
        System.out.print("Inorder Traversal: ");
        bst.inorderTraversal(bst.root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        bst.preorderTraversal(bst.root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        bst.postorderTraversal(bst.root);
        System.out.println();

        // Searching the BST for a given element (KEY)
        int keyToSearch = 14;
        if (bst.search(bst.root, keyToSearch))
            System.out.println(keyToSearch + " found in the BST.");
        else
            System.out.println(keyToSearch + " not found in the BST.");
    }
}