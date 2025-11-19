class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int idx = 0;
        int second = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest){
                second = largest;
                largest = nums[i];
                idx = i;
            }
            if (second < nums[i] && largest!=nums[i])
                second = nums[i];
        }

        if(second*2>largest) return -1;
        return idx;
    }
}