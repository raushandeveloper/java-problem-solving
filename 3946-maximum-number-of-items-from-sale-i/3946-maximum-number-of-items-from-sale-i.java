class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int minPrice = Integer.MAX_VALUE;
        for (int[] it : items) {
            minPrice = Math.min(minPrice, it[1]);
        }

        // gain[i] = kitni items j (j != i) ke liye factor[i] | factor[j]
        int[] gain = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    gain[i]++;
                }
            }
        }

        // 0/1 knapsack: cost = price, value = 1 + gain
        int[] dp = new int[budget + 1];
        for (int i = 0; i < n; i++) {
            int price = items[i][1];
            int val = 1 + gain[i];
            for (int b = budget; b >= price; b--) {
                dp[b] = Math.max(dp[b], dp[b - price] + val);
            }
        }

        // bacha hua budget cheapest item ke extra copies par
        int ans = 0;
        for (int b = 0; b <= budget; b++) {
            ans = Math.max(ans, dp[b] + (budget - b) / minPrice);
        }
        return ans;
    }
}