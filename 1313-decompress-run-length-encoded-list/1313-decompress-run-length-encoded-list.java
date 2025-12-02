class Solution {
    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            int j = 1;
            while (j <= freq) {
                list.add(val);
                j++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}