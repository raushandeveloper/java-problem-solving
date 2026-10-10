class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        final int MAXV = 100000;
        long[] freq = new long[MAXV + 2];
        long total = 0;

        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            freq[d]++;
            total += d;
        }

        if (total <= k) return 0;

        for (int v = MAXV; v >= 1 && k > 0; v--) {
            if (freq[v] == 0) continue;

            if (freq[v] <= k) {
                // saare elements ko v-1 bana do
                k -= freq[v];
                freq[v - 1] += freq[v];
                freq[v] = 0;
            } else {
                // sirf k elements ko v-1 kar sakte hain
                freq[v] -= k;
                freq[v - 1] += k;
                k = 0;
            }
        }

        long ans = 0;
        for (int v = 0; v <= MAXV; v++) {
            ans += freq[v] * (long) v * v;
        }
        return ans;
    }
}