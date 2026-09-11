import java.util.HashSet;
import java.util.Set;

class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; // leading zero allowed nahi

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 == 0) { // last digit even hona chahiye
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        seen.add(num);
                    }
                }
            }
        }

        return seen.size();
    }
}