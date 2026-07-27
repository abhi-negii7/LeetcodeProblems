class Solution {
    public int maxProduct(int[] nums) {
        
        int larg = nums[0]-1;
        int secLarg = Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++){
            if(larg<=nums[i]-1){
                secLarg = larg;
                larg = nums[i]-1;
            }
            else if(secLarg<nums[i]-1){
                secLarg = nums[i]-1;
            }
        }
        return larg*secLarg;
    }
}