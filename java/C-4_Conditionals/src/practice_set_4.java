import java.util.Scanner;

public class practice_set_4 {
    public static void main(String[] args){
//        Q1. What will be the output of this program:
//        int a = 10;
//        if(a=11)
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");

//        OUTPUT :-  ERROR  because assign the value inside the if statement.

//        Q2.Write a program fo find out whether a student is pass or fail, if it requires total 40%
//           and at least 30% in each subject to pass. Assume 3 subject and take maks as an input from the user.
//        System.out.print("Enter the 1st subject marks :- ");
        Scanner sc = new Scanner(System.in);
//        int java = sc.nextInt();
//        System.out.print("Enter the 2nd subject marks :- ");
//        int c = sc.nextInt();
//        System.out.print("Enter the 3rd subject marks :- ");
//        int python = sc.nextInt();
//
//        float avg = (java+c+python)/3.0f;
//        System.out.println("Your overall percentage is: "+avg);
//        if(avg>=40 && java >= 33 && c >= 33 && python >= 33){
//            System.out.println("Congratulation, You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted");
//        }
//
////        Q3. Calculate income tax paid by an employee to the government as per the slabs mentioned below.
////        Income slab             Tax
////        2.5L - 5.0L             5%
////        5.0L - 10.0L            20%
////        above 10.0L             30%
//
//        System.out.print("Enter you income in Lakhs per annum: ");
//        float income = sc.nextFloat();
//        float tax = 0;
//        if(income<=2.5f){
//            tax = tax+0;
//        }
//        else if(2.5f<income && income<=5f){
//            tax = tax + 0.05f * (income -2.5f);
//        }
//        else if(5f<income && income<=10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax +0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f -5f);
//            tax = tax +0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee is :- "+ tax);
//
////        Q4. Write a java program to find out the day of the week given the number [1 for monday, 2 for tuesday ... and so on!].
//        System.out.print("Enter the number between 1 - 7 : ");
//        int day = sc.nextInt();
//        switch(day){
//            case(1) -> {
//                System.out.println("Monday");
//            }
//            case(2) -> {
//                System.out.println("Tuesday");
//            }
//            case(3) ->{
//                System.out.println("Wednesday");
//            }
//            case(4) ->{
//                System.out.println("Thursday");
//            }
//            case(5) ->{
//                System.out.println("Friday");
//            }
//            case(6)->{
//                System.out.println("saturday");
//            }
//            case(7) ->{
//                System.out.println("sunday");
//            }
//            default -> {
//                System.out.println("Try again");
//            }
//        }

//        Q5.Write a java program to find whether a year entered by the user is a lep year of not.
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
//        if(year%400 == 0){
//            System.out.println("Given year is Leap year!");
//        } else if (year%4 == 0) {
//            System.out.println("Given year is leap year!");
//        }
//        else if(year%100 == 0){
//            System.out.println("Given year is not a leap year!");
//        }
//        else{
//            System.out.println("Given year is not a leap year");
//        }

        if((year%100 != 0 && year%4 == 0) || year%400 == 0){
            System.out.println("Given year is leap year!");
        }
        else{
            System.out.println("Given year is not leap year!");
        }

//        Q6. Write a program to find out the type of website from the url
//        .com -> Commercial website
//        .org -> organization website
//        .in -> indian website
        System.out.println("Enter the website url: ");
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an organization website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website");
        }
    }
}
