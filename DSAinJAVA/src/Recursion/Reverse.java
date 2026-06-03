package Recursion;
import java.util.Scanner;

public class Reverse {
    public static int reverse(int n, int r){
        if(n==0) return r;
        return reverse(n/10, r*10+n%10);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
//        int r = 0;
//        while(n!=0){
//           r*= 10;
//           r += (n%10);
//           n /= 10;
//        }
//        System.out.print(r);
        System.out.print("Your reverse no is:");
        System.out.println(reverse(n,0));
    }
}
