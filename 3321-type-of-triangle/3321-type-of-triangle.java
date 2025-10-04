class Solution {
    public String triangleType(int[] nums) {
        // It is not a triangle
        if (nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1]
                || nums[1] + nums[2] <= nums[0])
            return "none";
        // If all sides are equal
        if (nums[0] == nums[1] && nums[2] == nums[0])
            return "equilateral";
        // If all sides are not equal to each other
        if (nums[0] != nums[1] && nums[0] != nums[2] && nums[1] != nums[2])
            return "scalene";
        return "isosceles";
    }
}