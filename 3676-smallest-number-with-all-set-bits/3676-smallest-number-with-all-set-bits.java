class Solution {
    public int smallestNumber(int n) {

        double res = 0;
        double power = 0;
        while (n != 0) {

            res += Math.pow(2, power);
            power++;
            n = n >> 1;
        }
        return (int) res;
    }
}