import java.util.Arrays;
public class Main {
    public static void main(String[] args){
//        ARRAY ARE OBJECT IN JAVA.

//        ARRAY:- Array is a collection of similar types of data.
//        --> accessing array element is faster.

//        There are three main ways to create an array in java.

//        M-1: DECLARATION AND MEMORY ALLOCATION.

        int[] marks = new int[5];   // marks --> reference.   and   new int[5] --> object
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 20;
        marks[4] = 80;
//        without using java.util.Arrays;
//        System.out.println(marks);  // [I@27716f4 output --> [I-array of integer. @27716f4-hash code
        System.out.println(marks);
        System.out.println(marks[3]);
        System.out.println("marks in array:- "+Arrays.toString(marks));

//        M-2:- DECLARATION AND THEN MEMORY ALLOCATION.
        float[] number;
        number = new float[5];
//        INITIALIZATION
        number[0] = 10.4f;
        number[1] = 6.3f;
        number[2] = 7.5f;
        number[3] = 2.6f;
        number[4] = 8.3f;
        System.out.println("Array printing: "+Arrays.toString(number));

//        M-3:-  DECLARATION, THEN MEMORY ALLOCATION AND INITIALIZATION.
        int[] score = {100, 70, 50, 30};  //size are auto declare
        System.out.println(Arrays.toString(score));
        System.out.println("Length of array:- "+score.length);

        String[] student = {"Ayush","Suraj","Sachin","Gautam"};
        System.out.println(Arrays.toString(student));
        System.out.println("Length of string:- "+student.length);
        System.out.println(student[2]);
        System.out.println("Display the array using for loop.");

        for(int i=0;i<student.length;i++){
            System.out.println(student[i]);

//            Quick Quiz:- Write a java program to print the element of an array in reverse order.
            System.out.println("print the element of an array in reverse order.");
            for(int j=student.length-1; j>=0; j--){
                System.out.println(student[j]);
            }
        }
//        for each loop:- Array element can also be traversed as follows.
        System.out.println("Applying for each loop");
        for(String element : student){
            System.out.println("using for each loop: "+element);
        }

//        Multidimensional Array:- Multidimensional arrays are array of arrays each element of a M-D array is an array itself marks in the previous example was a 1-D array.
//        2-D Array
        System.out.println("\nprinting the 2D array");
        int [][] flats;
        flats = new int[2][3];
        flats[0][0]=100;
        flats[0][1]=101;
        flats[0][2]=102;
        flats[1][0]=200;
        flats[1][1]=201;
        flats[1][2]=202;
        for(int m=0; m<flats.length; m++){
            for(int n=0; n<flats[m].length; n++) {
                System.out.printf(" %d",flats[m][n]);
            }
            System.out.println("");
        }
    }
}
