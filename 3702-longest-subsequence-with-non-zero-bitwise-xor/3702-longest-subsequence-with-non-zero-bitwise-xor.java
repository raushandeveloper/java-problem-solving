class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        boolean hasNonZero = false;
        
        for (int num : nums) {
            total ^= num;
            if (num != 0) {
                hasNonZero = true;
            }
        }
        
        int n = nums.length;
        
        if (total != 0) {
            return n;
        }
        
        // total == 0
        if (!hasNonZero) {
            return 0; // all elements are 0
        }
        
        return n - 1;
    }
}