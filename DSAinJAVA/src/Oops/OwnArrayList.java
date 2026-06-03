package Oops;
class ArrayList{ // user defined data structure
    int[] arr;
    int idx = 0;
    int capacity;
    int size =0;
    int val;
    ArrayList(){
    }
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){ // array is full
            capacityIncrease();
        }
        arr[idx++] = ele;
        size++;
    }
    void removeFromEnd(){
        idx--;
        size--;
    }
    void add(int idx, int val){
        // shift elements to right
        for(int i = size; i > idx; i--){
            arr[i] = arr[i - 1];
        }
        arr[idx] = val;
        size++;
    }

    void remove(int idx){
        // shift elements to left
        for(int i = idx; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        size--;
    }
    void capacityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for(int i=0; i<arr.length; i++){ // copy paste
            arr2[i]=arr[i];
        }
        arr = arr2;
    }
    int Capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void set(int index, int val){
        arr[index] = val;
    }
    void display(){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class OwnArrayList {
    static void main(String[] args) {
        ArrayList arr = new ArrayList(3);
        System.out.println(arr.Capacity());
        arr.add(10); arr.add(20); arr.add(30);
        System.out.println(arr.size);
        System.out.println(arr.get(1));
        arr.add(40);
        arr.add(3,33);
        arr.remove(2);
        arr.display();
    }
}
