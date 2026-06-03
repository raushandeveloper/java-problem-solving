import java.util.Scanner;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Factorial generator \n");
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of your number: "+factorial(num));
    }
    static long factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * (factorial(n-1));
    }
}

//1. Self-Calling Function: Recursion is when a function calls itself.
//2. Base Case: Essential to stop recursion and prevent infinite loops.
//3. Recursive Case: The part where the function makes a recursive call.
//4. Stack Overflow Risk: Excessive recursion can cause stack overflow errors.
//5. Problem Solving: Ideal for problems divisible into similar, smaller problems.
