class Solution {
    public int countCommas(int n) {
        
        int count = 0;

        for (int i = 1000; i <= n; i++) {
            
            if (i < 100000) {
                count++;
            } else if (i == 100000) {
                count++;
            }
        }

        return count;
    }
}