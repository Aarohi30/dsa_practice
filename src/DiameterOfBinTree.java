package src;

public class DiameterOfBinTree {
    static int diameter = 0;
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode leftLeft = new TreeNode(5);
        TreeNode leftRight = new TreeNode(4);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.left.left = leftLeft;
        root.left.right = leftRight;
        //root.left.right.right = new TreeNode(6);
        //root.left.right.right.right = new TreeNode(7);
        root.right = right;
        diameter(root);
        System.out.println("diameter is ::: "+diameter);
    }

    

    public static int diameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        int height = 1+ Math.max(lh , rh);
        diameter = Math.max(diameter, (1+lh+rh));
        return height;
    }

    
    
}