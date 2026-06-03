import java.util.Scanner;

public class Main{
    public static void main(String[] args){

//        LOOP :- Loop male it easy for us to tell the computer that a give set of instructions need oto be executed repeatedly.
//        TYPES OF LOOP :-
//        1. while loop
//        2. do while loop
//        3. for loop

//        1. while loop:- while loop is an entry controlled loop. This means the condition is checked first, and only if it is true, the loop body will execute.
        Scanner sc = new Scanner(System.in);
        System.out.println("While loop :- ");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int i =1;
        while(i < 11){
            System.out.println(num*i);
            i++;
        }
//        Write a program to print natural numbers form 100 to 120.
        System.out.println("printing a natural number from 100 to 120");
        int num1 = 100;
        while(num1<121){
            if(num1%2 == 0){
                System.out.println(num1);
            }
            num1++;
        }

//       2. Do While Loop:- do while loop is an exit controlled loop. The do while loop executes first, and them the condition is checked after the execution.
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while(b<5);

//        Quick Quiz: Write a program to print first n natural numbers using do-while loop.
        System.out.println("Printing the natural number");
        System.out.print("Enter the number: ");
        int inpNUM = sc.nextInt();
        int number =1;
        do{
            System.out.println(number);
            number++;
        }while(number<=inpNUM);

//       3. FOR LOOP:- for loop is usually used to execute a piece of code for specific number of times.

//        Quick Quiz:- Write a program to print first n odd numbers using a for loop.
        System.out.println("Printing a odd number");
        System.out.print("Enter the number: ");
        int odd = sc.nextInt();
        for(int j=1; j<=odd; j++){
            if(j%2 !=0){
                System.out.println(j);
            }
        }
//        Decrementing for loop:-
        System.out.println("Decrementing for loop:");
        for(int k=5;k>=0;k--){
            System.out.println(k);
        }

//        BREAK STATEMENT:- break statement is used to exit the oop irrespective of whether the condition is true pr false.
        System.out.println("break statement");
        for(int z=0;z<10;z++){
            System.out.println(z);
            System.out.println("Java is great");
            if(z==5){
                System.out.println("Ending the loop");
                break;
            }
        }
//        CONTINUE STATEMENT: continue statement is used to immediately move to the next iteration of the loop.Thus skipping everything below "continue" inside the loop for that iteration.
        for(int n=1;n<5;n++){
            if(n==2){
                System.out.println("Continue");
                continue;
            }
            System.out.println(n);
            System.out.println("Java is great");
        }
    }
}
