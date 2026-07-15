package Day32;

public class BinarySearchTree {

    // The root node is the starting point of the tree.
    Node root;


    // Public method used to insert a new node into the BST.
    public void insert(Node node) {

        // Calls the recursive helper method to find
        // the correct position for the new node.
        root = insertHelper(root, node);
    }


    // Recursive method that places a node in the correct position.
    private Node insertHelper(Node root, Node node) {

        int data = node.data;

        // Base case:
        // If the current position is empty,
        // insert the new node here.
        if (root == null) {

            root = node;
            return root;
        }

        // If the new value is smaller than the current node,
        // move to the left subtree.
        else if (data < root.data) {

            root.left = insertHelper(root.left, node);
        }

        // If the new value is larger,
        // move to the right subtree.
        else {

            root.right = insertHelper(root.right, node);
        }

        // Return the current root node.
        return root;
    }


    // Displays the values stored in the tree.
    public void display() {

        displayHelper(root);
    }


    // Recursive method used to traverse the tree.
    private void displayHelper(Node root) {

        if (root != null) { // Makes the output to be displayed in an ascending order.

            // Visit left subtree.
            displayHelper(root.left);

            // Print current node.
            System.out.println(root.data);

            // Visit right subtree.
            displayHelper(root.right);
        }
    }


    // Public method to search for a value in the tree.
    public boolean search(int data) {

        return searchHelper(root, data);
    }


    // Recursive search method.
    private boolean searchHelper(Node root, int data) {

        // If the tree/subtree is empty,
        // the value does not exist.
        if (root == null) {

            return false;
        }

        // Value found.
        else if (root.data == data) {

            return true;
        }

        // If target is smaller, search the left subtree.
        else if (root.data > data) {

            return searchHelper(root.left, data);
        }

        // If target is larger, search the right subtree.
        else {

            return searchHelper(root.right, data);
        }
    }


    // Removes a node from the BST.
    public void remove(int data) {

        // Check if the value exists before removing.
        if(search(data)) {

            removeHelper(root, data);
        }

        else {

            System.out.println(data + " could not be found");
        }
    }


    // Recursive method that handles node deletion.
    private Node removeHelper(Node root, int data) {

        // Base case:
        // Nothing found.
        if(root == null) {

            return root;
        }

        // Search in the left subtree.
        else if(data < root.data) {

            root.left = removeHelper(root.left, data);
        }

        // Search in the right subtree.
        else if(data > root.data) {

            root.right = removeHelper(root.right, data);
        }


        // Node has been found.
        else {

            // Case 1:
            // Node has no children (leaf node).
            if(root.left == null && root.right == null) {

                root = null;
            }


            // Case 2:
            // Node has a right child.
            // Replace it with its successor.
            else if(root.right != null) {

                // Find the smallest value in the right subtree.
                root.data = successor(root);

                // Remove the duplicate successor node.
                root.right = removeHelper(root.right, root.data);
            }


            // Case 3:
            // Node has only a left child.
            // Replace it with its predecessor.
            else {

                // Find the largest value in the left subtree.
                root.data = predecessor(root);

                // Remove the duplicate predecessor node.
                root.left = removeHelper(root.left, root.data);
            }
        }

        // Return the updated tree.
        return root;
    }


    // Finds the successor node.
    // The successor is the smallest value
    // in the right subtree.
    private int successor(Node root) {

        root = root.right;

        while(root.left != null) {

            root = root.left;
        }

        return root.data;
    }


    // Finds the predecessor node.
    // The predecessor is the largest value
    // in the left subtree.
    private int predecessor(Node root) {

        root = root.left;

        while(root.right != null) {

            root = root.right;
        }

        return root.data;
    }
}