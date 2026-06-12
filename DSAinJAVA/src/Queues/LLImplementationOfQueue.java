package Queues;

public class LLImplementationOfQueue {
    public static void main(String[] args) {

        MYQueue q = new MYQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.display();
        System.out.println(q.remove());
        q.display();
    }
}