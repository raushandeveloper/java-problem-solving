package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int ans = n*fact(n-1);
            return ans;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int n = sc.nextInt();
        Factorial obj = new Factorial();
        System.out.println("Factorial of "+n+" is :"+obj.fact(n));
    }
}
