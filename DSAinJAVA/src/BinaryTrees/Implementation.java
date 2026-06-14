package BinaryTrees;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class Implementation {
    public static void main(String[] args) {

        // Direct root only
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.left = f;c.right = g;

        // Sirf root print hoga
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
    }

    private static int size(Node root){
        if(root == null) return 0;
        int leftsize = size(root.left);
        int rightsize = size(root.right);
        return 1 + leftsize + rightsize;
    }

    private static int sum(Node root){
        if(root == null) return 0;
        int leftsize = sum(root.left);
        int rightsize = sum(root.right);
        return root.val + leftsize + rightsize;
    }

    private static int product(Node root){
        if(root == null) return 1;
        int leftsize = product(root.left);
        int rightsize = product(root.right);
        return root.val * leftsize * rightsize;
    }

    public static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}


