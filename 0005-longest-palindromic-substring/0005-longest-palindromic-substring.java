class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        int startIdx = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s,i, j) && maxLen < j - i + 1) {
                    maxLen = j - i + 1;
                    startIdx = i;
                }
            }
        }
        if (maxLen == 0)
            return "";
        return s.substring(startIdx, startIdx + maxLen);
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
}