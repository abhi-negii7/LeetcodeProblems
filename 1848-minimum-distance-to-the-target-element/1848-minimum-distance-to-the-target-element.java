class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){

            if(target==nums[i]){
                minValue=Math.min(minValue,Math.abs(i-start));
            }
        }
        return minValue;
    }
}