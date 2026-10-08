class Solution {
    public int findLHS(int[] nums) {

        Arrays.sort(nums);

        int start = 0;
        int end = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (end < nums.length) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            while (map.size() > 2) {
                map.put(nums[start], map.get(nums[start]) - 1);
                if (map.get(nums[start]) == 0)
                    map.remove(nums[start]);
                start++;
            }
            if (map.size() == 2 && nums[end] - nums[start] == 1) {
                max = Math.max(max, end - start + 1);
            }
            end++;
        }
        return max;
    }
}