
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        // Option 1: Buy all items separately
        long separate = (long) need1 * cost1 + (long) need2 * cost2;

        // Option 2: Buy type 3 for common requirements
        int common = Math.min(need1, need2);

        long mixed = (long) common * costBoth;

        mixed += (long) (need1 - common) * cost1;
        mixed += (long) (need2 - common) * cost2;

        // Option 3: Buy only type 3 items
        long allBoth = (long) Math.max(need1, need2) * costBoth;

        return Math.min(separate, Math.min(mixed, allBoth));
    }
}
