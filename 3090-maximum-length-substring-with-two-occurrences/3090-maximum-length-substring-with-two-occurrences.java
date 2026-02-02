class Solution {
    public int maximumLengthSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 2) {
                char startCh = s.charAt(i);
                int freq = map.get(startCh) - 1;
                map.put(startCh, freq);
                if (freq == 0)
                    map.remove(startCh);
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);

        }
        return maxLen;
    }
}