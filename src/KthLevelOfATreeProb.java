package src;

import org.w3c.dom.Node;

public class KthLevelOfATreeProb {

    static class Node {
        int data;
        Node left, right;   
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 3;
        System.out.println("Nodes at level " + k + ": ");
        printKthLevel(root, k, 1);
        
    }

    private static void printKthLevel(src.KthLevelOfATreeProb.Node root, int k, int level) {
        if (root == null) {
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        printKthLevel(root.left, k, level+1);
        printKthLevel(root.right, k, level+1);
    }
}