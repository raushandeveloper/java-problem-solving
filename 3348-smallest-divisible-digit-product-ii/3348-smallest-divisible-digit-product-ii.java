class Solution {
    static final int[][] DIGIT_EXP = {
        {0,0,0,0}, {0,0,0,0}, {1,0,0,0}, {0,1,0,0}, {2,0,0,0},
        {0,0,1,0}, {1,1,0,0}, {0,0,0,1}, {3,0,0,0}, {0,2,0,0}
    };

    int A, B, C, D, dimB, dimC, dimD;
    int[] minCount;

    public String smallestNumber(String num, long t) {
        long tt = t;
        int a = 0, b = 0, c = 0, d = 0;
        while (tt % 2 == 0) { tt /= 2; a++; }
        while (tt % 3 == 0) { tt /= 3; b++; }
        while (tt % 5 == 0) { tt /= 5; c++; }
        while (tt % 7 == 0) { tt /= 7; d++; }
        if (tt != 1) return "-1";

        A = a; B = b; C = c; D = d;
        dimB = B + 1; dimC = C + 1; dimD = D + 1;
        minCount = new int[(A + 1) * dimB * dimC * dimD];
        computeMinCount();

        int L = num.length();
        int[] init = {a, b, c, d};

        int[][] prefixState = new int[L + 1][];
        prefixState[0] = init;
        int maxTight = L;
        for (int i = 0; i < L; i++) {
            int digit = num.charAt(i) - '0';
            if (digit == 0) { maxTight = i; break; }
            prefixState[i + 1] = applyDigit(prefixState[i], digit);
        }

        if (maxTight == L && isZero(prefixState[L])) return num;

        int startI = (maxTight == L) ? L - 1 : maxTight;
        for (int i = startI; i >= 0; i--) {
            int[] s = prefixState[i];
            int lower = num.charAt(i) - '0';
            int remaining = L - i - 1;
            for (int dg = lower + 1; dg <= 9; dg++) {
                int[] s2 = applyDigit(s, dg);
                if (getMinCount(s2) <= remaining) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(num, 0, i);
                    sb.append((char) ('0' + dg));
                    sb.append(greedyFill(s2, remaining));
                    return sb.toString();
                }
            }
        }

        int mcInit = getMinCount(init);
        int L2 = Math.max(L + 1, mcInit);
        return greedyFill(init, L2);
    }

    boolean isZero(int[] s) { return s[0] == 0 && s[1] == 0 && s[2] == 0 && s[3] == 0; }

    int[] applyDigit(int[] s, int dg) {
        int[] e = DIGIT_EXP[dg];
        return new int[]{
            Math.max(s[0] - e[0], 0), Math.max(s[1] - e[1], 0),
            Math.max(s[2] - e[2], 0), Math.max(s[3] - e[3], 0)
        };
    }

    int idx(int a, int b, int c, int d) { return ((a * dimB + b) * dimC + c) * dimD + d; }

    int getMinCount(int[] s) { return minCount[idx(s[0], s[1], s[2], s[3])]; }

    void computeMinCount() {
        for (int a = 0; a <= A; a++)
        for (int b = 0; b <= B; b++)
        for (int c = 0; c <= C; c++)
        for (int d = 0; d <= D; d++) {
            if (a == 0 && b == 0 && c == 0 && d == 0) continue;
            int[] s = {a, b, c, d};
            int best = Integer.MAX_VALUE;
            for (int dg = 2; dg <= 9; dg++) {
                int[] s2 = applyDigit(s, dg);
                if (s2[0] == a && s2[1] == b && s2[2] == c && s2[3] == d) continue;
                int mc = minCount[idx(s2[0], s2[1], s2[2], s2[3])];
                if (mc + 1 < best) best = mc + 1;
            }
            minCount[idx(a, b, c, d)] = best;
        }
    }

    String greedyFill(int[] state, int n) {
        StringBuilder sb = new StringBuilder();
        int[] cur = state;
        for (int pos = 0; pos < n; pos++) {
            int remAfter = n - pos - 1;
            for (int dg = 1; dg <= 9; dg++) {
                int[] s2 = applyDigit(cur, dg);
                if (getMinCount(s2) <= remAfter) {
                    sb.append((char) ('0' + dg));
                    cur = s2;
                    break;
                }
            }
        }
        return sb.toString();
    }
}