import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String: ");
        String s1 = sc.next();
        System.out.print("Enter your Second String: ");
        String s2 = sc.next();
        s1 = s1.toLowerCase(Locale.ROOT);
        s2 = s2.toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
            return;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
