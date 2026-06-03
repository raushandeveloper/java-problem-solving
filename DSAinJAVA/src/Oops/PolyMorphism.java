package Oops;

public class PolyMorphism {
    public static class Dog{
       void speak(){
           System.out.println("Bhav Bhav");
        }
    }
    public static class Cat{
       void speak(){
           System.out.println("Meow Meow");
       }
    }
    public static class Lion{
        void speak(){
            System.out.println("GRRRRRR");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    static void main(String[] args) {
      Dog d = new Dog();
      Cat c = new Cat();
      Human h = new Human();
      Pikachu p = new Pikachu();

      d.speak();
      c.speak();
      p.speak();
      h.speak();
    }
}
