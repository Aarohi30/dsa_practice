package src;

public class CreateBST {
    public static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 3);
        insert(root, 7);
        insert(root, 12);
        insert(root, 18);

        System.out.println("Inorder traversal of the BST:");
        inorderTraversal(root);
    }

    public static void insert(TreeNode root, int key) {
        if (key < root.data) {
            if (root.left == null) {
                root.left = new TreeNode(key);
            } else {
                insert(root.left, key);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(key);
            } else {
                insert(root.right, key);
            }
        }
    }

    public static void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }
}
