
import java.util.*;

class Solution {

    class MedianWindow {
        TreeMap<Integer, Integer> low = new TreeMap<>();
        TreeMap<Integer, Integer> high = new TreeMap<>();

        long lowSum = 0, highSum = 0;
        int lowSize = 0, highSize = 0;

        void addMap(TreeMap<Integer, Integer> map, int val) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        void removeMap(TreeMap<Integer, Integer> map, int val) {
            int count = map.get(val);
            if (count == 1) map.remove(val);
            else map.put(val, count - 1);
        }

        void add(int val) {
            if (low.isEmpty() || val <= low.lastKey()) {
                addMap(low, val);
                lowSum += val;
                lowSize++;
            } else {
                addMap(high, val);
                highSum += val;
                highSize++;
            }

            balance();
        }

        void remove(int val) {
            if (low.containsKey(val)) {
                removeMap(low, val);
                lowSum -= val;
                lowSize--;
            } else {
                removeMap(high, val);
                highSum -= val;
                highSize--;
            }

            balance();
        }

        void balance() {
            while (lowSize > highSize + 1) {
                int val = low.lastKey();

                removeMap(low, val);
                lowSum -= val;
                lowSize--;

                addMap(high, val);
                highSum += val;
                highSize++;
            }

            while (lowSize < highSize) {
                int val = high.firstKey();

                removeMap(high, val);
                highSum -= val;
                highSize--;

                addMap(low, val);
                lowSum += val;
                lowSize++;
            }
        }

        long getCost() {
            long median = low.lastKey();

            return median * lowSize - lowSum
                 + highSum - median * highSize;
        }
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;

        // Step 1: Calculate cost of every window
        int windows = n - x + 1;
        long[] cost = new long[windows];

        MedianWindow mw = new MedianWindow();

        for (int i = 0; i < x; i++) {
            mw.add(nums[i]);
        }

        cost[0] = mw.getCost();

        for (int i = x; i < n; i++) {
            mw.remove(nums[i - x]);
            mw.add(nums[i]);

            cost[i - x + 1] = mw.getCost();
        }

        // Step 2: Dynamic Programming
        long INF = Long.MAX_VALUE / 4;

        long[][] dp = new long[k + 1][n + 1];

        for (int j = 0; j <= k; j++) {
            Arrays.fill(dp[j], INF);
        }

        // Zero subarrays require zero operations
        Arrays.fill(dp[0], 0);

        for (int j = 1; j <= k; j++) {
            for (int i = 1; i <= n; i++) {

                // Skip current element
                dp[j][i] = dp[j][i - 1];

                // Select a window of size x
                if (i >= x) {
                    long prev = dp[j - 1][i - x];

                    if (prev != INF) {
                        dp[j][i] = Math.min(
                            dp[j][i],
                            prev + cost[i - x]
                        );
                    }
                }
            }
        }

        return dp[k][n];
    }
}
