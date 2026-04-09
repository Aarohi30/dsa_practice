package src;

public class MaxDepthBinTree {
 static class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left = left;
        this.right=right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        // root.right.right = new TreeNode(7);
        // root.right.right.right = new TreeNode(20);
        int maxDepth = maxDepth(root);
        System.out.println(maxDepth);
    }
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        int height = 1 + Math.max(lh,rh);

        return height;
    }
 }   
}
