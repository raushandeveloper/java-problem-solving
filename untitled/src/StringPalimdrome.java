import java.util.Scanner;

public class StringPalimdrome {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.next();
        String Original = str;
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if(Original.equals(reverse)){
            System.out.println("String is palimdrome");
        }
        else {
            System.out.println("String is not palimdrome");
        }
    }

}
