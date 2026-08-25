class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple=k;
        while(isInArray(nums,multiple)){
            multiple+=k;
        }
        return multiple;
    }
    public boolean isInArray(int nums[],int multiple){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==multiple) return true;
        }
        return false;
    }
}