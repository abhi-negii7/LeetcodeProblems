class Solution {
    public int maxProduct(int n) {
        int larg = Integer.MIN_VALUE;
        int secLarg = Integer.MIN_VALUE;

        while (n != 0) {
            int rem = n % 10;
            if (larg < rem) {
                secLarg = larg;
                larg = rem;
            } else if (secLarg < rem) {
                secLarg = rem;
            }
            n /= 10;
        }
        return larg * secLarg;
    }
}