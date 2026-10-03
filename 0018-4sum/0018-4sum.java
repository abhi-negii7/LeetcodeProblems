class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        Set<Long> valueSet = new HashSet<>();

        if (n < 4)
            return new ArrayList<>(set);

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int x = j + 1; x < n; x++) {
                    long sum = (long)nums[i] + nums[j] + nums[x];
                    long needValue = target - sum;

                    if ((!valueSet.isEmpty()) && valueSet.contains(needValue)) {
                        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[x], (int)needValue));
                        Collections.sort(list);
                        set.add(list);

                    }
                    valueSet.add((long)nums[x]);
                }
                valueSet.clear();
            }
        }

        return new ArrayList<>(set);
    }
}