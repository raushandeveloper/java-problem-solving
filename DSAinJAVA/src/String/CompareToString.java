package String;

import java.util.Scanner;

public class CompareToString {
    public static int compareTo(String a,String b){
        return -1;
    }
    static void main(String[] args) {
//        String a = "raghav";
//        String b = "preet";
//        System.out.println(a.compareTo(b));//print assci value difference

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(compareTo(a,b));

    }
}
