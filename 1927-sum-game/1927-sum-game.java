class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        int mid = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < mid; i++) {

            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = mid; i < n; i++) {

            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        int diffQ = leftQ - rightQ;
        int diffSum = leftSum - rightSum;

        // If the number of '?' differs by an odd amount,
        // Alice can always force an unequal sum.
        if (diffQ % 2 != 0) {
            return true;
        }

        // Bob can win only if the existing difference
        // can be exactly compensated.
        if (diffSum * 2 == 9 * (rightQ - leftQ)) {
            return false;
        }

        return true;
    }
}