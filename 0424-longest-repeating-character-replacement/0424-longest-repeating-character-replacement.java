class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int conv = 0;
        int maxFreq = 0;
        char maxFreqCh = 'a';

        int i = 0;
        for (int j = 0; j < s.length(); j++) {

            char currCh = s.charAt(j);
            map.put(currCh, map.getOrDefault(currCh, 0) + 1);
            int subArrayLen = j - i + 1;
            if (maxFreq <= map.get(currCh)) {
                maxFreq = map.get(currCh);
                maxFreqCh = currCh;
            }

            conv = subArrayLen - maxFreq;
            if (conv > k) {
                if (s.charAt(i) == maxFreqCh) {
                    maxFreq--;
                }
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}