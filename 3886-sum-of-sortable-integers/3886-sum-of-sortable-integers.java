class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;
            boolean ok = true;
            int prevMax = Integer.MIN_VALUE;
            for (int s = 0; s < n && ok; s += k) {
                int drops = 0, pos = -1;
                for (int i = s; i + 1 < s + k; i++) {
                    if (nums[i] > nums[i + 1]) {
                        drops++;
                        pos = i;
                    }
                }
                int mn, mx;
                if (drops == 0) {
                    mn = nums[s];
                    mx = nums[s + k - 1];
                } else if (drops == 1 && nums[s + k - 1] <= nums[s]) {
                    mn = nums[pos + 1];
                    mx = nums[pos];
                } else {
                    ok = false;
                    break;
                }
                if (mn < prevMax) ok = false;
                prevMax = mx;
            }
            if (ok) ans += k;
        }
        return ans;
    }
}