class Solution {
    public double myPow(double x, int n) {
        if (x==0) return 0;
        if (n==0) return 1;
        
        long N = Math.abs(n);
        if (n<0) x = 1/x;

        double result = 1;
        double currentProduct = x;

        while (N > 0) {
            if (N%2==1) result *= currentProduct;
            currentProduct *= currentProduct;
            N /= 2;
        }

        return result;
    }
}
