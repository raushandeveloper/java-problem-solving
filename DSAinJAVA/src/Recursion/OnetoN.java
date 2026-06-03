package Recursion;

import java.util.Scanner;

public class OnetoN {
    static void main(String[] args) {
        System.out.print("Enter your number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1) System.out.print(n+" ");
    }




//    public static void print(int x, int n){
//        if(x>n)return;
//        System.out.print(x+" ");
//        print(x+1,n);
//    }
}
