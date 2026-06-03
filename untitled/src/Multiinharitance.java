class R
{
    int a,b,c;
    void add() {
         a = 5;
         b = 6;
         c = a + b;
        System.out.println("sum: "+c);
    }
    void sub(){
        a=6;
        b=3;
        c=a-b;
        System.out.println("sub: "+c);
    }
}

class B extends R {
    void multi(){
        a=4;
        b=3;
        c=a*b;
        System.out.println("multi :"+c);
    }
    void div(){
        a=10;
        b=2;
        c=a/b;
        System.out.println("Divide: "+c);
    }
}

class C extends B{
    void rem(){
        a=10;
        b=3;
        c=a%b;
        System.out.println("Reminder :"+c);
    }
}

public class Multiinharitance {
    static void main(String[] args) {
        C r= new C();
        r.add(); r.sub();r.multi();r.div();r.rem();
    }
}
