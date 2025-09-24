class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen==0) return true;
        if (sLen > tLen)
            return false;

        int i = 0;
        for (int j = 0; j < tLen; j++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);

            if (ch1 == ch2) {
                i++;
                if (i >= sLen)
                    return true;
            }
        }
    return false;

    }
}