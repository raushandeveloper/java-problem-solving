import java.util.Scanner;
public class practice_set_3{
    public static void main(String[] args){

//        Q1.Write a java program to convert a string to lower case.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name in upper case :- ");
        String name = sc.nextLine();
        name = name.toLowerCase();
        System.out.printf("Name in lower case :- %s",name);

//        Q2. Write a java program to replace space with underscores.
        System.out.print("\nEnart your full Name :- ");
        String name1 = sc.nextLine();
        String replace = name1.replace(" ","-");
        System.out.printf("replace \" \" with \"-\" :- %s",replace);

//        Q3.Write a java program to fill in a letter template
//        Which looks like below:
//        letter = "Dear <|name|>,Thanks a lot"
//        Replace <|name|> with a string (some name)

        String letter = "\nDear <|name|>, Thanks a lot.";
        System.out.println(letter);
        letter = letter.replace("<|name|>","Ayush Kumar");
        System.out.println("replace name :-"+letter);

//        Q4.Write a java program to detect double and triple spaces in a string.
        String str = "This string contains  double and    triple spaces.";
        System.out.println(str);
        System.out.println(str.indexOf("  "));  //if double space present return index  else -1.
        System.out.println(str.indexOf("   "));  //if triple spaces present return index else -1.

//        Q5. Write a program to format the following letter using escape sequence characters.
//        letter = "Dear Harry, This java course is nice. Thanks'\"
        String MyLetter = "Dear Harry,\n \t This java course is nice.\n Thanks.";
        System.out.print(MyLetter);
    }
}