class Solution {
    public long[] sumOfThree(long num) {
        
       if(num%3==0){
        long mid = num/3;
        return new long[]{mid-1,mid,mid+1};
       }
        return new long[]{};
    }
}