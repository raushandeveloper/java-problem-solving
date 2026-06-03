import java.util.Arrays;

public class Main{

//    Static:- Static keyword is used to associate a method of a given class with the class rather than the object.Static method in a class is shored by all the objects.
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*2;
        }
        return z;
    }
//    void return type:- When we don't want our method to return anything, we use void as the return type.
    static void tellJoke(){
        System.out.println("I invented a new word! \n plagiarism!");
    }
    static int change(int a){
        return a = 33;
    }
    static void change2(int[] arr){
        arr[0]=99;
        arr[1]=50;
    }

//    Method overloading: name are same but argument are change
    static void foo(){   //no argument
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){  //take argument
        System.out.println("Good morning"+ a +"Bro!");
    }


    static void main(String[] args) {
//        Method: A method is a function write inside a class. Since java is an Object Oriented language,
//        we need to write the method inside some class.
        int a=3;
        int b=5;
        int c = logic(a,b);  //call
        System.out.println(c);
        int a1=5;
        int b1=3;
        int c1 = logic(a1,b1);  //call
        System.out.println(c1);

        tellJoke();  //call

//        Case 1:Not Changing the Integer.
//        --> In case of integer value passed.
        int x=10;
        change(x);
        System.out.println("The value of x after running change is: "+x);

//        Case 2: Changing the array.
//        --> In case of array reference passed.
        int[] marks = {14,64,74,76,48,83,58};
        System.out.println("Array: "+Arrays.toString(marks));
        change2(marks);
        System.out.println("The value of array after running change is: "+ Arrays.toString(marks));

//        METHOD OVERLOADING :- Two or more methods can have same name but different parameters.Such methods are called overloaded methods.
        System.out.println("Method Overloading");
        foo();
        foo( 100);
    }
}