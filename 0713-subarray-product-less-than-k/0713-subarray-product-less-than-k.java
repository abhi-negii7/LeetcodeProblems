class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int start = 0;
        int end = 0;
        int count=0;
        long prod = 1;

        while(end<nums.length){
            prod*=nums[end];

            while(end>=start && prod>=k){
                prod=prod/nums[start];
                start++;
            }
            count = count+(end-start+1);
            end++;
        }
        return count;
    }
}