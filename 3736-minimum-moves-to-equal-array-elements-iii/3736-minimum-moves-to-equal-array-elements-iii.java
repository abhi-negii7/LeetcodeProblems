class Solution {
    public int minMoves(int[] nums) {

        int maxNum = Integer.MIN_VALUE;
        int totalMoves = 0;
        
        for(int num : nums){
            if(maxNum<num) maxNum = num;
        }

        for(int num : nums){
            totalMoves = totalMoves+(maxNum-num);
        }
        return totalMoves;
    }
}