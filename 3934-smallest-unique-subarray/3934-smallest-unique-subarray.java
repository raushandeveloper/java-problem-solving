class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int maxVal = 0;
        for (int x : nums) maxVal = Math.max(maxVal, x);

        int[] sa = new int[n];
        int[] rnk = new int[n];
        int[] newR = new int[n];
        int[] order = new int[n];
        int[] cnt = new int[Math.max(maxVal, n) + 2];

        // initial sort by first element
        for (int i = 0; i < n; i++) cnt[nums[i]]++;
        for (int i = 1; i < cnt.length; i++) cnt[i] += cnt[i - 1];
        for (int i = n - 1; i >= 0; i--) sa[--cnt[nums[i]]] = i;

        rnk[sa[0]] = 0;
        for (int i = 1; i < n; i++) {
            rnk[sa[i]] = rnk[sa[i - 1]] + (nums[sa[i]] != nums[sa[i - 1]] ? 1 : 0);
        }

        // prefix doubling
        for (int k = 1; k < n; k <<= 1) {
            if (rnk[sa[n - 1]] == n - 1) break;

            int p = 0;
            for (int i = n - k; i < n; i++) order[p++] = i;
            for (int j = 0; j < n; j++) {
                if (sa[j] >= k) order[p++] = sa[j] - k;
            }

            int classes = rnk[sa[n - 1]] + 1;
            java.util.Arrays.fill(cnt, 0, classes + 1, 0);
            for (int i = 0; i < n; i++) cnt[rnk[i]]++;
            for (int i = 1; i < classes; i++) cnt[i] += cnt[i - 1];
            for (int j = n - 1; j >= 0; j--) {
                sa[--cnt[rnk[order[j]]]] = order[j];
            }

            newR[sa[0]] = 0;
            for (int i = 1; i < n; i++) {
                int prev = sa[i - 1], cur = sa[i];
                int prevSecond = prev + k < n ? rnk[prev + k] : -1;
                int curSecond = cur + k < n ? rnk[cur + k] : -1;
                boolean same = rnk[prev] == rnk[cur] && prevSecond == curSecond;
                newR[cur] = newR[prev] + (same ? 0 : 1);
            }
            int[] t = rnk; rnk = newR; newR = t;
        }

        // Kasai LCP: lcp[r] = LCP(sa[r-1], sa[r])
        int[] lcp = new int[n + 1];
        int h = 0;
        for (int i = 0; i < n; i++) {
            if (rnk[i] > 0) {
                int j = sa[rnk[i] - 1];
                while (i + h < n && j + h < n && nums[i + h] == nums[j + h]) h++;
                lcp[rnk[i]] = h;
                if (h > 0) h--;
            } else {
                h = 0;
            }
        }

        int ans = n;
        for (int r = 0; r < n; r++) {
            int left = r > 0 ? lcp[r] : 0;
            int right = r < n - 1 ? lcp[r + 1] : 0;
            int need = Math.max(left, right) + 1;
            if (need <= n - sa[r]) ans = Math.min(ans, need);
        }
        return ans;
    }
}