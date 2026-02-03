class Solution {
    public boolean isTrionic(int[] nums) {
        int i;
        boolean flag = false;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1])
                break;
            else
                flag = true;
        }
        boolean flag1 = false;
        while (i < nums.length) {
            if (nums[i] >= nums[i - 1])
                break;
            else
                flag1 = true;
            i++;
        }
        boolean flag2 = false;
        while (i < nums.length) {
            if (nums[i] <= nums[i - 1])
                break;
            else
                flag2 = true;
            i++;
        }

        if (i >= nums.length && flag && flag1 && flag2)
            return true;
        return false;
    }
}