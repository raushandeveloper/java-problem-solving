//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Arrays;

public class RotateArray {
    static void main(String[] args) {
        int d = 3;
        int[] arr = new int[]{6, 8, 1, 2, 4, 9, 0};

        for(int i = 0; i < d - 1; ++i) {
            int temp = arr[i];
            arr[i] = arr[d - 2 - i];
            arr[d - 2 - i] = temp;
        }

        for(int ele : arr) {
            System.out.print(ele);
        }

    }
}
