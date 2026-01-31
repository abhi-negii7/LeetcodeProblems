class Solution {
    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0;

        for (int j = 0; j < fruits.length; j++) {

            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);

            if (map.size() > 2) {
                int freq = map.get(fruits[i]) - 1;
                map.put(fruits[i], freq);
                if (freq == 0)
                    map.remove(fruits[i]);
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;

    }
}