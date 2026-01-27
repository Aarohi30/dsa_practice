package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTreeProblem {
    public static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }

    class Pair {
        TreeNode node;
        int hd; // horizontal distance

        public Pair(TreeNode n, int h) {
            node = n;
            hd = h;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);  
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        TopViewOfBinaryTreeProblem tree = new TopViewOfBinaryTreeProblem();
        List<Integer> topView = tree.topView(root);
        System.out.println("Top view of the binary tree: " + topView);
    }
        
    
    public List<Integer> topView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Map<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            TreeNode node = temp.node;
            int hd = temp.hd;

            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.data);
            }

            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        for (Integer value : topViewMap.values()) {
            result.add(value);
        }

        return result;
    }
}
