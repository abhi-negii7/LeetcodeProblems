class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;
        List<List<Integer>> ansList = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {

            int j = n - 1;
            int mid = i + 1;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            while (mid < j) {
                int sum = nums[i] + nums[j] + nums[mid];
                if (sum == 0) {
                    ansList.add(Arrays.asList(nums[i], nums[mid], nums[j]));
                    mid++;
                    j--;
                    while (mid < j && nums[mid] == nums[mid - 1])
                        mid++;

                    while (mid < j && nums[j] == nums[j + 1])
                        j--;
                } else if (sum < 0)
                    mid++;
                else
                    j--;
            }
        }
        return ansList;
    }
}