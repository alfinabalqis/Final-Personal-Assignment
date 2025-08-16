public class BinarySearchTree {
    NodeBST root;

     public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    private NodeBST insertRec(NodeBST root, int key) {
        if (root == null) {
            root = new NodeBST(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        // If key is equal, it's a duplicate and is not inserted

        return root;
    }

    // Method to perform inorder traversal
    public void inorder() {
        inorderRec(root);
    }

    // A recursive function to do inorder traversal of BST
    private void inorderRec(NodeBST root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}
