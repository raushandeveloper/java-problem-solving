package Recursion;

public class FunctionCallingitself {
    static void main(String[] args) {
        ajay(1);
    }
    public static void ajay(int n){
        if(n==10) return;
        System.out.println("Priya");
        ajay(n+1);
    }
}
