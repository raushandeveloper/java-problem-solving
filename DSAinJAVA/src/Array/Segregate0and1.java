

public class Segregate0and1 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};

        Solution obj = new Solution();
        obj.segregate0and1(arr);

        System.out.println("Array after segregation:");

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}

class Solution {

    void segregate0and1(int[] arr) {

        int countZero = 0;

        for (int ele : arr) {
            if (ele == 0)
                countZero++;
        }

        for (int i = 0; i < countZero; i++)
            arr[i] = 0;

        for (int i = countZero; i < arr.length; i++)
            arr[i] = 1;
    }
}