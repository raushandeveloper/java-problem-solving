import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//        String :-  String is a sequence of characters.
        String name;
        name = new String("Ayush");
        System.out.println("string :- " + name);
//        String is a class but can be used like data types.

//        STRING IS IMMUTABLE AND CANNOT BE CHANGE
        String name2 = "Hanuman";
        System.out.println(name2);

//        %d for int
//        %f for float
//        %c for char
//        %s for string

//        System.out.printf() and System.out.format() work at same
        int a = 53;
        float b = 8.989f;
        System.out.printf("The value of a is %d and value of b is %.3f \n", a, b);
        System.out.format("The value of a is %d and value of b is %f \n", a, b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :- ");
//        String srt = sc.next(); // next() :- next() read only one word
        String srt = sc.nextLine();
        System.out.printf("Good Morning %s \n", srt);

//   STRING METHOD
//        String Method:-They can be used to find the length of the string,convert to lowercase,etc.
//                      01234  :- indexing
        String name3 = "AyusH";

        int value = name3.length();       // name.length() :- return the length of string
        System.out.printf("Length of Aysuh name is :- %d\n", value);

        String lstring = name3.toLowerCase();   //name.toLowerCase() :- return new string with lower case
        System.out.printf("Ayush in lower Canse :- %s\n", lstring);
        String ustring = name3.toUpperCase();  //name.toUpperCase() :- return new string with upper case
        System.out.printf("Ayush in upper Canse :- %s\n", ustring);

        String str1 = "   Radhe Radhe  ";
        System.out.printf("%s \n", str1);
        System.out.printf("using name.trim() :- %s \n", str1.trim());    //name.trim() :- remove the starting and ending space from the string

        String subSt = name3.substring(2);   //name.substring() :- return the some part of the string
        System.out.printf("substring(3) of Ayush :- %s \n", subSt);
        System.out.println(name3.substring(2, 5));

        String replace1 = name3.replace('A', 'p');   // using single quote for replace only 1 later
        System.out.printf("Replace mathod used :- %s\n", replace1);
        String replace2 = name3.replace("Ay", "Kh");  // using duble quote for replace more thain 1 word
        System.out.printf("Replace mathod used :- %s\n", replace2);

//        startsWith() and endsWith() :- return the value in true or false
        System.out.println("starstWith(\"Ay\") method using :- " + name3.startsWith("Ay"));
        System.out.println("endstWith(\"sh\") method using :- " + name3.endsWith("sh"));  //case-sensitive

        System.out.println(name.charAt(0)); // To get the value present in index 0.
        System.out.println(name.charAt(1)); // To get the value present in index 1.
        System.out.println(name.charAt(2)); // To get the value present in index 2.

        System.out.println(name.indexOf("y")); // To get the index of value.
//        IF VALUE IN NOT GET THEN RETURN -1.


        System.out.println("name3.equals(\"AyusH\") :- " + name3.equals("AyusH"));   //name.equals("__") :- return true if string is equals (check upper case and lower case).
        System.out.println("name3.equals(\"ayush\") :- " + name3.equals("ayush"));   //name.equals("__") :- return false if string is not equals (check upper case and lower case).

        System.out.println("name3.equalsIgnoreCase(\"ayush\") :- " + name3.equalsIgnoreCase("ayush"));  //name.equalIgnoreCase("__") :- return true if string is quale without checking upper case and lower case.
    }
}