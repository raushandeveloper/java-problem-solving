package String;

public class PassingStringToMethod{
    public static void change(String x){
        x="Sunny";
    }

    static void main(String[] args) {
        String x = "Raushan";
        change(x);
        System.out.println(x);
    }
}
