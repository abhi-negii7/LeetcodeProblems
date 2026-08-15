class Solution {
    public int majorityElement(int[] nums) {
        int ele = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                ele = nums[i];
                count++;
            } else if (nums[i] == ele)
                count++;
            else count--;
        }
        int countOcc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ele == nums[i])
                countOcc++;
        }
        if (countOcc > nums.length / 2)
            return ele;
        return -1;
    }
}