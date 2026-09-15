class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        char[] c = s.toCharArray();

        // isPal[i][j] = true agar s[i..j] palindrome hai
        boolean[][] isPal = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            isPal[i][i] = true;
            for (int j = i + 1; j < n; j++) {
                if (c[i] == c[j] && (j - i == 1 || isPal[i + 1][j - 1])) {
                    isPal[i][j] = true;
                }
            }
        }

        // dp[i] = max non-overlapping palindromes s[0..i-1] mein
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];  // current char skip karo

            // length exactly k
            if (i - k >= 0 && isPal[i - k][i - 1]) {
                dp[i] = Math.max(dp[i], dp[i - k] + 1);
            }

            // length exactly k+1 (parity cover karne ke liye)
            if (i - k - 1 >= 0 && isPal[i - k - 1][i - 1]) {
                dp[i] = Math.max(dp[i], dp[i - k - 1] + 1);
            }
        }

        return dp[n];
    }
}