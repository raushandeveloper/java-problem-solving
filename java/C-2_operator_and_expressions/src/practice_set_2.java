import java.util.Scanner;
public class practice_set_2 {
    public static void main(String[] args) {

//        Q1. What will be the result of the following expression float a = 7 / 4 * 9 / 2.
        float a = 7 / 4 * 9 / 2;
        /*
                 1 * 9 / 2
                 9 / 2
                 4.0
        */
        System.out.println("Solution of 7 / 4 * 9 / 2 :- "+ a);

//        Q2. write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'A';
        grade = (char)(grade + 8);  // c + i --> int . so we will use typecast to convert int into char.
        System.out.println("Grade:- "+ grade);
//        Decrypting the grade
        grade =(char)(grade - 8);
        System.out.println("After decrypting the grade:- "+ grade);

//        Q3. Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Enter the number:- ");
        num1 = sc.nextInt();
        System.out.println(5>num1);  // true -->yes and fals --> No

//        Q4. Write the following expression iin a java program. (v^2 - u^2)/ (2rs)
        float v,u,r,s,sul;
        System.out.print("Enter the 1st number:- ");
        v = sc.nextFloat();
        System.out.print("Enter the 2nd number:- ");
        u = sc.nextFloat();
        System.out.print("Enter the 3rd number:- ");
        r = sc.nextFloat();
        System.out.print("Enter the 4th number:- ");
        s = sc.nextFloat();
        sul = (v*v - u*u)/(2*r*s);
        System.out.println("Solution of (v^2 - u^2)/ (2rs) expression:- "+ sul);

//        Q5. Find the value of the following expression: 7*49/7+35/7
        int x = 7*49/7+35/7;
        /*
              343/7+35/7
              49+5
              54
        */
        System.out.print("Answer of 7+49/7+35/7 this expression:- "+ x);
    }
}
