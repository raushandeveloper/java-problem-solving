package Oops;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import java.util.Scanner;

public class UserDefinedDataType {
    Scanner sc = new Scanner(System.in);
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Suhani";
        s1.rno = 36;
        s1.cgpa = 7.2;

        Student s2 = new Student();
        s2.name = "Raushan";
        s2.rno = 52;
        s2.cgpa = 6.9;

        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa);
        System.out.println(s2.name+" "+s2.rno+" "+s2.cgpa);
    }

}
