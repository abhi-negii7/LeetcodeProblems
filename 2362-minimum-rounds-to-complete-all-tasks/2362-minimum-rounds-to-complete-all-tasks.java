class Solution {
    public int minimumRounds(int[] tasks) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        for (int i : map.keySet()) {

            int val = map.get(i);
            if (val == 1)
                return -1;
            else {
                count += (val + 2) / 3;
            }
        }
        return count;
    }
}