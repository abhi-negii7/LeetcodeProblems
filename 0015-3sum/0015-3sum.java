class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(map.containsKey(-sum) && map.get(-sum)>i && map.get(-sum)>j){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[map.get(-sum)]);
                    Collections.sort(list);
                    if(!set.contains(list)){
                        set.add(list);
                        ans.add(list);
                    }
                }
                sum-=nums[j];
            }
            sum=0;

        }
        return ans;
    }
}