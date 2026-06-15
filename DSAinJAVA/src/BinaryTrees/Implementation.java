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
        //       3
        //      /  \
        //     4    2
        //    / \  / \
        //  -1   1 6  9

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
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(levels(a));
    }

    private static int levels(Node root){
       if(root == null) return 0;
       return 1+Math.max(levels(root.left),levels(root.right));
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
    private static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}


