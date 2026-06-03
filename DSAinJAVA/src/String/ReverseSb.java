package String;

public class ReverseSb {
    static void main() {
        String s = "Raushan";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
//        sb.reverse();
        int i=0, j=sb.length()-1;
        while (i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
