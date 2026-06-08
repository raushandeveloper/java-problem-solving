package Array;

public class ColoumPattern {
    public static void main(String[] args) {
        int n = 4132;
        String s = String.valueOf(n);

        int max = s.charAt(0) - '0'; // 4

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < max; j++) {

                if (i == 0) {
                    // first row → all stars
                    System.out.print("*");
                } else {
                    // बाकी rows → सिर्फ first column
                    if (j == 0) System.out.print("*");
                    else System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}