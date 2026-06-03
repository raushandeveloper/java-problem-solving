package Array;

public class SingleAmongDoubles {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        Solution sol = new Solution();
        int singleElement = sol.findOnce(arr);
        System.out.println("The single element is: " + singleElement);
    }

    static class Solution {
        int findOnce(int[] arr) {
            int n = arr.length;

            if (n == 1) return arr[0];
            if (arr[0] != arr[1]) return arr[0];
            if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

            int lo = 0, hi = n - 1;

            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;

                // Make mid even so it always points to the first element of a pair
                if (mid % 2 == 1) mid--;

                if (arr[mid] == arr[mid + 1]) {
                    lo = mid + 2;
                } else {
                    hi = mid;
                }
            }

            return arr[lo];
        }
    }
}