package Methods;

public class PassByValueAndReference {
    static void change(int x){
//        int x = 10;
    }

    static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
