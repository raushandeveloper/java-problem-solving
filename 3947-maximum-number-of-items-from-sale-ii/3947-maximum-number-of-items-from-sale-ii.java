
import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int[] freq = new int[n + 1];
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            freq[item[0]]++;
            minPrice = Math.min(minPrice, item[1]);
        }

        // Count how many other item types each item can unlock
        int[] gain = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                gain[i] += freq[j];
            }
            if (gain[i] > 0) {
                gain[i]--;
            }
        }

        // Collect profitable double-value purchases
        int[][] deals = new int[n][2];
        int size = 0;

        for (int[] item : items) {
            int factor = item[0];
            int price = item[1];

            if (gain[factor] > 0 && price <= 2L * minPrice) {
                deals[size][0] = price;
                deals[size][1] = gain[factor];
                size++;
            }
        }

        // Cheapest double-value units first
        Arrays.sort(deals, 0, size,
            (a, b) -> Integer.compare(a[0], b[0]));

        long ans = 0;
        long remaining = budget;

        for (int i = 0; i < size; i++) {
            long price = deals[i][0];
            long count = deals[i][1];

            long take = Math.min(count, remaining / price);

            ans += take * 2;
            remaining -= take * price;
        }

        // Spend remaining budget on cheapest normal items
        ans += remaining / minPrice;

        return (int) ans;
    }
}
