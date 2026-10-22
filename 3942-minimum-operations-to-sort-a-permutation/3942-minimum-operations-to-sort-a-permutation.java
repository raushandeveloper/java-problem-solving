class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int r = nums[0];
        int best = Integer.MAX_VALUE;

        // Case 1: ascending rotation
        boolean asc = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] != (i + r) % n) { asc = false; break; }
        }
        if (asc) {
            int x = (n - r) % n;
            best = Math.min(best, x);                    // only rotate left
            if (x != 0) best = Math.min(best, 2 + (n - x)); // V, rotate, V  (right rotate)
        }

        // Case 2: descending rotation
        boolean desc = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] != (((r - i) % n) + n) % n) { desc = false; break; }
        }
        if (desc) {
            int y = (r + 1) % n;
            best = Math.min(best, 1 + Math.min(y, n - y));
        }

        return best == Integer.MAX_VALUE ? -1 : best;
    }
}