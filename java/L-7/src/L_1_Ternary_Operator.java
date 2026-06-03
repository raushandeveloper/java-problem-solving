import java.util.Scanner;

public class L_1_Ternary_Operator {
    public static void main() {
        System.out.println("Welcome to Ternary Operator....");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the 1st number:  ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:  ");
        int num2 = sc.nextInt();
        int greatestNum = num1 > num2 ? num1 : num2;
        System.out.println(greatestNum+" is gratest._.");
    }
}
