
class Solution {
    static final int MOD = 1_000_000_007;

    int[][][] memo;
    int m, n;
    int[][] grid;

    // dir = 0: moving right
    // dir = 1: moving down
    int resolve(int r, int c, int dir) {
        if (r >= m || c >= n) {
            return -1;
        }

        if (memo[r][c][dir] != -2) {
            return memo[r][c][dir];
        }

        // Empty cell: robot stops reflecting
        if (grid[r][c] == 0) {
            return memo[r][c][dir] = r * n + c;
        }

        // Mirror reflection
        if (dir == 0) {
            return memo[r][c][dir] = resolve(r + 1, c, 1);
        } else {
            return memo[r][c][dir] = resolve(r, c + 1, 0);
        }
    }

    public int uniquePaths(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        memo = new int[m][n][2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j][0] = -2;
                memo[i][j][1] = -2;
            }
        }

        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (dp[i][j] == 0) continue;

                // Move right
                int dest = resolve(i, j + 1, 0);

                if (dest != -1) {
                    int x = dest / n;
                    int y = dest % n;

                    dp[x][y] = (dp[x][y] + dp[i][j]) % MOD;
                }

                // Move down
                dest = resolve(i + 1, j, 1);

                if (dest != -1) {
                    int x = dest / n;
                    int y = dest % n;

                    dp[x][y] = (dp[x][y] + dp[i][j]) % MOD;
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }
}
