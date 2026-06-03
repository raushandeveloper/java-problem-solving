package Recursion;

import java.util.Scanner;

public class Factorialwithoutrecursion {
    static void main() {
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=n; i++){
            ans = ans * i;
        }
        System.out.println("Factorial of "+ n+" is :"+ ans);
    }
}
