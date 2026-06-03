package String;
public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character already exists
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates: " + result);
    }
}