class Solution {
    public int maxProduct(int[] nums) {
        
        int larg = nums[0];
        int secLarg = Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++){
            if(larg<=nums[i]){
                secLarg = larg;
                larg = nums[i];
            }
            else if(secLarg<nums[i]){
                secLarg = nums[i];
            }
        }
        return (larg-1)*(secLarg-1);
    }
}