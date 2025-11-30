class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeatNum = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.isEmpty() && set.contains(i))
                repeatNum = i;
            set.add(i);
        }

        int missingNum = -1;
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missingNum = i;
                break;
            }
        }

        return new int[] { repeatNum, missingNum };
    }
}