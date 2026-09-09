class Solution {
    public long countCommas(long n) {
        long total = 0;
        long low = 1;
        long high = 9;
        int d = 1;
        
        while (low <= n) {
            long actualHigh = Math.min(high, n);
            long count = actualHigh - low + 1;
            long commas = (d - 1) / 3;
            total += count * commas;
            
            d++;
            low = high + 1;
            high = high * 10 + 9;
        }
        
        return total;
    }
}