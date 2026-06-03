package LinkedList;

class Node{  // user defined data type
    int val;
    Node next; // default Null

    Node(int val){
        this.val =val;
    }
    Node(){}
}

class Linkedlist{ // user defined data structure
    Node head; //null
    Node tail; //null
    int size;
    void addAtHead(int val) {
     Node temp = new Node(val);
     if(head == null) head = tail = temp;
     else{
         temp.next = head;
         head = temp;
     }
     size++;
    }
    void deleteAtHead(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        size--;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        if(head == null) return;
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int get(int idx){
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void insert(int val, int idx) {
        if(idx<0 || idx>size){
            System.out.println("Invalid Index!");
        }
        else if(idx == 0) addAtHead(val);
        else if (idx==size) {
            addAtTail(val);
        }
        else {
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
  }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next; // delete
        if(idx == size-1) tail = temp; // we are deleting tail
        size--;
    }
}

public class LinkedListDataStructure {
    static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addAtTail(10);
        l1.addAtTail(20);
        l1.addAtTail(30);
        l1.addAtTail(40);
        l1.addAtTail(50);
        l1.display();
        l1.addAtHead(60);
        l1.display();
        l1.deleteAtHead();
        l1.display();
        System.out.println(l1.size);
        l1.insert(45,2);
        l1.display();
        System.out.println(l1.get(4));
        l1.delete(2); l1.display();
    }
}
