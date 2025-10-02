class Solution {
    public int partitionString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.size() != 0 && map.containsKey(ch)) {
                map.clear();
                count++;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        if (map.size() > 0)
            count++;
        return count;
    }
}