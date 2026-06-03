//import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class practice_set_6 {
    public static void main(String[] args){
//        Q1. Create a array of 5 float and calculate their sum.
        float[] arr = {5.0f,9.2f,7.2f,4.9f,2.2f};
        float sum = 0;
        System.out.println(Arrays.toString(arr));
        for(float element : arr){
            sum += element;
        }
        System.out.printf("Sum of arrays is: %.2f \n",sum);

//        Q2. Write a program to find out whether a given integer is present in an array or not.
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr1));
        System.out.print("Enter the any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean a = false;
        for(int element : arr1){
            if(num == element){
                a = true;
                break;
            }
        }
        if(a == true){
            System.out.printf("%d number is present in this array",num);
        }
        else{
            System.out.printf("%d number is not present in this array:\n",num);
        }

//        Q3.Calculate the average marks from an array containing marks af all students in physics using for-each loop.
        System.out.println("Calculating the Average of marks");
        int[] marks = {98,79,68,30,65,39,88};
        System.out.println("Give array: "+Arrays.toString(marks));
        float avg, sum1 = 0;
        for(int element: marks){
            sum1 += element;
        }
        avg = sum1/marks.length;
        System.out.printf("Average of marks in array: %f \n",avg);

//        Q4. Create a Java program to add two matrices of size 2x3.
        System.out.println("\nCreate a matrices");
        System.out.println("First matrix:- ");
        int[][] matrix1 = {{10,20,30},{15,25,35}};
//        matrix1 = new int[2][3];
//        matrix1[0][0]=10;
//        matrix1[0][1]=20;
//        matrix1[0][2]=30;
//        matrix1[1][0]=15;
//        matrix1[1][1]=25;
//        matrix1[1][2]=35;
        for(int i = 0; i<matrix1.length; i++){
            for(int j = 0; j<matrix1[i].length; j++){
                System.out.printf(" %d",matrix1[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Second matrix:- ");
        int [][] matrix2 = {{55,60,65},{70,75,80}};
//        matrix2 = new int[2][3];
//        matrix2[0][0] = 55;
//        matrix2[0][1] = 60;
//        matrix2[0][2] = 65;
//        matrix2[1][0] = 70;
//        matrix2[1][1] = 75;
//        matrix2[1][2] = 80;
        for(int i = 0; i<matrix2.length; i++){
            for(int j =0; j<matrix2[i].length; j++){
                System.out.printf(" %d",matrix2[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Sum of 1st matrix and 2nd matrix:");
        int [][] sumMatrix;
        sumMatrix = new int [2][3];
        for(int i=0;i<2;i++){
            for(int j=0; j<3; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.printf(" %d",sumMatrix[i][j]);
            }
            System.out.println("");
        }
//        Q5. write a java program to reverse an array.
        System.out.print("\nGiven array is:");
        int[] reverseArray = {28,39,49,20,57,93,29};
        System.out.println(Arrays.toString(reverseArray));
        int arrayLength = reverseArray.length;
        System.out.print("After reversing the array: ");
        if(arrayLength % 2 == 0){
            for(int i=0;i<arrayLength/2;i++){
                int element = reverseArray[i];
                reverseArray[i] = reverseArray[arrayLength-1-i];
                reverseArray[arrayLength-1-i] = element;
            }
        }
        else{
            for(int i=0;i<arrayLength/2+1; i++){
                int element = reverseArray[i];
                reverseArray[i] = reverseArray[arrayLength-1-i];
                reverseArray[arrayLength-1-i] = element;
            }
        }
        System.out.println(Arrays.toString(reverseArray));

//        Q6. Write a java program to find the maximum element in an array.
        System.out.println("\nFind the maximum element in this array: ");
        int[] maxArray = {37,28,69,38,55,62};
        System.out.printf("Given array is: %s \n",Arrays.toString(maxArray));
        int maxValue = 0;
        for(int i=0; i<maxArray.length; i++){
            if(maxValue < maxArray[i]){
                maxValue = maxArray[i];
            }
        }
        System.out.println("Maxumum value in the array is: "+maxValue);

//        Q7. Write a java program to find the minimum element in a given array.
        System.out.println("\nFind the minimum element in this array: ");
        int[] minArray = {37,28,69,38,55,62};
        System.out.printf("Given array is: %s \n",Arrays.toString(minArray));
        int minValue = 100000;
        for(int i=0; i<minArray.length; i++){
            if(minValue > maxArray[i]){
                minValue = maxArray[i];
            }
        }
        System.out.println("Minimum value in the array is: "+minValue);

//        Q8.Write a program to find whether an array is Sorted or not.
        System.out.println("Check the array is sorted or not:");  //arrange or not
        boolean isSorted = false;
        int[] SortedArray = {1,32,5,2,765,9};
        System.out.println("Given array is: "+Arrays.toString(SortedArray));
        for(int i=0; i<SortedArray.length;i++){
            if(SortedArray[i] > SortedArray[i+1]){
                isSorted = true;
                break;
            }
        }
        if(isSorted){
            System.out.println("Arrays is not Sorted.");
        }
        else{
            System.out.println("Array is Sorted.");
        }
    }
}
