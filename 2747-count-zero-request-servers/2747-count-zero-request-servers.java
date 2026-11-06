
import java.util.*;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int q = queries.length;
        int[] ans = new int[q];
        int[] freq = new int[n + 1];

        Integer[] idx = new Integer[q];

        for (int i = 0; i < q; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) ->
            Integer.compare(queries[a], queries[b])
        );

        int left = 0;
        int right = 0;
        int active = 0;

        for (int id : idx) {

            int start = queries[id] - x;
            int end = queries[id];

            // Add logs up to current query time
            while (right < logs.length &&
                   logs[right][1] <= end) {

                int server = logs[right][0];

                if (freq[server] == 0) {
                    active++;
                }

                freq[server]++;
                right++;
            }

            // Remove logs outside the current window
            while (left < right &&
                   logs[left][1] < start) {

                int server = logs[left][0];

                freq[server]--;

                if (freq[server] == 0) {
                    active--;
                }

                left++;
            }

            ans[id] = n - active;
        }

        return ans;
    }
}
