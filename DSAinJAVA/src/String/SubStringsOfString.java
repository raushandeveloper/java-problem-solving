package String;

public class SubStringsOfString {
    static void main(String[] args) {
        String s = "raghav";
        System.out.println(s);
        s = "Madhav";
        System.out.println(s);
        String a = "jaishankar";
        System.out.println(a.substring(3));
        System.out.println(a.substring(0,a.length()-1));

        String r = "bhakti";
        for(int i=0; i<r.length(); i++) {
            for (int j = i+1; j<= r.length(); j++) {
                System.out.print(r.substring(i, j)+" ");
            }
            System.out.println();
        }for(int i=0; i<r.length(); i++) {
            for (int j = i+1; j<= r.length(); j++) {
                System.out.print(r.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
}
