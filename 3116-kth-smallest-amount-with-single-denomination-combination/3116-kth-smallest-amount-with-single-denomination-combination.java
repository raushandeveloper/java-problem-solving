import java.util.*;

class Solution {

    public long findKthSmallest(int[] coins, int k) {
        
        long low = 1;
        long high = (long) coins[0] * k;

        // Remove redundant coins
        Arrays.sort(coins);

        List<Integer> arr = new ArrayList<>();

        for (int coin : coins) {
            boolean redundant = false;

            for (int x : arr) {
                if (coin % x == 0) {
                    redundant = true;
                    break;
                }
            }

            if (!redundant) {
                arr.add(coin);
            }
        }

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (count(mid, arr) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private long count(long x, List<Integer> coins) {
        long result = 0;
        int n = coins.size();

        // Inclusion-Exclusion
        for (int mask = 1; mask < (1 << n); mask++) {

            long lcm = 1;
            int bits = 0;
            boolean valid = true;

            for (int i = 0; i < n; i++) {

                if ((mask & (1 << i)) != 0) {
                    bits++;

                    lcm = lcm(lcm, coins.get(i));

                    if (lcm > x) {
                        valid = false;
                        break;
                    }
                }
            }

            if (!valid) {
                continue;
            }

            long ways = x / lcm;

            if (bits % 2 == 1) {
                result += ways;
            } else {
                result -= ways;
            }
        }

        return result;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}