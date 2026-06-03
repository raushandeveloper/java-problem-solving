package Oops;
import java.util.Scanner;
public class PrivateKeyword {
    public static class Students{
        String name;
        private int rno;
        double cgpa;
        private void print(){
            System.out.println(name+" "+cgpa+" "+rno);
        }
        public void p(){
            print();
        }
        int getrno(){
            return rno;
        }
        void setRno(int x){
            rno = x;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();
        s1.p();
        System.out.println(s1.getrno());

        s1.setRno(45);
        System.out.println(s1.getrno());

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
