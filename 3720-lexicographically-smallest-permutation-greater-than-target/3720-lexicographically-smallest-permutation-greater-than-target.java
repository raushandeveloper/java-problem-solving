import java.util.*;

class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();

        int[] freq = new int[26];

        // Count characters of s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Try changing the string from right to left
        for (int i = n - 1; i >= 0; i--) {

            int[] cnt = freq.clone();
            boolean possible = true;

            // Match target prefix [0 ... i-1]
            for (int j = 0; j < i; j++) {
                int x = target.charAt(j) - 'a';

                if (cnt[x] == 0) {
                    possible = false;
                    break;
                }

                cnt[x]--;
            }

            if (!possible) {
                continue;
            }

            // Find the smallest character greater than target[i]
            int cur = target.charAt(i) - 'a';

            for (int c = cur + 1; c < 26; c++) {

                if (cnt[c] > 0) {

                    StringBuilder ans = new StringBuilder();

                    // Same prefix as target
                    for (int j = 0; j < i; j++) {
                        ans.append(target.charAt(j));
                    }

                    // Make it strictly greater
                    ans.append((char) ('a' + c));
                    cnt[c]--;

                    // Add remaining characters in sorted order
                    for (int k = 0; k < 26; k++) {
                        while (cnt[k] > 0) {
                            ans.append((char) ('a' + k));
                            cnt[k]--;
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
    }
}