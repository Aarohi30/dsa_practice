import java.util.ArrayList;

public class LCAProb {
    static class Node
    {
        int data;
        Node left, right;
        Node(int item)
        {
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
        root.right.right = new Node(6);

        
        Node lca = findLCA(root, 4, 5);
        if (lca != null) {
            System.out.println("LCA of 4 and 5 is: " + lca.data);
        } else {
            System.out.println("LCA not found.");   
        }

        Node lca2 = lca(root, 4,5);
        if (lca2 != null) {
            System.out.println("LCA2 of 4 and 5 is: " + lca2.data);
        } else {
            System.out.println("LCA2 not found.");   
        }
    }   

    private static LCAProb.Node findLCA(LCAProb.Node root, int i, int j) {
        if (root == null) {
            return null;
        }
        if (root.data == i || root.data == j) {
            return root;
        }

        Node leftLCA = findLCA(root.left, i, j);
        Node rightLCA = findLCA(root.right, i, j);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2){
        System.out.println("---LCA 2nd called---");
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    }