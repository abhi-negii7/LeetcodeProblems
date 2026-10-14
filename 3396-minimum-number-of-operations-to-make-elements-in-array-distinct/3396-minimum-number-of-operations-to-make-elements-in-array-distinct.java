class Solution {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        int counter = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == 2)
                counter++;
        }

        if (counter == 0)
            return ans;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                ans++;

            map.put(nums[i], map.get(nums[i]) - 1);
            if (map.get(nums[i]) == 1)
                counter--;

            if (count == 2) {
                if (counter == 0) {
                    System.out.println(ans);
                    return ans;
                }
                count = 0;
            } else {
                count++;
            }
        }
        return ans;
    }
}