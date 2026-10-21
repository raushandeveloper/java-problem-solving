class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] c = s.toCharArray();

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (c[i] < c[i - 1]) { sorted = false; break; }
        }
        if (sorted) return 0;
        if (n == 2) return -1;

        char mn = 'z', mx = 'a';
        for (char ch : c) {
            mn = (char) Math.min(mn, ch);
            mx = (char) Math.max(mx, ch);
        }

        if (c[0] == mn || c[n - 1] == mx) return 1;

        int cntMn = 0, cntMx = 0;
        for (char ch : c) {
            if (ch == mn) cntMn++;
            if (ch == mx) cntMx++;
        }

        if (c[0] == mx && c[n - 1] == mn && cntMx == 1 && cntMn == 1) return 3;
        return 2;
    }
}