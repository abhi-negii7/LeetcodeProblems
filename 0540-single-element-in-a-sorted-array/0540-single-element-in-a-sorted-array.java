class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        // if nums have single element or first element is single
        if (n == 1 || nums[0] != nums[1])
            return nums[0];

        // if last element is single
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // mid element is single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];

            // Eliminate the left side 
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || 
            (mid % 2 == 0 && nums[mid] == nums[mid + 1]))
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;
    }
}