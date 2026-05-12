class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=nums.length-1;i>=0;i--){
            int currNum = nums[i];
            while(currNum!=0){
                list.add(currNum%10);
                currNum/=10;
            }
        }

        int[] ansArr = new int[list.size()];

        for(int i=0;i<list.size();i++){
            ansArr[list.size()-i-1]=list.get(i);
        }

        return ansArr;
    }
}