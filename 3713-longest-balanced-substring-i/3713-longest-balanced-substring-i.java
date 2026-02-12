class Solution {
    public int longestBalanced(String s) {

        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch[] = new int[26];
            int freq = -1;
            for (int j = i; j < s.length(); j++) {
                char currCh = s.charAt(j);
                ch[currCh - 'a']++;
                if (isValid(ch, freq)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public boolean isValid(int ch[], int freq) {
        for (int i = 0; i < ch.length; i++) {
            if (freq == -1 && ch[i] > 0) {
                freq = ch[i];
            } else if (ch[i] > 0 && freq != ch[i]) {
                return false;
            }
        }
        return true;
    }
}