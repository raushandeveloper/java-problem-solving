import java.util.Scanner;

public class palimdrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        int reminder;
        while(num!=0){
            reminder = num%10;
            reverse = reverse*10+reminder;
            num = num/10;
        }
        if(original==reverse){
            System.out.println("palimdrome number ");
        }else{
            System.out.println("not a palimdrome number");
        }

    }
}