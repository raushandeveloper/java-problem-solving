import java.util.Scanner;
public class Main {
    public static void main(String[] args) {  // The main() method is the entry point into the application.
//        // write your code here
//        System.out.print("Hello World");
//    }
//}

//NAMING CONVENTIONS
// 1. For CLASs we use PascalConvention --> AddTwoNumber
// 2. For fUNCTION we can use camelCaseConvention --> addTwoNumber

// VARIABLES :- A variables is a container that stores a value. This value can be changed during the execution of the program.

// DATA TYPs :- Data typS are two typS in java.
// I. PRIMITIVE DATA TYPs :- There are 8 primitive data typS supported by Java.
//    1. byte :- takes 1 byte
//    2. short :- takes 2 byte
//    3. int :- takes 4 byte
//    4. float :- takes 4 byte
//    5. long :- takes 8 byte
//    6. double :- takes 8 byte
//    7. char :- takes 2 byte
//    8. boolean :- size depends on ,  value is false/true

// II. NON-PRIMITIVE DATA TYPS


//Q1.write a java program to add three number

        System.out.print("Sum of three number: ");
        int num1,num2,num3,sum;
        num1 = 5;
        num2 = 7;
        num3 = 10;
        sum = num1+num2+num3;
        System.out.println(sum);

// KEYWORDS :- Words which are reserved and used by the java compiler.They cannot be used as an identifier.

        System.out.println("Taking input from user: ");  // import java.util.Scanner -->use this then you can take input from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
//        int a = sc.nextInt();  // take input integer value by user
        float a = sc.nextFloat();  // take input float value by user
        System.out.print("Enter number2: ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
//        int add = a+b;  //sum of integer value
        float add = a+b;  //sum of float value
//
        System.out.println("The sum of these number is: "+add);

        sc.nextLine();
        System.out.print("Enter the your name: ");
        String str = sc.nextLine();  // take string input
        System.out.println(str);

        System.out.print("Enter the any number: ");
        boolean b1 = sc.hasNextInt();  // check the given number in integer or not
        System.out.println(b1);  // print true or false
    }
}