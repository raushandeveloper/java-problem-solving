package Array;

import java.util.ArrayList;

public class ArrayListInJavaBasic {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(45);
        arr.add(24);
        arr.add(19);
        arr.add(78);
        arr.add(55);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));// arr[2]
        arr.set(3,44); // arr[3] = 44
        System.out.println(arr.get(3));
        System.out.println(arr.get(4));
        System.out.println(arr);

        int i=0, j=arr.size()-1;
        while (i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }


//        int n = arr.size(); // arr.length
//        for(int i=0; i<n-1; i++){
//            System.out.print(arr.get(i)+" ");
//        }

        System.out.println(arr);


    }
}
