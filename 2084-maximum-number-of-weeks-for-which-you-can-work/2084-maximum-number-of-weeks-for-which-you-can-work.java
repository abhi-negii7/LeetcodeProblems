class Solution {
    public long numberOfWeeks(int[] milestones) {
        long max = 0;
        long sum = 0;

        for(int i=0;i<milestones.length;i++){
            max = Math.max(max,milestones[i]);
            sum+=milestones[i];
        }

        if(sum-max+1>=max){
            return sum;
        }
        return 2*(sum-max)+1;
        
    }
}