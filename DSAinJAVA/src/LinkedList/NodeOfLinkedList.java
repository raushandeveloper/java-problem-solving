package LinkedList;

public class NodeOfLinkedList {
    static void main(String[] args) {
     // 10 20 30 40 50
//        Node a = new Node(); a.val=10;
//        Node b = new Node(); b.val=20;
//        Node c = new Node(); c.val=30;
//        Node d = new Node(); d.val=40;
//        Node e = new Node(); e.val=50;
        Node a = new Node(10); //head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        System.out.println(a.val);

        //Connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next = null; //default
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.next);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
        System.out.println(a.next.next.next.val);
    }
}
