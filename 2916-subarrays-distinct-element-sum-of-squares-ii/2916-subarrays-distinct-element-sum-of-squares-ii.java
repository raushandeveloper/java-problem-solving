class Solution {
    static final long MOD = 1_000_000_007L;
    long[] sum, sq, lz;

    void apply(int node, int len, long x) {
        sq[node] = (sq[node] + 2 * x % MOD * sum[node] % MOD + x * x % MOD * len) % MOD;
        sum[node] = (sum[node] + x * len) % MOD;
        lz[node] = (lz[node] + x) % MOD;
    }

    void push(int node, int l, int r) {
        if (lz[node] != 0) {
            int mid = (l + r) >>> 1;
            apply(node * 2, mid - l + 1, lz[node]);
            apply(node * 2 + 1, r - mid, lz[node]);
            lz[node] = 0;
        }
    }

    void update(int node, int l, int r, int ql, int qr, long x) {
        if (qr < l || r < ql) return;
        if (ql <= l && r <= qr) {
            apply(node, r - l + 1, x);
            return;
        }
        push(node, l, r);
        int mid = (l + r) >>> 1;
        update(node * 2, l, mid, ql, qr, x);
        update(node * 2 + 1, mid + 1, r, ql, qr, x);
        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sq[node] = (sq[node * 2] + sq[node * 2 + 1]) % MOD;
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;
        sum = new long[4 * n];
        sq = new long[4 * n];
        lz = new long[4 * n];

        int[] last = new int[100001];
        Arrays.fill(last, -1);

        long ans = 0;
        for (int j = 0; j < n; j++) {
            int prev = last[nums[j]];
            update(1, 0, n - 1, prev + 1, j, 1);
            last[nums[j]] = j;
            ans = (ans + sq[1]) % MOD;
        }
        return (int) ans;
    }
}