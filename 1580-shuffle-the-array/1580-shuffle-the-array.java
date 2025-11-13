class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ansArr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {

            ansArr[j] = nums[i];
            j++;
            if (n + i< nums.length) {
                ansArr[j] = nums[n + i];
                j++;
            }
        }
        return ansArr;
    }
}