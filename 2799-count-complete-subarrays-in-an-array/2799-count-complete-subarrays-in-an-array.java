class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length - 1;
        int maxSubArr = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;

        while (j < nums.length) {

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            int count = map.size();

            while (count == set.size()) {
                maxSubArr = maxSubArr + (n - j + 1);

                    int freq = map.get(nums[i]) - 1;
                    map.put(nums[i], freq);
                    if (freq == 0) {
                        map.remove(nums[i]);
                        count--;
                    }
                    i++;
            }
            j++;
        }
        return maxSubArr;
    }
}