public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] data = {20, 17, 12, 14, 27, 9, 23, 20, 21, 27};

        System.out.println("Memasukkan elemen ke BST:");
        for (int i : data) {
            System.out.print("Insert " + i + ": ");
            tree.insert(i);
            tree.inorder();
            System.out.println();
        }
    }
}
