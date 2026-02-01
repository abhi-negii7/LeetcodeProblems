class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int n = nums.length;
        int[] nextOdd = new int[n];
        nextOdd[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] % 2 != 0)
                nextOdd[i] = i + 1;
            else
                nextOdd[i] = nextOdd[i + 1];
        }

        int countOdd = 0;
        int totalSub = 0;
        int l = 0;
        for (int r = 0; r < n; r++) {

            if (nums[r] % 2 != 0)
                countOdd++;
            while (countOdd == k) {
                totalSub = totalSub + (nextOdd[r] - r);
                if (nums[l] % 2 != 0)
                    countOdd--;
                l++;
            }
        }
        return totalSub;
    }
}