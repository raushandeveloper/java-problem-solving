class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int product = getProduct(n);
            
            if (product % t == 0) {
                return n;
            }
            
            n++;
        }
    }
    
    private int getProduct(int num) {
        int product = 1;
        
        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }
        
        return product;
    }
}