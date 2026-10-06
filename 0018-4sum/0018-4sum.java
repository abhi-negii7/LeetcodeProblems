class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        if (n < 4)
            return ans;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            // To remove duplicate
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;
                // To remove duplicate
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        Collections.sort(list);
                        ans.add(list);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }

            }

        }

        return ans;
    }
}