class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        int left = 0;
        int ones = 0;

        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            if (s.charAt(right) == '1') {
                ones++;
            }

            // We only care about windows having exactly k ones
            if (ones == k) {

                // Remove leading zeros as much as possible
                while (left <= right && s.charAt(left) == '0') {
                    left++;
                }

                // Current window has exactly k ones
                int len = right - left + 1;
                String curr = s.substring(left, right + 1);

                if (len < minLen ||
                    (len == minLen && curr.compareTo(ans) < 0)) {

                    minLen = len;
                    ans = curr;
                }

                // Move past the first 1 so that we can find
                // the next possible window
                left++;

                ones--;
            }
        }

        return ans;
    }
}