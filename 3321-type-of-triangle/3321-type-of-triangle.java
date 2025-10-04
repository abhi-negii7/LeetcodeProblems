class Solution {
    public String triangleType(int[] nums) {

        int a = nums[0], b = nums[1], c = nums[2];

        // Property of triangle
        if (a + b <= c || a + c <= b || b + c <= a)
            return "none";

        // All side are equal
        else if (a == b && b == c)
            return "equilateral";

        // Any two sides are equal
        else if (a == b || a == c || b == c)
            return "isosceles";

        return "scalene";
    }
}