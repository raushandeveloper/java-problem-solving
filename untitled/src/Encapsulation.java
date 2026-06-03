class E{
    private int value;
    public void setValue(int x){
        value = x;
    }
    public int getValue(){
        return ++value;
    }
}

public class Encapsulation {
    static void main(String[] args) {
        E r=new E();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}
