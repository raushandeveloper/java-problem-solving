public class Varargs {

    static int sum(int ...arr){
//        Available as int[] arr;
        int result = 0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
public static void main() {
//    VARARGS(Variable Argument):
    System.out.println("Varargs(Variable argument):- ");
    System.out.println("The sum of 4 and 5 is: " + sum(4,5));
    System.out.println("The sum of 3,4 and 5 is: " + sum(3,4,5));
    System.out.println("The sum of 2,3,4 and 5 is: " + sum(2,3,4,5));
    System.out.println("The sum of 1,2,3,4,5 and 5 is: " + sum(1,2,3,4,5));
    System.out.println("The sum of 3,6,33,4 and 5 is: " + sum(3,6,33,4,5));

//    Recursion :- A function in java can call itself. Such calling of function by itself is called recursion.
    System.out.println("Factorial of 4:");
    int n=4;
    System.out.println("The value of factorial n is: "+factorial(n));

    System.out.println("Fibonacci Sequence: 0 1 1 2 3 5");
    int y= 0;
    int x = 1;
    int sum = 0;
     for(int i =0;i<15;i++){
         System.out.print(" "+sum);

         sum=y+x;
         y = x;
         x = sum;
     }
  }
}
