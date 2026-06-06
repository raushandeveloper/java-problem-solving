package Stacks;
import java.util.Stack;

public class BasicSTLofStack {
    static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("khushi");
        st.push("preet");
        st.push("Rishika");
        st.push("Prayas");
        System.out.println(st.size());
        System.out.println(st); // A.S. = O
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost element then removes it

    }
}
