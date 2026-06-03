package in.kgcoding.polymorphism;

public class Overloading {

    Overloading(){
        System.out.println("Default constructor called.");
    }

    Overloading(String pop){
        System.out.println(pop);
    }



    public int add(int a, int b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }

    public static void main(String[] args){
        Overloading overload = new Overloading();
        int sum = overload.add(5,4);
         String a= overload.add("a","b");
        System.out.println(a);
        System.out.println(overload.add(6,sum));
    }
}
