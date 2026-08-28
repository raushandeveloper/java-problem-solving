class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Check whether a palindrome is possible.
        int odd = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                if (odd != -1) {
                    return "";
                }
                odd = i;
            }
        }

        int halfLen = n / 2;

        // Frequency of characters in the left half.
        int[] half = new int[26];

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
        }

        /*
         * First try to construct a left half that is exactly
         * equal to target's left half.
         *
         * If the resulting palindrome is > target, it is the answer.
         */
        int[] remaining = half.clone();
        boolean possible = true;

        for (int i = 0; i < halfLen; i++) {
            int c = target.charAt(i) - 'a';

            if (remaining[c] == 0) {
                possible = false;
                break;
            }

            remaining[c]--;
        }

        if (possible) {
            String left = target.substring(0, halfLen);

            String palindrome = buildPalindrome(left, odd, n);

            if (palindrome.compareTo(target) > 0) {
                return palindrome;
            }
        }

        /*
         * We couldn't use the exact target prefix to get an answer.
         *
         * Find the RIGHTMOST position where we can make the
         * left half larger than target.
         */
        for (int pos = halfLen - 1; pos >= 0; pos--) {

            remaining = half.clone();

            // Match target's prefix before 'pos'.
            boolean ok = true;

            for (int i = 0; i < pos; i++) {
                int c = target.charAt(i) - 'a';

                if (remaining[c] == 0) {
                    ok = false;
                    break;
                }

                remaining[c]--;
            }

            if (!ok) {
                continue;
            }

            int targetChar = target.charAt(pos) - 'a';

            /*
             * Increase this position by the smallest possible
             * character.
             */
            for (int c = targetChar + 1; c < 26; c++) {

                if (remaining[c] == 0) {
                    continue;
                }

                remaining[c]--;

                StringBuilder left = new StringBuilder();

                // Same prefix as target.
                for (int i = 0; i < pos; i++) {
                    left.append(target.charAt(i));
                }

                // Make this position larger.
                left.append((char) ('a' + c));

                // Fill the rest with smallest possible characters.
                for (int x = 0; x < 26; x++) {
                    while (remaining[x] > 0) {
                        left.append((char) ('a' + x));
                        remaining[x]--;
                    }
                }

                return buildPalindrome(left.toString(), odd, n);
            }
        }

        return "";
    }

    private String buildPalindrome(String left, int odd, int n) {
        StringBuilder ans = new StringBuilder();

        ans.append(left);

        // Middle character for odd length.
        if (n % 2 == 1) {
            ans.append((char) ('a' + odd));
        }

        // Reverse of left half.
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}