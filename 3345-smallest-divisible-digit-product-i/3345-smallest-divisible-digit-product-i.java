class Solution {
    public int smallestNumber(int n, int t) {
        int ans = -1;
        for (int i = n; i <= 100; i++) {
            ans = divisible(i, t);
            if (ans != -1)
                break;
        }
        return ans;
    }

    public static int divisible(int n, int t) {
        int prod = 1;
        int num = n;
        while (num != 0) {
            prod *= num % 10;
            num /= 10;
        }
        if (prod == 0 || (prod % t == 0)) {
            return n;
        }
        return -1;
    }
}