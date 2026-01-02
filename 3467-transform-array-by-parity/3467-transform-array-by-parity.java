class Solution {
    public int[] transformArray(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0)
                nums[i++] = 0;
        }
        while (i < nums.length) {
            nums[i] = 1;
            i++;
        }
        return nums;
    }
}