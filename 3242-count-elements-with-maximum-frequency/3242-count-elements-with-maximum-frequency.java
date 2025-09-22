class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        // freq store in map
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int count = 0;

        for (int i : map.keySet()) {
            if (maxFreq < map.get(i)) {
                maxFreq = map.get(i);
                count = 1;
            } else if (maxFreq == map.get(i))
                count++;
        }
        return count * maxFreq;

    }
}