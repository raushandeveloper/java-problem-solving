import java.util.*;

class Solution {

    static class State {
        int r, c;
        int energy;
        int mask;

        State(int r, int c, int energy, int mask) {
            this.r = r;
            this.c = c;
            this.energy = energy;
            this.mask = mask;
        }
    }

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int sr = -1, sc = -1;
        int litterCount = 0;

        // Give every litter cell a bit number.
        int[][] litterId = new int[m][n];
        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                }

                if (ch == 'L') {
                    litterId[i][j] = litterCount++;
                }
            }
        }

        // No litter => already completed.
        if (litterCount == 0) {
            return 0;
        }

        int fullMask = (1 << litterCount) - 1;

        /*
         * visited[r][c][mask][energy]
         *
         * energy can be 0 ... energy.
         */
        boolean[][][][] visited =
                new boolean[m][n][1 << litterCount][energy + 1];

        Queue<State> q = new ArrayDeque<>();

        q.offer(new State(sr, sc, energy, 0));
        visited[sr][sc][0][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            // BFS level = number of moves.
            while (size-- > 0) {

                State cur = q.poll();

                // All litter collected.
                if (cur.mask == fullMask) {
                    return moves;
                }

                // If energy is 0, we cannot move.
                if (cur.energy == 0) {
                    continue;
                }

                for (int d = 0; d < 4; d++) {

                    int nr = cur.r + dr[d];
                    int nc = cur.c + dc[d];

                    // Outside grid
                    if (nr < 0 || nr >= m ||
                        nc < 0 || nc >= n) {
                        continue;
                    }

                    // Obstacle
                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    // One move costs one energy.
                    int newEnergy = cur.energy - 1;

                    // Collect litter if present.
                    int newMask = cur.mask;

                    if (classroom[nr].charAt(nc) == 'L') {
                        int id = litterId[nr][nc];
                        newMask |= (1 << id);
                    }

                    // Reset energy on R.
                    if (classroom[nr].charAt(nc) == 'R') {
                        newEnergy = energy;
                    }

                    if (!visited[nr][nc][newMask][newEnergy]) {

                        visited[nr][nc][newMask][newEnergy] = true;

                        q.offer(new State(
                                nr,
                                nc,
                                newEnergy,
                                newMask
                        ));
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}