class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];

        for (int stone : stones) {
            cnt[stone % 3]++;
        }

        // Stones divisible by 3 don't change the sum,
        // so they only affect the number of moves.
        if (cnt[0] % 2 == 0) {
            return cnt[1] > 0 && cnt[2] > 0;
        }

        // Odd number of 0-mod-3 stones
        return Math.abs(cnt[1] - cnt[2]) > 2;
    }
}