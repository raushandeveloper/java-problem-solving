package String;

import java.util.Scanner;

public class StringBasic {
    static void main(String[] args) {
        char[] arr= {'r','a','u','s','h','a','n'};
        for(char ele :arr) {
            System.out.print(ele+" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
