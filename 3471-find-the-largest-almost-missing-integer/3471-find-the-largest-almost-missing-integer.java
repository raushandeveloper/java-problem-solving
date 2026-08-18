class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        // count[x] = number of size-k subarrays containing x
        int[] count = new int[51];

        for (int i = 0; i <= n - k; i++) {
            boolean[] seen = new boolean[51];

            for (int j = i; j < i + k; j++) {
                int x = nums[j];

                // Count x only once in this subarray
                if (!seen[x]) {
                    seen[x] = true;
                    count[x]++;
                }
            }
        }

        // Largest integer appearing in exactly one subarray
        for (int x = 50; x >= 0; x--) {
            if (count[x] == 1) {
                return x;
            }
        }

        return -1;
    }
}