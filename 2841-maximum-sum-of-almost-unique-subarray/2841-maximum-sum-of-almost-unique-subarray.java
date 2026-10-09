class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        long sum = 0;
        long max = 0;

        while (end < nums.size()) {
            map.put(nums.get(end), map.getOrDefault(nums.get(end), 0) + 1);
            sum += nums.get(end);
            while (end - start + 1 > k) {
                sum -= nums.get(start);
                map.put(nums.get(start), map.get(nums.get(start)) - 1);
                if (map.get(nums.get(start)) == 0)
                    map.remove(nums.get(start));
                start++;
            }
            if ((end - start + 1) == k) {
                if (map.size() >= m) {
                    max = Math.max(max, sum);
                }
            }
            end++;

        }
        return max;
    }
}