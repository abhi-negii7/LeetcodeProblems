class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long maxSum = 0;
        long sum = 0;
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            // add the value of j to sum
            sum += nums[j];
            // add the value of j to map
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            // window size equal to k
            if (j - i + 1 == k) {

                // if map Size equal k only then update maxSum
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, sum);
                }

                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0)
                    map.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return maxSum;
    }
}