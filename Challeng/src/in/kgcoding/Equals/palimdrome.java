import java.util.Scanner;

public class palimdrome{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int num = sc.nextInt();
    int original = num;
    int reverse = 0,remainder;
    while(num!=0){
      remainder = num%10;
      reverse = reverse*10+remainder;
      num = num/10;
    }
    if(original==num){
        System.out.println("palimdrome number ");
    }else{
        System.out.println("not palimdrome number");
    }

    }
}