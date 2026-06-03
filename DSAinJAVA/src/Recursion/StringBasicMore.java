package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringBasicMore {
    static void main(String[] args) {
        String s = "Sunny";
        change(s);
        System.out.println(s);

        String[] arr = {"raushan","krish","priyanshu"};

        ArrayList<String> al = new ArrayList<>();
        al.add("ravi");
        al.add("Umang");
        al.add("shelly");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }

    private static void change2(List<String> al){
        al.add("akash");
    }


    private static void change(String s) {
        s = "Lavish";
    }
}