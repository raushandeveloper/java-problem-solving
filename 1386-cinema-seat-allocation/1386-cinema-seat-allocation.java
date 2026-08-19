import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        // Store reserved seats for only the rows that matter
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            // Use bits to represent reserved seats
            map.put(row, map.getOrDefault(row, 0) | (1 << col));
        }

        // All rows without reservations can have 2 groups
        long ans = (long) (n - map.size()) * 2;

        for (int mask : map.values()) {

            // Seats 2,3,4,5
            boolean left = (mask & ((1 << 2) | (1 << 3) |
                                    (1 << 4) | (1 << 5))) == 0;

            // Seats 6,7,8,9
            boolean right = (mask & ((1 << 6) | (1 << 7) |
                                     (1 << 8) | (1 << 9))) == 0;

            if (left && right) {
                // Both groups can sit
                ans += 2;
            } 
            else if (left || right) {
                // Only one side is available
                ans += 1;
            } 
            else {
                // Check middle block: 4,5,6,7
                boolean middle = (mask & ((1 << 4) | (1 << 5) |
                                          (1 << 6) | (1 << 7))) == 0;

                if (middle) {
                    ans += 1;
                }
            }
        }

        return (int) ans;
    }
}