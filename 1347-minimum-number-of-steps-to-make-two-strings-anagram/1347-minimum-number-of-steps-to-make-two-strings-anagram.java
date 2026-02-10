class Solution {
    public int minSteps(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        int replaceCh = 0;

        for (char ch : map1.keySet()) {
            if (!map2.containsKey(ch)) {
                replaceCh += map1.get(ch);
            } else if (map1.get(ch) > map2.get(ch)) {
                replaceCh += map1.get(ch) - map2.get(ch);
            }
        }

        return replaceCh;

    }
}