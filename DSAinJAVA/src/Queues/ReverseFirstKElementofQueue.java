import java.util.*;

    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if (k > n) return q;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);

        reverseFirstK(q, 3);

        System.out.println(q);
    }
