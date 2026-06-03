import java.util.Scanner;
public class practice_set_1 {
    public static void main(String[] args) {

//Q1. Write a program to sum three number in java.
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,sum;
        System.out.print("Enter the 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        num2 = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        num3 = sc.nextInt();
        sum = num1+num2+num3;

        System.out.println("Sum of given number is: "+sum);


//Q2. Write a program to calculate the CGPA using marks of the 3 subject (out of 100).
//        float m_marks, h_marks, e_marks,cgpa;
//        System.out.print("Enter the Maths marks out of 100: ");
//        m_marks = sc.nextInt();
//        System.out.print("Enter the Hindi marks out of 100: ");
//        h_marks = sc.nextInt();
//        System.out.println("Enter the English marks out of 100: ");
//        e_marks = sc.nextInt();
//        cgpa = (m_marks+h_marks+e_marks)/30;
//        System.out.println("CGPA: "+cgpa);


//Q3. Write a program which asks the user to enter his/her name and great them with "Hello <name>, have a good day" text.
//        System.out.print("Enter you full name: ");
//        String name = sc.nextLine();
//        System.out.println("Hello "+name+", have a good day.");


//Q4. Write a java program to convert kilometer to mile.
//        System.out.print("Enter the distance in km: ");
//        float km = sc.nextInt();
//        double mile = km * 0.621371;
//        System.out.println("Distance in mile: "+ mile);


//Q5. write a java program to detect whether a number enter by the user is integer or not.
//        System.out.print("Enter the number: ");
//        boolean num = sc.hasNextInt();
//        System.out.println(num);
    }
}
