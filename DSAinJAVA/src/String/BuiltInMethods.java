package String;

public class BuiltInMethods {
    static void main() {
        String stt = "7567854";
        int m = Integer.parseInt(stt);
        System.out.println(m+1);
        String s = "Raushan Singh";
        String str = "harshita";
        System.out.println(s.indexOf('R'));
        System.out.println(str.contains("harsh"));
        if (str.contains("arsh")) {
            System.out.println("happy");
        }
    }

}
//lexagraphically smaller
//raghav < saneha  because r<s depend upon assci value