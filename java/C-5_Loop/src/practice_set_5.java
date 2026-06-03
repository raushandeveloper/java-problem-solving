import java.util.Scanner;

public class practice_set_5 {
    public static void main(String[] args){
//        Q1.Write a program to print the following pattern.
//        * * * *
//        * * *
//        * *
//        *
//        M-1:-
//        for(int i=0; i<4; i++){
//            for(int j=0; j<4-i; j++){
//                System.out.print(" *");
//            }
//            System.out.print("\n");
//        }
//        M-2:-
//        int i = 0;
//        while(i<4){
//            for(int j=0; j<4-i; j++){
//                System.out.print(" *");
//            }
//            System.out.print("\n");
//            i++;
//        }
//        M-3
        int i = 0;
        while(i<4){
            int j=0;
            while(j<4-i){
                System.out.print(" *");
                j++;
            }
            System.out.print("\n");
            i++;
        }

//        Q2. Write a program to sun first n even numbers using while loop.
//        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number,num1,sum=0;
        number = sc.nextInt();
        num1 = 0;
        while(num1 < number){
            sum += (2*num1);
            num1++;
        }
        System.out.println("Sum of even number: "+sum);

//         Q3. Write a program to print multiplication table of a given number n.
        System.out.print("Enter the table number: ");
        int table = sc.nextInt();
        for(int a=1; a<11; a++){
            System.out.printf("%d x %d = %d \n",table,a,table*a);
        }

//        Q4. Write a program to print multiplication table of 10 in reverse order.
        for(int b=10; b>0; b--){
            System.out.printf("%d x %d = %d \n",table,b,table*b);
        }

//        Q5.Write a program to find factorial of a given number using for loops.
        System.out.println("Finding factorial using for loop");
        System.out.print("Enter the number for finding the factorial: ");
        int factnum,factorial =1;
        factnum = sc.nextInt();//5
        for(int c=1; c<=factnum; c++){
            if(factnum == 0){
                factorial = 1;
            }
            else{
                factorial *= c;
            }
        }
        System.out.printf("Factorial of %d = %d \n",factnum,factorial);

//        Q6. Find factorial using while loop.
        System.out.println("Finding factorial using while loop.");
        int factNum, fact = 1;
        System.out.print("Enter the number for finding the factorial: ");
        factNum = sc.nextInt(); //5
        int d = 1;
        while(d<=factNum){
            if(factNum == 0){
                fact = 1;
            }
            fact *= d;
            d++;
        }
        System.out.printf("Factorial of %d = %d \n",factNum,fact);

//        Q7. Write a program to calculate the sum of the numbers accuring in the multiplication fable of 8.
        System.out.println("Finding the sum of the table.");
        System.out.print("Enter the table number: ");
        int table1,sumTable=0;
        table1 = sc.nextInt();
        for(int x=1; x<11; x++){
            sumTable += table1*x;
        }
        System.out.println("Some of the table is: "+sumTable);
    }
}
