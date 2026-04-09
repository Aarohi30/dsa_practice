package src;

public class InvertBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        //5 3 1 7 11
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(11);
        root.right.left = new TreeNode(6);
          // 5
        // 3   7
       //1     11

        //print tree
        printTree(root);

        //inverted tree
        //  5
       //7    3
      //11     1
      TreeNode invertedRoot = invertTree(root);
      System.out.println("");
      printTree(invertedRoot);

    }

    public static void printTree(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);

    }

    public static TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        //swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    
}
