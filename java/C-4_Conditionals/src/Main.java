import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

//        LOGICAL operator :-and operator(&&) , or operator(||) , not operator(!)
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
//        AND OPERATOR(&&) :- both are true then return true else return false.
        System.out.print("True && True :- ");
        System.out.println(a && b);
        System.out.print("True && False :- ");
        System.out.println(a && c);
        System.out.print("False && True :- ");
        System.out.println(c && b);
        System.out.print("False && False :- ");
        System.out.println(c && d);

//        OR OPERATOR(||) :- both are flase then return false else return true.
        System.out.print("\nTrue || True :- ");
        System.out.println(a || b);
        System.out.print("True || False :- ");
        System.out.println(a || c);
        System.out.print("False || True :- ");
        System.out.println(c || b);
        System.out.print("False || False :- ");
        System.out.println(c || d);

//        NOT OPERATOR(!) :- not operator convert true into false and false into true.
        System.out.print("\nnot true (!true) :- ");
        System.out.println(!a);
        System.out.print("not false (!false)");


        System.out.println(!c);
//        if statement :-
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :- ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Yes you can drive!");
        }
        else{
            System.out.println("No you can not drive!");
        }
        System.out.print("Enter you age :- ");
        int age1 = sc.nextInt();
        if(age1>59){
            System.out.println("You are experienced!");
        }
        else if(age1>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age1>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }

//        Switch STATEMENT:-    (without using brake statement.
        System.out.print("Enter the number between 1 to 7 :- ");
        int dau = sc.nextInt();
        switch(dau){    // without using brake statement.
            case(1) ->
                    System.out.println("Monday");
            case(2) ->
                    System.out.println("Tuesday");
            case(3)->
                    System.out.println("Wednesday");
            case(4) ->
                    System.out.println("Thursday");
            case(5) ->{                    // for multiple statement print used curly bracket.
                System.out.println("Friday");
            }
            case(6) ->{
                System.out.println("Saturday");
            }
            case(7) ->{
                System.out.println("Sunday");
            }

            default ->
                    System.out.println("Try Again!");
        }
    }
}
