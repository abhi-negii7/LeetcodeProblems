class Solution {
    public int maximumLengthSubstring(String s) {

        int maxLen = 0;
        int freqArr[] = new int[26];
        int i = 0;
        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);
            freqArr[ch - 'a']++;
            while (freqArr[ch - 'a'] > 2) {
                char startCh = s.charAt(i);
                freqArr[startCh - 'a']--;
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}