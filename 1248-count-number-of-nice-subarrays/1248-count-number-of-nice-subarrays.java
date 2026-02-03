class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return smallerEqualSub(nums,k) - smallerEqualSub(nums,k-1);
    }

    public int smallerEqualSub(int[] nums, int k) {

        int oddNo = 0;
        int maxSub = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] % 2 != 0) {
                oddNo++;
            }
            while (oddNo > k) {
                if (nums[i] % 2 != 0)
                    oddNo--;
                i++;
            }

            maxSub += (j - i + 1);

        }
        return maxSub;
    }
}