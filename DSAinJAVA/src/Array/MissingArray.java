package Array;

public class MissingArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5};   // Example array (4 missing)

        Solution obj = new Solution();
        int missing = obj.missingNum(arr);

        System.out.println("Missing number is: " + missing);
    }
}

class Solution {
    int missingNum(int arr[]) {
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;
        long arraySum = 0;

        for (int ele : arr) {
            arraySum += ele;
        }

        return (int)(sum - arraySum);
    }
}