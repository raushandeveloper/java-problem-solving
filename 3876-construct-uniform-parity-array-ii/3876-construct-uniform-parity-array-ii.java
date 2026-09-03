class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasOdd = false;
        boolean hasEven = false;

        for (int x : nums1) {
            if (x % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // All elements already have same parity
        if (!hasOdd || !hasEven) {
            return true;
        }

        // Mixed parity:
        // Check if we can make everything odd.
        int min = Integer.MAX_VALUE;

        for (int x : nums1) {
            min = Math.min(min, x);
        }

        for (int x : nums1) {
            if (x % 2 == 0) {
                // Need an odd smaller element to make x - odd = odd
                if (min < x && min % 2 != 0) {
                    continue;
                }

                // Search for any smaller odd element
                boolean possible = false;

                for (int y : nums1) {
                    if (y < x && y % 2 != 0) {
                        possible = true;
                        break;
                    }
                }

                if (!possible) {
                    return false;
                }
            }
        }

        return true;
    }
}