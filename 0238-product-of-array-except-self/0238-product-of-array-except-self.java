class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProd = new int[n];

        leftProd[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProd[i] = leftProd[i - 1] * nums[i - 1];
        }

        int rightProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            leftProd[i] = leftProd[i]*rightProd;
            rightProd = rightProd*nums[i];
        }

        return leftProd;
    }
}