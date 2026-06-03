import java.util.Scanner;

public class L_2_Switch_condition {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Day of the week detector \n");
        System.out.print("Enter the number between 1 to 7:  ");
        int num = sc.nextInt();
        switch (num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6,7 -> System.out.println("Holiday");
            default -> System.out.println("Invalid input. Try again:");
        }
        String output = switch(num){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6,7 -> "Holiday";
            default -> "Invalid";
        };
        System.out.println(output);
    }
}
