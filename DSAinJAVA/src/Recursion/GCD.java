package Recursion;

import java.util.Scanner;

public class GCD {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int a = sc.nextInt();
        System.out.print("Enter your second number:");
        int b = sc.nextInt();
        int hcf =1;
        for(int i=2; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.print("your HCf is:" + hcf);
    }
}
