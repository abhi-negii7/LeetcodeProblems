class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return helper(nums, k) - helper(nums, k - 1);
    }

    public int helper(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSub = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (map.size() > k) {
                int freq = map.get(nums[i]) - 1;
                map.put(nums[i], freq);
                if (freq == 0)
                    map.remove(nums[i]);
                i++;
            }

            maxSub += (j - i + 1);
        }
        return maxSub;
    }
}