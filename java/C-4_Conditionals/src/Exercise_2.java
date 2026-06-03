import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.random.*;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args){

//        Q1.Write a program to make rock paper scissors game.
        RandomGenerator rd = RandomGenerator.getDefault();
        int num = rd.nextInt(3);
        System.out.println(num);

        System.out.println("Rock, Paper Scissor Game:");
        System.out.print("Chose any one between Rock, Paper, Scissor: ");
        Scanner sc = new Scanner("System.in");
        String option = sc.next();
        option = option.substring(0,1).toUpperCase()+ option.toLowerCase();

        String[] arr = {"Rock","Paper","Scissor"};

        if ("Rock" == arr[0] || "Paper" == arr[1] || "Scissor" == arr[2]) {
            System.out.println("game drow");
        }
    }
}
