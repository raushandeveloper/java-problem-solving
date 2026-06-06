package Stacks;

import java.util.Stack;

public class PushAtBottom {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        int ele = 50;

        System.out.println("Original Stack: " + st);

        pushAtBottom(st, ele);
        System.out.println("After pushing at bottom: " + st);

        reverse(st);
        System.out.println("After reversing: " + st);
    }

    // Reverse stack using recursion
    private static void reverse(Stack<Integer> st){
        if(st.size() <= 1) return;

        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }

    // Push element at bottom
    private static void pushAtBottom(Stack<Integer> st, int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, ele);
        st.push(top);
    }
}