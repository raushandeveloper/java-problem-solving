import java.util.Scanner;

public class Main {
    static void main() {
        //  OPERATOR:- Operators are used to perform operations on variables and values.
//  TYPES OF OPERATORS:-
//        1.Arithmetic operator :- +,-,*,/,%,++,--
//        2.Assignment operator :- =,+=
//        3.Comparison operator :- ==,>=,<=
//        4.Logical operator :- &&,||,!
//        5.Bitwise operator :- &,|
// --> Arithmetic operators cannot work with booleans % operator can work on float and doubles.

        int a = 4;
        int b = 6 % a; // Modulo operator give remender.
        System.out.print(b);

        System.out.println("6 == 2 :- " + (6 == 2));  //Compression operator give value in true of false
        System.out.println("6 > 2 :- " + (6 > 2));
        System.out.println("6 < 2 :- " + (6 < 2));

//        Logical operator
        System.out.println("6 > 2 && 6 > 1:- " + (6 > 2 && 6 > 1));  // and operator :- both are true
        System.out.println("6 < 2 && 6 > 1:- " + (6 < 2 && 6 > 1));  // and operator :- 1st true and 2nd false
        System.out.println("6 < 2 || 6 > 1:- " + (6 < 2 || 6 > 1));  // or operator
        System.out.println(2&3);
        System.out.println(2|3);

//        PRECEDENCE &  ASSOCIATIVITY
//        PRECEDENCE :- The operators are applied and evaluated based on precedence. For example (+,-) has less precedence compared to (*,/). Hence * and / are evaluated first.
//                      In case we like to change this order we use parenthesis.

//        ASSOCIATIVITY :- Associativity tells the direction of execution of operators . It can either be LEFT ot RIGHT or RIGHT to LEFT.
//        * / i:- Left to Right
//        * - :- Left to Right
//        ++ == :- Right to Left

        int exp1 = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
               30-34/2
               30-17
               13
        */
        System.out.println(exp1);

        int exp2 = 60/5-34*2;
        /*
                  12-34*2
                  12-68
                  -56
        */
        System.out.println(exp2);

//        Q1. How will you write the following expression in Java?\
//        a. (x-y) / 2
/*        Scanner sc = new Scanner(System.in);
        int num1,num2,sul1;
        System.out.print("Enter the 1st number:- ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:- ");
        num2 = sc.nextInt();
        sul1 = (num1 - num2) / 2;
        System.out.println("solution of (x - y)/2 exp:- " + sul1);

//       b. (b^2 - 4ac)/2a
        int num3, num4, num5, sul2;
        System.out.print("Enter the 1st number:- ");
        num3 = sc.nextInt();
        System.out.print("Enter the 2nd number:- ");
        num4 = sc.nextInt();
        System.out.print("Enter the 3rd number:- ");
        num5 = sc.nextInt();
        sul2 = (num4*num4 - 4*num3*num5) / (2*num3);
        System.out.println("solution of (b^2 - 4ac)/2a exp:- " + sul2);

//       c. v^2 - u^2
        int num6,num7,sul3;
        System.out.print("Enter the 1st number:- ");
        num6 = sc.nextInt();
        System.out.print("Enter the 2nd number:- ");
        num7 = sc.nextInt();
        sul3 = num6 * num6 - num7 * num7;
        System.out.println("solution v^2 - u^2 exp:- " + sul3);

//       d. a * b - d
        int num8, num9, num10, sul4;
        System.out.print("Enter the 1st number:- ");
        num8 = sc.nextInt();
        System.out.print("Enter the 2nd number:- ");
        num9 = sc.nextInt();
        System.out.print("Enter the 3rd number:- ");
        num10 = sc.nextInt();
        sul4 = num8 * num9 - num10;
        System.out.println("solution of a * b - d exp:- " + sul4);
 */

//        RESULTING DATA TYPE AFTER ARITHMETIC OPERATION:- Following table summarizes the resulting data types after arithmetic operation on them.
//        R = b + s --> int     (b --> byte)
//        R = c + s --> int     (c --> character)
//        R = c + i --> int     (f --> float)
//        R = s + i --> int     (s --> short)
//        R = l + f --> float   (i --> int)
//        R = i + f --> float   (l --> long)
//        R = l + d --> double
//        R = f + d --> double

//        INCREMENT AND DECREMENT OPERATORS:-
        int number1 = 65;
        int i_1 = number1++;  // First i_1 is assigned number1 (65) then i_1 is increased
        System.out.println("Post Increment Operators:- "+i_1);
        System.out.println("Post Increment Operators:- "+number1);

        int number2 = 55;
        int i_2 = ++number2;  // First i_2 is incremented then i_2 is assigned number2 (56)
        System.out.println("Pre Increment Operators:- "+i_2);
        System.out.println("Pre Increment Operators:- "+number2);

        int number3 = 45;
        int i_3 = number3--;  // First i_3 is assigned number3 (45) then i_3 is decreased
        System.out.println("Post Decrement Operation:- "+i_3);
        System.out.println("Post Decrement Operation:- "+number3);

        int number4 = 35;
        int i_4 = --number4;  // First i_4 in decreased then i_4 is assigned number4 (34 )
        System.out.println("Pre Decrement Operation:- "+i_4);
        System.out.println("Pre Decrement Operation:- "+number4);

//        Q2. What will be the value of the following expression (x).
        int y = 7;
        int x = ++y * 8; // 8 * 8 = 64
        System.out.println("expression ++y * 8 :- "+ x);

        char ch = 'a';  //Increment of character in java.
        System.out.println("Increment character in java:- "+ ++ch);
    }
}