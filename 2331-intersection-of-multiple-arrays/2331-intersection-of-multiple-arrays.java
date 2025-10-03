class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        List<Integer> list =new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);
            }
        }

        for(int i : map.keySet()){
            if(map.get(i)==nums.length)
            list.add(i);
        }

        Collections.sort(list);
        return list;

    }
}