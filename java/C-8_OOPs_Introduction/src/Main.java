public class Main{
    static class Employee{
        int id;
        String name;
    }
    public static void main(){
//        what is OOPs:- Solving a problem by creating object is one of the most popular approaches in programming. This is called object oriented programming.

//        what is class:- A class is a blueprint for creating object.
//        what is object:- An object is an instantiation of a class. When a class is defined,a template(info) os defined. Memory is allocated only after object instantiation.

//        OOPs TERMINOLOGY:-
//        1.Abstraction:- Hiding internal details.(show only essential information)

//        2.Encapsulation:- The act of putting varous components together(in a capsule).
//                      --> In java, encapsulation simply means that the sensitive data can be hidden form the users.

//        3.Inheritance:- The act of deriving new things from existing things.

//        4.Polymorphism:- One entity many forms.

        System.out.println("This is our custom class");
        Employee ayush = new Employee();  //Instantiating a new Employee object

//        Setting Attributes
        ayush.id = 9;
        ayush.name = "Ayush Kumar";
//        printing the Attribute
        System.out.println(ayush.id);
        System.out.println(ayush.name);
    }
}