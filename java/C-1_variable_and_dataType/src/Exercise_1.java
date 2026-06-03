// Q1. Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subject must be taken as input from the keyword.(Marks are out of 100).

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        int M_marks,E_marks,H_marks,P_marks,C_marks,Total,percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the percentage of 5 subject: ");
        System.out.print("Enter the maths marks: ");
        M_marks = sc.nextInt();
        System.out.print("Enter the english marks: ");
        E_marks = sc.nextInt();
        System.out.print("Enter the hindi marks: ");
        H_marks = sc.nextInt();
        System.out.print("Enter the physics marks: ");
        P_marks = sc.nextInt();
        System.out.print("Enter the chemistry marks: ");
        C_marks = sc.nextInt();

        Total = M_marks+E_marks+H_marks+P_marks+C_marks;
        System.out.println("Total marks: "+ Total);

        percentage = Total/5;
        System.out.println("Percentage: "+ percentage+"%i");
    }
}
