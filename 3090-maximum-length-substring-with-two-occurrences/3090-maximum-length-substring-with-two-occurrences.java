class Solution {
    public int maximumLengthSubstring(String s) {

        int freq[] = new int[26];
        int i = 0;
        int maxLen = Integer.MIN_VALUE;

        for (int j = 0; j < s.length(); j++) {
            char currCh = s.charAt(j);
            freq[currCh - 'a']++;
            while (freq[currCh - 'a'] > 2) {
                char prevCh = s.charAt(i);
                freq[prevCh - 'a']--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}